package com.ProyectoRE.controller;

import com.ProyectoRE.domain.Propiedad;
import com.ProyectoRE.service.PropiedadService;
import com.ProyectoRE.service.ServiciosPremiumService;
import com.ProyectoRE.service.TipoPropiedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/propiedad")
public class PropiedadController {

    @Autowired
    private PropiedadService propiedadService;
    
    @Autowired
    private TipoPropiedadService tipoPropiedadService;
    
    @Autowired
    private ServiciosPremiumService serviciosPremiumService;

    // Agregar una nueva propiedad
    @PostMapping("/agregar")
    public String agregarPropiedad(@ModelAttribute Propiedad propiedad) {
        propiedadService.save(propiedad); // Guardar la propiedad
        return "redirect:/propiedad/listado"; // Redirigir al listado
    }

    // Guardar una propiedad existente o nueva
    @PostMapping("/guardar")
    public String guardarPropiedad(@ModelAttribute Propiedad propiedad) {
        propiedadService.save(propiedad); // Guardar la propiedad
        return "luxuryproperties"; // Redirigir al listado
    }

    // Mostrar listado de propiedades
    /*@GetMapping("/listado")
    public String listadoPropiedades(Model model) {
        var propiedades = propiedadService.getPropiedades(true); // Obtener propiedades activas
        model.addAttribute("propiedades", propiedades); // Agregar propiedades al modelo
        model.addAttribute("totalPropiedades", propiedades.size()); // Agregar total de propiedades
        return "propiedad/listado"; // Mostrar vista de listado
    }*/
    
    @GetMapping("/luxuryproperties")
    public String luxuryProperties(Model model) {
        var propiedades = propiedadService.getPropiedades(true); // Obtener propiedades activas
        var serviciosPremium = serviciosPremiumService.getServiciosPremium(true);
        var tiposPropiedades = tipoPropiedadService.getTipoPropiedades(true);
        model.addAttribute("propiedades", propiedades); // Agregar propiedades al modelo
        model.addAttribute("serviciosPremium", serviciosPremium);
        model.addAttribute("tiposPropiedades", tiposPropiedades);
        model.addAttribute("totalPropiedades", propiedades.size()); // Agregar total de propiedades
        return "luxuryproperties"; // Redirige a luxuryproperties.html
    }

    // Detalle de una propiedad específica
    @GetMapping("/detalle/{id}")
    public String detallePropiedad(@PathVariable("id") int id, Model model) {
        var propiedad = propiedadService.getPropiedadById(id); // Obtener propiedad por ID
        model.addAttribute("propiedad", propiedad); // Agregar propiedad al modelo
        return "propiedad/detalle"; // Mostrar vista de detalle
    }

    // Mostrar formulario para crear o editar una propiedad
    @GetMapping("/formulario")
    public String mostrarFormularioPropiedad(Model model) {
        var serviciosPremium = serviciosPremiumService.getServiciosPremium(true);
        var tiposPropiedades = tipoPropiedadService.getTipoPropiedades(true);
        model.addAttribute("propiedad", new Propiedad()); // Crear objeto vacío para formulario
        model.addAttribute("serviciosPremium", serviciosPremium);
        model.addAttribute("tiposPropiedades", tiposPropiedades);
        return "propiedad/formulario"; // Mostrar vista del formulario
    }
    
    @GetMapping("/eliminar/{idPropiedad}")
    public String propiedadEliminar(Propiedad propiedad) {
        propiedadService.delete(propiedad);
        return "redirect:/propiedad/listado";
    }
}
