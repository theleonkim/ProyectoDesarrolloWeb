package com.prueba_a.service;

import com.prueba_a.domain.Cita;
import java.util.List;
import java.util.Optional;

public interface CitaService {
    // metodo para guardar una cita 
    public void save(Cita cita);
    
    // metodo para encontrar una cita por su ID
    public Optional<Cita> findById(int idCita);
    
    // metodo para obtener todas las citas
    public List<Cita> findAll();
    
    // metodo para eliminar una cita por su ID
    public void deleteById(int idCita);
}



