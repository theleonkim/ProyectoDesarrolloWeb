package com.prueba_a.controller;

import com.prueba_a.domain.Cita;
import com.prueba_a.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/citas")
public class CitaController {

    @Autowired
    private CitaService citaService;

    @GetMapping("/listado")
    public String listarCitas(Model model) {
        List<Cita> citas = citaService.findAll();
        model.addAttribute("citas", citas);
        return "listado";  // Redirige a listado.html
    }

    @GetMapping("/nueva")
    public String nuevaCitaForm(Model model) {
        model.addAttribute("cita", new Cita());
        return "modifica";  // Redirige a modifica.html para crear una nueva cita
    }

    @PostMapping("/guardar")
    public String guardarCita(@ModelAttribute("cita") Cita cita) {
        citaService.save(cita);
        return "redirect:/citas/listado";
    }
    
    @GetMapping("/editar/{id}")
    public String editarCitaForm(@PathVariable("id") int id, Model model) {
        Cita cita = citaService.findById(id).orElse(null);
        model.addAttribute("cita", cita);
        return "modifica"; 
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarCita(@PathVariable("id") int id) {
        citaService.deleteById(id);
        return "redirect:/citas/listado";
    }
}

