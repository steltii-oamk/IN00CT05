package com.springharj2.harj2.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Harj2RestController {
    @GetMapping("home")
    public String getHome() {
        return "Hello!";
    }

    @GetMapping("product")
    public String getProduct() {
        return "Hello!";
    }
    
    @GetMapping("number/{num}/{num2}")
    public Integer getInfo(@PathVariable Integer num,@PathVariable Integer num2){
        return num+num2;
    }

    @PostMapping("user")
    public String jotain(){
        return "jotain";
    }
}
