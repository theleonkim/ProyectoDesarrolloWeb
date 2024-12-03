package com.prueba_a.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity 
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int idCita;
    private String nombre;
    private int asistentes;
    private String fechaCita;
    private String imagen;

    public Cita() {}

    public Cita(int idCita, String nombre, int asistentes, String fechaCita, String imagen) {
        this.idCita = idCita;
        this.nombre = nombre;
        this.asistentes = asistentes;
        this.fechaCita = fechaCita;
        this.imagen = imagen;
    }
}


