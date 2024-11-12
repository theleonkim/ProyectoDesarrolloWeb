package com.ProyectoRE.service;

import com.ProyectoRE.domain.TipoPropiedad;
import java.util.List;

public interface TipoPropiedadService {
    // Se obtiene un listado de propieadades en un List
    public List<TipoPropiedad> getTipoPropiedades(boolean estado);
    
}
