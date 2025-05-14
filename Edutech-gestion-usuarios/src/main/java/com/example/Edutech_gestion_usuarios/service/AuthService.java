package com.example.Edutech_gestion_usuarios.service;

import com.example.Edutech_gestion_usuarios.model.Usuario;
import com.example.Edutech_gestion_usuarios.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private AuthRepository authRepository;

    public Usuario login(String email, String password){
        return authRepository.findByEmailAndPassword(email, password);
    }
}
