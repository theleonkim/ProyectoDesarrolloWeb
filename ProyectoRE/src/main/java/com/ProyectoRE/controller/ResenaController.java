package com.ProyectoRE.controller;

import com.ProyectoRE.domain.Resenas;
import com.ProyectoRE.service.ResenaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@Slf4j
@RequestMapping("/resenas")
public class ResenaController {

    @Autowired
    private ResenaService resenaService;

    // Muestra las reseñas agregadas
    @GetMapping("/listado")
    public String listadoResenas(Model model) {
        var resenas = resenaService.getResenas();
        model.addAttribute("resenas", resenas);
        model.addAttribute("totalResenas", resenas.size());
        return "reviews"; 
    }

    // Muestra el formulario para agregar una nueva reseña
    @GetMapping("/nuevo")
    public String nuevaResena(Resenas resena) {
        return "/resenas/modifica";  
    }

    // Guardar la nueva reseña
    @PostMapping("/guardar")
    public String guardarResena(Resenas resena) {
        resenaService.save(resena);
        return "redirect:/resenas/listado";  
    }

    
}