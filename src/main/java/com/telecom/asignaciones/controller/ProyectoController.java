package com.telecom.asignaciones.controller;

import com.telecom.asignaciones.model.Proyecto;
import com.telecom.asignaciones.service.ProyectoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/api/1/proyectos")
public class ProyectoController {

    private final ProyectoService proyectoService;

    public ProyectoController(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }

    @GetMapping
    public List<Proyecto> getProyectos() {
        return proyectoService.getAllProyectos();
    }

    @GetMapping
    public List<Proyecto> getProyectoBYID() {
        return proyectoService.getAllProyectos();
    }

    @PostMapping
    public Proyecto createProyecto(@RequestBody Proyecto proyecto)
    {
        return proyectoService.saveProyecto(proyecto);
    }
}
