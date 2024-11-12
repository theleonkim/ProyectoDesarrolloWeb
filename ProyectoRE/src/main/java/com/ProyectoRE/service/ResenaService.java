
package com.ProyectoRE.service;

import com.ProyectoRE.domain.Resenas;
import java.util.List;

/**
 *
 * @author Priscilla Rodríguez
 */
public interface ResenaService {
    public List<Resenas> getResenas();
    
    public void save(Resenas resena);
}
