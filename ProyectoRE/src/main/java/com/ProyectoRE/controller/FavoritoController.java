package com.ProyectoRE.controller;

import com.ProyectoRE.domain.Favorito;
import com.ProyectoRE.domain.Usuario;
import com.ProyectoRE.service.FavoritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/favorito")
public class FavoritoController {

    @Autowired
    private FavoritoService favoritoService;

    @GetMapping("/favorito/nuevo")
    public String nuevofavorito(Favorito favorito) {
        return "/nuevo/modifica";
    }

    @PostMapping("/guardar")
    public String guardarFavorito(Favorito favorito) {
        favoritoService.save(favorito);
        return "redirect:/favorito/listado";
    }

    @GetMapping("/eliminar/{idFavorito}")
    public String favoritoEliminar(Favorito favorito) {
        favoritoService.delete(favorito);
        return "redirect:/favorito/listado";
    }

    @GetMapping("/listado")
    public String listarFavoritos(Model model, Usuario usuario) {
        model.addAttribute("favoritos", favoritoService.findAllByUsuario(usuario));
        return "/favorito/listado";
    }

}
