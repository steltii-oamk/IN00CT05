package com.jk.aweseome;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonRestController {

    @PostMapping("person")
    public String addPerson(@RequestParam String fname, @RequestParam String age){


        return "Hello " + fname + ". Your age is "+ age;

    }
}
