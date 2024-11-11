
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
    private int idTipoPropiedad;
    private int idServicioPremium;
    private String nombre;
    private String descripcion;
    private int numHabitaciones;
    private int numBanos;
    private int numAreasSociables;
    private float precio;
    private int mtsLote;
    private int mtsConstruccion;
    private boolean ameneties;
    private String urlUbicacion;
    private String urlImgExterior1;
    private String urlImgExterior2;
    private String urlImgInterior1;
    private String urlImgInterior2;
    private boolean estado;
    
    @OneToMany
    @JoinColumn(name = "id_propiedad", insertable = false, updatable = false)
    List<Usuario> usuario;

    public Propiedad() {
    }

    public Propiedad(int idTipoPropiedad, int idServicioPremium, String nombre, String descripcion, int numHabitaciones, int numBanos, int numAreasSociables, float precio, int mtsLote, int mtsConstruccion, boolean ameneties, String urlUbicacion, String urlImgExterior1, String urlImgExterior2, String urlImgInterior1, String urlImgInterior2, boolean estado) {
        this.idTipoPropiedad = idTipoPropiedad;
        this.idServicioPremium = idServicioPremium;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
        this.numAreasSociables = numAreasSociables;
        this.precio = precio;
        this.mtsLote = mtsLote;
        this.mtsConstruccion = mtsConstruccion;
        this.ameneties = ameneties;
        this.urlUbicacion = urlUbicacion;
        this.urlImgExterior1 = urlImgExterior1;
        this.urlImgExterior2 = urlImgExterior2;
        this.urlImgInterior1 = urlImgInterior1;
        this.urlImgInterior2 = urlImgInterior2;
        this.estado = estado;
    }
    
    
}
