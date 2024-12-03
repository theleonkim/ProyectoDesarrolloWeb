package com.ProyectoRE.controller;

import com.ProyectoRE.domain.Cita;
import com.ProyectoRE.domain.Usuario;
import com.ProyectoRE.domain.Propiedad;
import com.ProyectoRE.service.CitaService;
import com.ProyectoRE.service.UsuarioService;
import com.ProyectoRE.service.PropiedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cita")
public class CitaController {

    @Autowired
    private CitaService citaService;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private PropiedadService propiedadService;

    @GetMapping("/formulario")
    public String mostrarFormularioCita(Model model) {
        List<Usuario> usuarios = usuarioService.getUsuarios();
        List<Propiedad> propiedades = propiedadService.getPropiedades(true); // Obtener solo propiedades activas
        model.addAttribute("usuarios", usuarios);
        model.addAttribute("propiedades", propiedades);
        model.addAttribute("cita", new Cita()); // Crear un objeto vacío para el formulario
        return "citas-form";
    }

    @PostMapping("/guardar")
    public String guardarCita(@ModelAttribute Cita cita) {
        citaService.save(cita);
        return "redirect:/cita/listado";
    }

    @GetMapping("/listado")
    public String listarCitas(Model model) {
        List<Cita> citas = citaService.getCitas();
        model.addAttribute("citas", citas);
        return "cita/listado";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarCita(@PathVariable("id") int id) {
        var cita = citaService.findById(id);
        if (cita != null) {
            citaService.delete(cita);
        }
        return "redirect:/cita/listado";
    }
}
