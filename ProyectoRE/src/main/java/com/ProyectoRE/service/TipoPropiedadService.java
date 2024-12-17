package com.ProyectoRE.service;

import com.ProyectoRE.domain.TipoPropiedad;
import java.util.List;

public interface TipoPropiedadService {
    List<TipoPropiedad> obtenerTiposActivos();
    List<TipoPropiedad> getTipoPropiedades(boolean estado);

    TipoPropiedad getTipoPropiedadById(int id);
    void save(TipoPropiedad tipoPropiedad);
    void delete(int id);
}
