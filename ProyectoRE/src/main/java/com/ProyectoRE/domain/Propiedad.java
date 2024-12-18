
package com.ProyectoRE.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;



@Data
@Entity
@Table(name="propiedad")
public class Propiedad implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_propiedad")
    private int idPropiedad;
    private String nombre;
    private String descripcion;
    @Column (name="n_habitaciones")
    private int numHabitaciones;
    @Column (name="n_banos")
    private int numBanos;
    @Column (name="n_areas_sociables")
    private int numAreasSociables;
    private float precio;
    private int mtsLote;
    private int mtsConstruccion;
    private boolean ameneties;
    @Column (name="url_ubicacion")
    private String urlUbicacion;
    @Column (name="url_img_exterior1")
    private String urlImgExterior1;
    @Column (name="url_img_exterior2")
    private String urlImgExterior2;
    @Column (name="url_img_interior1")
    private String urlImgInterior1;
    @Column (name="url_img_interior2")
    private String urlImgInterior2;
    private boolean estado;
    
    @OneToMany
    @JoinColumn(name = "id_propiedad", insertable = false, updatable = false)
    List<Cita> cita;
    
    @OneToMany
    @JoinColumn(name = "id_propiedad", insertable = false, updatable = false)
    List<Favorito> favorito;
    
    @ManyToOne
   @JoinColumn(name = "id_tipo_propiedad")
   private TipoPropiedad tipoPropiedad;

   @ManyToOne
   @JoinColumn(name = "id_servicio_premium")
   private ServiciosPremium serviciosPremium;

   
    public Propiedad() {
    }

    public Propiedad(String nombre, String descripcion, int numHabitaciones, 
            int numBanos, int numAreasSociables, float precio, int mtsLote, 
            int mtsConstruccion, boolean ameneties, String urlUbicacion, 
            String urlImgExterior1, String urlImgExterior2, String urlImgInterior1, 
            String urlImgInterior2, boolean estado, List<Cita> cita, List<Favorito> favorito, 
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
        this.numAreasSociables = numAreasSociables;
        this.precio = precio;
        this.mtsLote = mtsLote;
        this.ameneties = ameneties;
        this.urlUbicacion = urlUbicacion;
        this.urlImgExterior1 = urlImgExterior1;
        this.urlImgExterior2 = urlImgExterior2;
        this.urlImgInterior1 = urlImgInterior1;
        this.urlImgInterior2 = urlImgInterior2;
        this.estado = estado;
        this.cita = cita;
        this.favorito = favorito;
        this.tipo_propiedad = tipo_propiedad;
        this.servicios_premium = servicios_premium;
    }

    
   
    
}
