package com.ProyectoRE.controller;

import com.ProyectoRE.domain.Cita;
import com.ProyectoRE.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cita")
public class CitaController {

    @Autowired
    private CitaService citaService;

    @GetMapping("/formulario")
    public String mostrarFormularioCitas() {
        return "citas-form"; // Renderiza citas-form.html
    }

    @PostMapping("/guardar")
    public String guardarCita(Cita cita) {
        citaService.save(cita);
        return "redirect:/cita/listado";
    }

    @GetMapping("/listado")
    public String listadoCitas(Model model) {
        var citas = citaService.getCitas();
        model.addAttribute("citas", citas);
        model.addAttribute("totalCitas", citas.size());
        return "citas"; // Renderiza citas.html
    }

    @GetMapping("/eliminar/{idCita}")
    public String eliminarCita(Cita cita) {
        citaService.delete(cita);
        return "redirect:/cita/listado";
    }
}


