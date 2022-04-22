package edu.ilp.sisgailp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class PruebaController {

    @GetMapping("/saludo")
    public String saludo(){
        return "Hola amig@s desde Ayacucho - perú";
    }

    @GetMapping("/bienvenido")
    public String identificacion(@RequestParam String datos){
        return "Bienvenido a la Pontificia: " + datos;
    }
}
