package com.application.pizzas;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class PizzasController {

    @RequestMapping("/teso")
    public String hi() {
        return new String("Hi from VS Code - You are amazing George");
    }
    
    
}
