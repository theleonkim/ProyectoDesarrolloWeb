package com.ProyectoRE.service;

import com.ProyectoRE.domain.Favorito;
import com.ProyectoRE.domain.Usuario;
import java.util.List;

public interface FavoritoService {
    
    public void save(Favorito favorito);
    
    public void delete(Favorito favorito);
    
    public List<Favorito> findAllByUsuario(Usuario usuario);
    
}
