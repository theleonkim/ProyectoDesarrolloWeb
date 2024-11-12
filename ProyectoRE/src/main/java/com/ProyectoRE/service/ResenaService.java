
package com.ProyectoRE.service;

import com.ProyectoRE.domain.Resenas;
import java.util.List;



public interface ResenaService {

    // Método para obtener una lista de reseñas basadas en el estado
    List<Resenas> getResenas(boolean estado);

    // Método para obtener una reseña específica
    Resenas getResena(Resenas resena);

    // Método para guardar una reseña
    void save(Resenas resena);
}

