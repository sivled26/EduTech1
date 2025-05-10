package com.example.Edutech_roles.Service;

import com.example.Edutech_roles.Model.Rol;
import com.example.Edutech_roles.Repository.RolRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class RolService {


    private RolRepository repo;

    public RolService(RolRepository repo) {
        this.repo = repo;
    }
    public List<Rol> getAll() {
        return repo.findAll();
    }
    public Rol getById(Long id) {
        return repo.findById(id).get();
    }
    public Rol save(Rol rol) {
        return repo.save(rol);
    }
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
