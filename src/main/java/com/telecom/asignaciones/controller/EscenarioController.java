package com.telecom.asignaciones.controller;

import com.telecom.asignaciones.model.Escenario;
import com.telecom.asignaciones.service.EscenarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/1/escenarios")
public class EscenarioController {

    private final EscenarioService escenarioService;

    public EscenarioController(EscenarioService escenarioService) {
        this.escenarioService = escenarioService;
    }

    @GetMapping
    public List<Escenario> getEscenarios() {
        return escenarioService.getAllEscenarios();
    }

    @PostMapping
    public Escenario createEscenario(@RequestBody Escenario escenario) {
        return escenarioService.saveEscenario(escenario);
    }
}
