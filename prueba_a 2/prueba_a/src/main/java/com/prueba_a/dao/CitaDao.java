package com.prueba_a.dao;

import com.prueba_a.domain.Cita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitaDao extends JpaRepository<Cita, Integer> {
    
}
