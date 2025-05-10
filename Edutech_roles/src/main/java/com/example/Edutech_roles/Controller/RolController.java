package com.example.Edutech_roles.Controller;

import com.example.Edutech_roles.Model.Rol;
import com.example.Edutech_roles.Repository.RolRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rol")
public class RolController {

    private RolRepository repo;

    public RolController(RolRepository repo) {
        this.repo = repo;
    }
    @GetMapping
    public List<Rol> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rol>getById(@PathVariable Long id) {
        return repo.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Rol create(@RequestBody Rol rol) {
        return repo.save(rol);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Rol> delete(@PathVariable Long id) {
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
