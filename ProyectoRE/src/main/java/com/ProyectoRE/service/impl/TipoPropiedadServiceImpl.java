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

    // Obtener todas las propiedades, filtrando si 'estado' es true
    @Override
    public List<TipoPropiedad> getTipoPropiedades(boolean estado) {
        return estado
                ? tipoPropiedadDao.findAll()
                                  .stream()
                                  .filter(TipoPropiedad::getEstado)
                                  .toList()
                : tipoPropiedadDao.findAll();
    }

    // Eliminar una propiedad por ID
    @Override
    public void delete(int id) {
        tipoPropiedadDao.deleteById(id);
    }

    // Obtener propiedades activas directamente desde el repositorio
    @Override
    public List<TipoPropiedad> obtenerTiposActivos() {
        return tipoPropiedadDao.findByEstadoTrue();
    }

    // Obtener una propiedad específica por su ID
    @Override
    public TipoPropiedad getTipoPropiedadById(int id) {
        return tipoPropiedadDao.findById(id).orElse(null);
    }

    // Guardar o actualizar una propiedad
    @Override
    public void save(TipoPropiedad tipoPropiedad) {
        tipoPropiedadDao.save(tipoPropiedad);
    }
}
