
package com.ProyectoRE.dao;

import com.ProyectoRE.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioDao extends JpaRepository<Usuario, Integer> { 
    
}
