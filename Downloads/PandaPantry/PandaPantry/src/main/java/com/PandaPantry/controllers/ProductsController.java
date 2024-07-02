package com.PandaPantry.controllers;

import com.PandaPantry.models.products;
import com.PandaPantry.models.products;
import com.PandaPantry.services.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Correcting the import
import org.springframework.web.bind.annotation.GetMapping; // Added to map GET requests
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductsController {

    private final ProductsRepository repo;

    @Autowired
    public ProductsController(ProductsRepository repo) {
        this.repo = repo;
    }

    @GetMapping({"","/"})
    public String showProductList(Model model) {
        List<products> products = repo.findAll();
        model.addAttribute("products", products);
        return "products/index";
    }
}
