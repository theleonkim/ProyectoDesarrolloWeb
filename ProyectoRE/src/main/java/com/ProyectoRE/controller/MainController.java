/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoRE.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "index"; // Redirige a index.html
    }

    @GetMapping("/luxury-properties")
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
         } }