package com.victorexample.springboot.archspringboot.controller;

import com.victorexample.springboot.archspringboot.utils.RedisConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Victor Olvera
 */
@RestController
public class Test {

    @Autowired
    RedisConfiguration redisConfiguration;

    @GetMapping("/test")
    public String test(){
        return "Hello dogs :) ... and cats";
    }

    @GetMapping("/redis")
    public RedisConfiguration redisConfig(){
        return redisConfiguration;
    }
}
