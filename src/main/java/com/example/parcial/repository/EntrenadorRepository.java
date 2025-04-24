package com.example.parcial.repository;

import com.example.parcial.model.Entrenador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EntrenadorRepository extends JpaRepository<Entrenador, Long> {

}
