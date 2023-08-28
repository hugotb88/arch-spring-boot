package com.victorexample.springboot.archspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Victor Olvera
 */
@RestController
public class HelloWorld {

    @GetMapping("/test")
    public String test(){
        return "Hello dogs :) ... and cats";
    }
}
