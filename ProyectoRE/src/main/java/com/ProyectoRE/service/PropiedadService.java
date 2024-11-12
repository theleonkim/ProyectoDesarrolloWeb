package com.ProyectoRE.service;

import com.ProyectoRE.domain.Propiedad;
import java.util.List;

public interface PropiedadService {
    // Se obtiene un listado de propieades en un List
    public List<Propiedad> getPropiedades(boolean estado);
    
   // Se obtiene una propiedad, a partir del id de una propiead
    public Propiedad getPropiedad(Propiedad propieadad);
    
}
