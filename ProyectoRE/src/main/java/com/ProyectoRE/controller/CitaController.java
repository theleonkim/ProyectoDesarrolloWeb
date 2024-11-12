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
    
    @PostMapping("/agregar")
    public String agregarCita(Cita cita) {
        citaService.save(cita);
        return "redirect:/usuario/listado";
    }
    
    @GetMapping("/listado")
    public String listadoCita(Model model) {
        var citas = citaService.getCitas();
        model.addAttribute("citas", citas);
        model.addAttribute("totalCitas", citas.size());
        return "/cita/listado"; 
    }
    
    @PostMapping("/guardar")
    public String guardarCita(Cita cita) {
        citaService.save(cita);
        return "redirect:/citas/listado";  
    }
    
    @GetMapping("/eliminar/{idCita}")
    public String EliminarCita(Cita cita) {
        citaService.delete(cita);
        return"redirect:/cita/listado";
    }
 
}
