package com.example.jwt_token_creation.services;

import com.example.jwt_token_creation.models.Randomizer;
import com.example.jwt_token_creation.repositories.RandomizerRepository;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomizerService {


    public Long generateRandomNumber(){

        Random random = new Random();
        return random.nextLong(Long.MAX_VALUE);

    }
}
