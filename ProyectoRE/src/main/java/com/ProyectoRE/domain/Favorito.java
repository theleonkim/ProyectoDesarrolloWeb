
package com.ProyectoRE.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;



@Data
@Entity
@Table(name="favorito")
public class Favorito implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_favorito")
    private int idFavorito;
    
   @ManyToOne
   @JoinColumn(name = "id_usuario")
   private Usuario usuario;

   @ManyToOne
   @JoinColumn(name = "id_propiedad")
   private Propiedad propiedad;

    public Favorito() {
    }

    public Favorito(Usuario usuario, Propiedad propiedad) {
        this.usuario = usuario;
        this.propiedad = propiedad;
    }

   
}
