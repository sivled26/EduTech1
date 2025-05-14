package com.example.Edutech_gestion_usuarios.controller;

import com.example.Edutech_gestion_usuarios.model.Usuario;
import com.example.Edutech_gestion_usuarios.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/v1/usuarios/login")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping
    public Usuario login(@RequestBody Map<String, String> datos){
        String email = datos.get("email");
        String pass  = datos.get("password");
        return authService.login(email, pass);
    }
}
