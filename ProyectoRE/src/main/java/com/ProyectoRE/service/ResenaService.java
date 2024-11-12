
package com.ProyectoRE.service;

import com.ProyectoRE.domain.Resenas;
import java.util.List;


public interface ResenaService {
    
   
    public List<Resenas> getResenas(boolean estado);
    
   
    public Resenas getResena(Resenas resena);
    
  
    public void save(Resenas resena);
    
    
}
