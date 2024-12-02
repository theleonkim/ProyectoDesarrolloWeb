package com.ProyectoRE.service;

import com.ProyectoRE.domain.Cita;
import java.util.List;

public interface CitaService {

    List<Cita> getCitas();

    void save(Cita cita);

    Cita findById(int id);

    void delete(Cita cita);
}
