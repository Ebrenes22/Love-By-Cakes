package com.Proyecto.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index"; // Esto devolverá el nombre del archivo HTML sin la extensión
    }
}
