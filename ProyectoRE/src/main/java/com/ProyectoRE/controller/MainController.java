package com.ProyectoRE.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/index")
    public String index() {
        return "index"; // Redirige a index.html
    }

    @GetMapping("/luxuryproperties")

    public String luxuryProperties() {
        return "luxuryproperties"; // Redirige a luxuryproperties.html
    }

    @GetMapping("/compare")
    public String compareProperties() {
        return "compare"; // Redirige a compare.html
    }

    @GetMapping("/map")
    public String map() {
        return "map"; // Redirige a map.html
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact"; // Redirige a contact.html
    }

    @GetMapping("/favorites")
    public String favorites() {
        return "favorites"; // Redirige a favorites.html
    }

    @GetMapping("/reviews")
    public String reviews() {
        return "reviews"; // Redirige a reviews.html

    }
}
