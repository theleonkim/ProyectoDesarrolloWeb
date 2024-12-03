package com.ProyectoRE.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    // ================= Páginas en Español =================
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

    @GetMapping("/detalles-propiedad")
    public String propertyDetails() {
        return "detalles-propiedad"; // Redirige a detalles-propiedad.html
    }

    @GetMapping("/detalles-propiedad1")
    public String propertyDetails1() {
        return "detalles-propiedad1"; // Redirige a detalles-propiedad1.html
    }

    @GetMapping("/detalles-propiedad2")
    public String propertyDetails2() {
        return "detalles-propiedad2"; // Redirige a detalles-propiedad2.html
    }

    // ================= Páginas en Inglés =================
    @GetMapping("/index-en")
    public String showIndexEn() {
        return "index-en"; // Redirige a index-en.html
    }

    @GetMapping("/luxuryproperties-en")
    public String luxuryPropertiesEn() {
        return "luxuryproperties-en"; // Redirige a luxuryproperties-en.html
    }

    @GetMapping("/compare-en")
    public String comparePropertiesEn() {
        return "compare-en"; // Redirige a compare-en.html
    }

    @GetMapping("/map-en")
    public String mapEn() {
        return "map-en"; // Redirige a map-en.html
    }

    @GetMapping("/contact-en")
    public String contactEn() {
        return "contact-en"; // Redirige a contact-en.html
    }

    @GetMapping("/favorites-en")
    public String favoritesEn() {
        return "favorites-en"; // Redirige a favorites-en.html
    }

    @GetMapping("/reviews-en")
    public String reviewsEn() {
        return "reviews-en"; // Redirige a reviews-en.html
    }
}


