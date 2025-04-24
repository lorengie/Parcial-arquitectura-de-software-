package com.example.parcial.service;

import com.example.parcial.model.Equipo;
import com.example.parcial.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoService {
    @Autowired
    private EquipoRepository repository;

    public List<Equipo> findAll() {
        return repository.findAll();
    }

    public Equipo save(Equipo obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
    public Equipo findById(Long id) { return repository.findById(id).orElse(null); }

}
