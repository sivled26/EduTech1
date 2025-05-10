package com.example.Edutech_resenas.repository;

import com.example.Edutech_resenas.model.Resena;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResenaRepository extends JpaRepository<Resena, Long> {
}
