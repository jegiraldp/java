package com.application.pizzas.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class PizzasController {

    @RequestMapping("/hi")
    public String hi() {
        return new String(" You did it");
    }
    
    
}
