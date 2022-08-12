package com.example.jwt_token_creation.services;

import com.example.jwt_token_creation.repositories.RandomizerRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final RandomizerRepository repository;
    private final PasswordEncoder passwordEncoder;

    public CustomUserDetailsServiceImpl(RandomizerRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("connexion impossible"));
    }

    public void create(UtilisateurCreateForm toCreate){

        Utilisateur utilisateur = toCreate.toEntity();
        utilisateur.setPassword(passwordEncoder.encode(utilisateur.getPassword()));
        repository.save( utilisateur);


    }

}