package com.example.parcial.service;

import com.example.parcial.model.Partido;
import com.example.parcial.repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidoService {
    @Autowired
    private PartidoRepository repository;

    public List<Partido> findAll() { return repository.findAll(); }
    public Partido findById(Long id) { return repository.findById(id).orElse(null); }
    public Partido save(Partido partido) { return repository.save(partido); }
    public void delete(Long id) { repository.deleteById(id); }

    public List<Object[]> resultadosConNombres() {
        return repository.obtenerResultadosConNombres();
    }

    public int totalGolesPorEquipo(Long equipoId) {
        return repository.obtenerTotalGolesEquipo(equipoId);
    }
}
