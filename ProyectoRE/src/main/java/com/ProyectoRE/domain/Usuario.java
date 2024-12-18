package com.ProyectoRE.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set; // Import para roles
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int idUsuario;

    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String correo;

    @Column(nullable = false)
    private String contrasena;

    @OneToMany
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    private List<Cita> cita;

    @OneToMany
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    private List<Favorito> favorito;

    @OneToMany
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    private List<Resenas> resena;

    @ManyToOne
    @JoinColumn(name = "id_tipo_propiedad")
    private TipoPropiedad tipo_propiedad;

    @ManyToOne
    @JoinColumn(name = "id_servicio_premium")
    private ServiciosPremium servicios_premium;

    // Nueva relación con Roles
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "usuario_roles",
        joinColumns = @JoinColumn(name = "id_usuario"),
        inverseJoinColumns = @JoinColumn(name = "id_rol")
    )
    private Set<Rol> roles;

    public Usuario() {
    }

    public Usuario(String nombre, String primerApellido, String segundoApellido, String correo, String contrasena, TipoPropiedad tipo_propiedad, ServiciosPremium servicios_premium) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.tipo_propiedad = tipo_propiedad;
        this.servicios_premium = servicios_premium;
    }
}
