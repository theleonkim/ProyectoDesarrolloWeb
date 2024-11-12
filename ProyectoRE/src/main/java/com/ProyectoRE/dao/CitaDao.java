
package com.ProyectoRE.dao;

import com.ProyectoRE.domain.Cita;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CitaDao extends JpaRepository<Cita, Integer> {
    
}
