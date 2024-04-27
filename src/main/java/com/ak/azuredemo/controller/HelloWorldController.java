package com.ak.azuredemo.controller;


import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloWorldController {

    @GetMapping("/welcome")
    public ResponseEntity<String> helloWorld(String name) {

        ResponseEntity<String> rsp =  ResponseEntity.status(HttpStatusCode.valueOf(200)).body("Hello-" + name);

        return rsp;
    }
}
