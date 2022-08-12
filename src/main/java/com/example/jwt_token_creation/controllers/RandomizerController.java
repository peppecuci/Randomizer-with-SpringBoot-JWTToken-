package com.example.jwt_token_creation.controllers;


import com.example.jwt_token_creation.models.Randomizer;
import com.example.jwt_token_creation.services.RandomizerService;
import org.springframework.web.bind.annotation.*;

@RestController
public class RandomizerController {

    private final RandomizerService service;


    public RandomizerController(RandomizerService service) {
        this.service = service;
    }

    @PostMapping("/random")
    public Long getRandomNumber(){

        return service.generateRandomNumber();

    }


}
