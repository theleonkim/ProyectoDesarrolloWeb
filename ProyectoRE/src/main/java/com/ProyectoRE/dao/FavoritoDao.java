
package com.ProyectoRE.dao;

import com.ProyectoRE.domain.Favorito;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FavoritoDao extends JpaRepository<Favorito, Integer> {
    
}
