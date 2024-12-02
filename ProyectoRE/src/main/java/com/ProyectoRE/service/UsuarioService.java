package com.ProyectoRE.service;

import com.ProyectoRE.domain.Usuario;
import java.util.List;

public interface UsuarioService {

    List<Usuario> getUsuarios();

    Usuario getUsuario(Usuario usuario);

    void save(Usuario usuario);
}
