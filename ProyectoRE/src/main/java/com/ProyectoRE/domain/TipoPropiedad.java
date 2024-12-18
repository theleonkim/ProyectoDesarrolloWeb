package com.ProyectoRE.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo_propiedad")
public class TipoPropiedad implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_propiedad")
    private int idTipoPropiedad;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "estado")  // Mapea la columna "estado" de la base de datos
    private boolean estado;

    // Constructor vacío
    public TipoPropiedad() {
    }

    // Constructor con parámetros
    public TipoPropiedad(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public boolean getEstado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
