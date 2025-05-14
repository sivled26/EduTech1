package com.example.Edutech_gestion_usuarios.controller;

import com.example.Edutech_gestion_usuarios.model.Usuario;
import com.example.Edutech_gestion_usuarios.repository.UsuarioRepository;
import com.example.Edutech_gestion_usuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public ResponseEntity<List<Usuario>> listar(){
        List<Usuario> usuarios = usuarioService.findAll();
        if (usuarios.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        System.out.println(usuarios);
        return ResponseEntity.ok(usuarios);
    }

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
