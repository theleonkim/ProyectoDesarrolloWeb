
package com.ProyectoRE.service;

import com.ProyectoRE.domain.Cita;
import java.util.List;


public interface CitaService {
    
    public List<Cita> getCitas();
    
    public Cita getCita(Cita cita);
    
    public void save(Cita cita);
    
    public void delete(Cita cita);
   
    
}
