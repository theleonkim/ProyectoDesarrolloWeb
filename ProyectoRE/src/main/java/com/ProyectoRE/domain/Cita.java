
package com.ProyectoRE.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;


@Data
@Entity
@Table(name="cita")
public class Cita implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_cita")
    private int idCita;
    private Date fecha;
    
   @ManyToOne
   @JoinColumn(name = "id_usuario")
   private Usuario usuario;
   
   @ManyToOne
   @JoinColumn(name = "id_propiedad")
   private Propiedad propiedad;

    public Cita() {
    }

    public Cita(Date fecha, Usuario usuario, Propiedad propiedad) {
        this.fecha = fecha;
        this.usuario = usuario;
        this.propiedad = propiedad;
    }
   
   
}
