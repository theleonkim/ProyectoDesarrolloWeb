
package com.ProyectoRE.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;


@Data
@Entity
@Table(name="tipo_propiedad")
public class TipoPropiedad implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_tipo_propiedad")
    private int idTipoPropiedad;
    private String tipoPropiedad;
    private boolean estado;

    public TipoPropiedad() {
    }

    public TipoPropiedad(String tipoPropiedad, boolean estado) {
        this.tipoPropiedad = tipoPropiedad;
        this.estado = estado;
    }
    
    
}
