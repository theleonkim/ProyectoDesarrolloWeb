
package com.ProyectoRE.service.impl;

import com.ProyectoRE.dao.UsuarioDao;
import com.ProyectoRE.domain.Usuario;
import com.ProyectoRE.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    public List<Usuario> getUsuarios() {
        return usuarioDao.findAll();
    }

    @Override
    public Usuario getUsuario(Usuario usuario) {
        return usuarioDao.findById(usuario.getIdUsuario()).orElse(null);
    }

    @Override
    public void save(Usuario usuario) {
        usuarioDao.save(usuario);
    }
}

