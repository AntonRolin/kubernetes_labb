package com.example.kubernetes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by: Anton Rolin
 * Date: 16/09/2021
 * Time: 14:20
 * Project: kubernetes_labb
 * Copyright: MIT
 */
@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String helloWorld(){
        return "Hello, World!";
    }
}
