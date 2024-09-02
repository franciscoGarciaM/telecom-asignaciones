package com.telecom.asignaciones.controller;

import com.telecom.asignaciones.model.EntidadFederativa;
import com.telecom.asignaciones.service.EntidadFederativaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/1/entidades")
public class EntidadFederativaController {

    private final EntidadFederativaService entidadFederativaService;

    public EntidadFederativaController(EntidadFederativaService entidadFederativaService) {
        this.entidadFederativaService = entidadFederativaService;
    }

    @GetMapping
    public List<EntidadFederativa> getEntidadesFederativas() {
        return entidadFederativaService.getAllEntidadesFederativas();
    }
}
