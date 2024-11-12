
package com.ProyectoRE.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;



@Data
@Entity
@Table(name="servicios_premium")
public class ServiciosPremium implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_servicio_premium")
    private int idServicioPremium;
    private String servicioPremium;
    private boolean estado;
    
    @OneToMany
    @JoinColumn(name = "id_servicio_premium", insertable = false, updatable = false)
    List<Usuario> usuario;
    
    @OneToMany
    @JoinColumn(name = "id_servicio_premium", insertable = false, updatable = false)
    List<Propiedad> propiedad;

    public ServiciosPremium() {
    }

    public ServiciosPremium(String servicioPremium, boolean estado) {
        this.servicioPremium = servicioPremium;
        this.estado = estado;
    }
                   
}
