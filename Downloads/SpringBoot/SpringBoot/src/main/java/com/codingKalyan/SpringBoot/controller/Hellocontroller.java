package com.codingKalyan.SpringBoot.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String Helloworld(){

        return "Hello, Kalyan";
    }

}
