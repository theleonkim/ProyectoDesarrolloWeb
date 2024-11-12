package com.ProyectoRE.service;

import com.ProyectoRE.domain.Usuario;
import java.util.List;


public interface UsuarioService {
    public List<Usuario> getUsuarios();
    
    public Usuario getUsuario(Usuario usuario);
    
    public void save(Usuario usuario);
    
}
