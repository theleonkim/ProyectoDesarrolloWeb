
package com.ProyectoRE.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;


@Data
@Entity
@Table(name="resena")
public class Resenas implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_resena")
    private int idResena;
    private int numEstrellas;
    private String comentario;
    
   @ManyToOne
   @JoinColumn(name = "id_usuario")
   private Usuario usuario;

    public Resenas() {
    }

    public Resenas(int numEstrellas, String comentario, Usuario usuario) {
        this.numEstrellas = numEstrellas;
        this.comentario = comentario;
        this.usuario = usuario;
    }
   
       
}
