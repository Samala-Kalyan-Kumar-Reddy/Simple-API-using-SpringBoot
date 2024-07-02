package com.PandaPantry.services;

import com.PandaPantry.models.products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<products,Integer> {


}
