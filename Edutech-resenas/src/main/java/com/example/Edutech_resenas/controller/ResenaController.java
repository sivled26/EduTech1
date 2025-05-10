package com.example.Edutech_resenas.controller;

import com.example.Edutech_resenas.model.Resena;
import com.example.Edutech_resenas.service.ResenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/resenas")
public class ResenaController {

    @Autowired
    private ResenaService resenaService;

    @GetMapping
    public ResponseEntity<List<Resena>> listar(){
        List<Resena> resenas = resenaService.findAll();
        if (resenas.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        System.out.println(resenas);
        return ResponseEntity.ok(resenas);
    }
}
