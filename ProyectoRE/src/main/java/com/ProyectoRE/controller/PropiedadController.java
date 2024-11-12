package com.ProyectoRE.controller;

import com.ProyectoRE.domain.Propiedad;
import com.ProyectoRE.service.PropiedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/propiedad")
public class PropiedadController {

    @Autowired
    private PropiedadService propiedadService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var propiedades = propiedadService.getPropiedades(false);
        model.addAttribute("propiedades", propiedades);
        model.addAttribute("totalPropiedades", propiedades.size());
        return "/propiedad/listado";
    }

    @GetMapping("/detalle/{id}")
    public String detallePropiedad(Propiedad propiedad, Model model) {
        propiedad = propiedadService.getPropiedad(propiedad);
        model.addAttribute("propiedad", propiedad);
        return "/propiedad/detalle";
    }
}
