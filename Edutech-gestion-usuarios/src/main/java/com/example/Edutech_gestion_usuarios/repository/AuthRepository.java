package com.example.Edutech_gestion_usuarios.repository;

import com.example.Edutech_gestion_usuarios.model.Auth;
import com.example.Edutech_gestion_usuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<Auth, Long> {
    Usuario findByEmailAndPassword(String email, String password);
}
