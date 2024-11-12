package com.ProyectoRE.dao;

import com.ProyectoRE.domain.Resenas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResenasDao extends JpaRepository<Resenas, Integer> {

    // Método personalizado para buscar reseñas por estado
    List<Resenas> findByEstado(boolean estado);
}
