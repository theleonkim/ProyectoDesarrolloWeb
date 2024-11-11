
package com.ProyectoRE.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_usuario")
    private int idUsuario;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String correo;
    private String contrasena;
    
   @ManyToOne
   @JoinColumn(name = "id_propiedad")
   private Propiedad propiedad;

   @ManyToOne
   @JoinColumn(name = "id_servicio_premium")
   private ServiciosPremium servicios_premium;
   
    public Usuario() {
    }

    public Usuario(String nombre, String primerApellido, String segundoApellido, String correo, String contrasena, Propiedad propiedad, ServiciosPremium servicios_premium) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.propiedad = propiedad;
        this.servicios_premium = servicios_premium;
    }
   
   
}
