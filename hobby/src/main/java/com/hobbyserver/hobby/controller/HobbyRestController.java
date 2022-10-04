package com.hobbyserver.hobby.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping("app")
public class HobbyRestController {
    @GetMapping
    public ResponseEntity<String> getBase() {
        return new ResponseEntity<>("Hello!", HttpStatus.OK);
    }

    @GetMapping("suomi")
    public ResponseEntity<String> getSuomi() {
        return new ResponseEntity<>("Tervetuloa!", HttpStatus.OK);
    }
    
}
