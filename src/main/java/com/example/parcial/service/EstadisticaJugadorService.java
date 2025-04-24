package com.example.parcial.service;

import com.example.parcial.model.EstadisticasJugador;
import com.example.parcial.repository.EstadisticaJugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadisticaJugadorService {
    @Autowired
    private EstadisticaJugadorRepository repository;

    public List<EstadisticasJugador> findAll() { return repository.findAll(); }
    public EstadisticasJugador findById(Long id) { return repository.findById(id).orElse(null); }
    public EstadisticasJugador save(EstadisticasJugador estadistica) { return repository.save(estadistica); }
    public void delete(Long id) { repository.deleteById(id); }
}
