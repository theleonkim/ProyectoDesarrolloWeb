package com.ProyectoRE.service;

import com.ProyectoRE.domain.Propiedad;
import java.util.List;

public interface PropiedadService {

    List<Propiedad> getPropiedades(boolean estado);

    void save(Propiedad propiedad);

    Propiedad getPropiedadById(int id); // Método para obtener propiedad por ID
}
