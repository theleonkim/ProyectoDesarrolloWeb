package com.ProyectoRE.controller;

import com.ProyectoRE.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping("/inicio")
    public String inicioUsuario(Model model){
        
        return"/usuario/inicio";
    }
    
    @GetMapping("/luxury-properties")
    public String propiedadesLujo(Model model){
        
        return"/usuario/luxury-properties";
    }
    
    @GetMapping("/compare")
    public String compararPropiedades(Model model){
        
        return"/usuario/compare";
    }
    
    @GetMapping("/map")
    public String mapaInteractivo(Model model){
        
        return"/usuario/map";
    }
    
    @GetMapping("/contact")
    public String contacto(Model model){
        
        return"/usuario/contact";
    }
    @GetMapping("/favorites")
    public String favoritos(Model model){
        
        return"/usuario/favorites";
    }
    
}

