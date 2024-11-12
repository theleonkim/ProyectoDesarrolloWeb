
package com.ProyectoRE.dao;

import com.ProyectoRE.domain.Favorito;
import com.ProyectoRE.domain.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FavoritoDao extends JpaRepository<Favorito, Integer> {
      List<Favorito> findByUsuario(Usuario usuario);
}
