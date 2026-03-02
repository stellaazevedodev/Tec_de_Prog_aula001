package com.fatec.aula001.hello.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //classes anotadas com Rest Controller permite classe para HTTP
@RequestMapping("/hello") //permite usar requisitos HTTP (GET...)


public class HelloController {

    //criado o primeiro método "hello"
    @GetMapping
    public String hello(){
        return "Hello, Word!";
    }    
}

