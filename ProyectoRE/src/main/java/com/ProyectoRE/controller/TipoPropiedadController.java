package com.ProyectoRE.controller;

import com.ProyectoRE.service.TipoPropiedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/tipoPropiedad")
public class TipoPropiedadController {
    
    @Autowired
    private TipoPropiedadService tipoPropiedadService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var tiposPropiedad = tipoPropiedadService.getTipoPropiedades(true);
        model.addAttribute("tiposPropiedad", tiposPropiedad);
        model.addAttribute("totalTipos", tiposPropiedad.size());
        return "/tipoPropiedad/listado";
    }
}
