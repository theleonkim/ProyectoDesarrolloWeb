package com.ProyectoRE.service.impl;

import com.ProyectoRE.dao.PropiedadDao;
import com.ProyectoRE.domain.Propiedad;
import com.ProyectoRE.service.PropiedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropiedadServiceImpl implements PropiedadService {

    @Autowired
    private PropiedadDao propiedadDao;

    @Override
    public List<Propiedad> getPropiedades(boolean estado) {
        return propiedadDao.findAll().stream()
                           .filter(propiedad -> propiedad.isEstado() == estado)
                           .toList();
    }

    @Override
    public void save(Propiedad propiedad) {
        propiedadDao.save(propiedad);
    }

    @Override
    public Propiedad getPropiedadById(int id) {
        return propiedadDao.findById(id).orElse(null); // Buscar propiedad por ID
    }
}
