package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that returns "Hello World"
    @GetMapping("/")
    public String sayHello() {
    return "Hello World!";
}

    // expose a new endpoint for "workout"

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a boggy blaggart";
    }

    // expose a new endpoint for "bog"
    @GetMapping("/bog")
    public String getBog() {
        return "Hee bogger!";
    }
}
