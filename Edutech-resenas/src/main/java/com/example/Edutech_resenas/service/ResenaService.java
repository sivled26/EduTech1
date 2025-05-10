package com.example.Edutech_resenas.service;

import com.example.Edutech_resenas.model.Resena;
import com.example.Edutech_resenas.repository.ResenaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ResenaService {

    @Autowired
    public ResenaRepository resenaRepository;

    public List<Resena> findAll(){
        return resenaRepository.findAll();
    }

    public Resena findById(long id){
        return resenaRepository.findById(id).get();
    }

    public Resena save(Resena resena){
        return resenaRepository.save(resena);
    }

    public void delete(Long id){
        resenaRepository.deleteById(id);
    }
}
