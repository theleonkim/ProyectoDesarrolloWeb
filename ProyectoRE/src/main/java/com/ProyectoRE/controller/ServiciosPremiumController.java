package com.ProyectoRE.controller;

import com.ProyectoRE.domain.ServiciosPremium;
import com.ProyectoRE.service.ServiciosPremiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/serviciosPremium")
public class ServiciosPremiumController {
    
   @Autowired
    private ServiciosPremiumService  serviciosPremiumService;

    @GetMapping("/listado")
    public String listadoServiciosPremium(Model model) {
        var servicios = serviciosPremiumService.getServiciosPremium(true);
        model.addAttribute("servicios", servicios);
        model.addAttribute("totalServicios", servicios.size());
        return "/serviciosPremium/listado";
    }

    @GetMapping("/detalle")
    public String detalleServicioPremium(ServiciosPremium serviciosPremium, Model model) {
        serviciosPremium = serviciosPremiumService.getServiciosPremium(serviciosPremium);
        model.addAttribute("serviciosPremium", serviciosPremium);
        return "/serviciosPremium/detalle";
    }
}
