package com.telecom.asignaciones.controller;

import com.telecom.asignaciones.model.Asignacion;
import com.telecom.asignaciones.service.AsignacionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1/asignaciones")
public class AsignacionController {

    private final AsignacionService asignacionService;

    public AsignacionController(AsignacionService asignacionService) {
        this.asignacionService = asignacionService;
    }

    @PostMapping
    public Asignacion createAsignacion(@RequestBody Asignacion asignacion) {
        return asignacionService.saveAsignacion(asignacion);
    }
}
