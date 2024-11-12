package com.ProyectoRE.service.impl;

import com.ProyectoRE.domain.Favorito;
import com.ProyectoRE.domain.Usuario;
import com.ProyectoRE.dao.FavoritoDao;
import com.ProyectoRE.service.FavoritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritoServiceImpl implements FavoritoService {

    @Autowired
    private FavoritoDao favoritoDao;

    @Override
    public void save(Favorito favorito) {
        favoritoDao.save(favorito);
    }

    @Override
    public void delete(Favorito favorito) {
        favoritoDao.delete(favorito);
    }

    
    }
}
