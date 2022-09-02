

package com.premasai.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping()
    public String fetchHelloWorld() {
        return "Welcome to Softmax Solutions";
    }
}
