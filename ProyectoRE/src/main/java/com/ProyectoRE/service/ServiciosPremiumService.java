package com.ProyectoRE.service;

import com.ProyectoRE.domain.ServiciosPremium;
import java.util.List;

public interface ServiciosPremiumService {
    
    // Se obtiene un listado de propieades en un List
    public List<ServiciosPremium> getServiciosPremium(boolean estado);
    
   // Se obtiene una propiedad, a partir del id de una propiead
    public ServiciosPremium getServiciosPremium(ServiciosPremium serviciosPremium);
    
}
