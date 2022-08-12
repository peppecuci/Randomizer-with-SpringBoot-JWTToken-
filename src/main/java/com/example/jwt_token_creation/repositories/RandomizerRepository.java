package com.example.jwt_token_creation.repositories;

import com.example.jwt_token_creation.models.Randomizer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface RandomizerRepository extends CrudRepository<Randomizer, Long> {
}