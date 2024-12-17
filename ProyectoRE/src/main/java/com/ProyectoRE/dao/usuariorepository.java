package com.ProyectoRE.dao;

import com.ProyectoRE.domain.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    // Método para buscar un usuario por correo
    Optional<Usuario> findByCorreo(String correo);
}
