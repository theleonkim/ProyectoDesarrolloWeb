
package com.ProyectoRE.service.impl;

import com.ProyectoRE.dao.TipoPropiedadDao;
import com.ProyectoRE.domain.TipoPropiedad;
import com.ProyectoRE.service.TipoPropiedadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoPropiedadServiceImpl implements TipoPropiedadService {
    
    @Autowired
    private TipoPropiedadDao tipoPropiedadDao;
    
    @Override
    public List<TipoPropiedad> getTipoPropiedades(boolean estado) {
        List<TipoPropiedad> lista = tipoPropiedadDao.findAll();
        if (estado) {
            lista.removeIf(e-> !e.isEstado());
        }
        return lista;
    }
    
    
}
