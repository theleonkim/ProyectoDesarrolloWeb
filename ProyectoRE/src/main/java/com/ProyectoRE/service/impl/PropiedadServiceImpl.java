
package com.ProyectoRE.service.impl;

import com.ProyectoRE.dao.PropiedadDao;
import com.ProyectoRE.domain.Propiedad;
import com.ProyectoRE.service.PropiedadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PropiedadServiceImpl implements PropiedadService {
    
    @Autowired
    private PropiedadDao propiedadDao;

    @Override
    public List<Propiedad> getPropiedades(boolean estado) {
        List<Propiedad> lista = propiedadDao.findAll();

        if (estado) {
            lista.removeIf(e -> !e.isEstado());
        }

        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Propiedad getPropiedad(Propiedad propiedad) {
        return propiedadDao.findById(propiedad.getIdPropiedad()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Propiedad propiedad) {
        propiedadDao.save(propiedad);
    }

}
