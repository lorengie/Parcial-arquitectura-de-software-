package com.example.parcial.repository;

import com.example.parcial.model.EstadisticasJugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadisticaJugadorRepository extends JpaRepository<EstadisticasJugador, Long> {
}
