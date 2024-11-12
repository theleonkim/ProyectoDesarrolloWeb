
package com.ProyectoRE.dao;

import com.ProyectoRE.domain.Propiedad;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PropiedadDao extends JpaRepository<Propiedad, Long> {
    
}
