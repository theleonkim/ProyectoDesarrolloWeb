
package com.ProyectoRE.dao;

import com.ProyectoRE.domain.TipoPropiedad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TipoPropiedadDao extends JpaRepository<TipoPropiedad, Integer> {

    public List<TipoPropiedad> findByEstadoTrue();
    
}
