package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${chode.name}")
    private String chodeName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for new info
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Chode: " + chodeName + ", team name: " + teamName;
    }

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

