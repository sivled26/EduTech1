package com.example.Edutech_gestion_usuarios.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, length = 13, nullable = false)
    private String rut;

    @Column(nullable = false)
    private String nombres;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nombres='" + nombres + '\'' +
                ", rut='" + rut + '\'' +
                ", id=" + id +
                '}';
    }
}
