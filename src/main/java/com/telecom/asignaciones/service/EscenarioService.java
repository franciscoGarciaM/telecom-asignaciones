package com.telecom.asignaciones.service;

import com.telecom.asignaciones.model.Escenario;
import com.telecom.asignaciones.repository.EscenarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EscenarioService {

    private final EscenarioRepository escenarioRepository;

    public EscenarioService(EscenarioRepository escenarioRepository) {
        this.escenarioRepository = escenarioRepository;
    }

    public List<Escenario> getAllEscenarios() {
        return escenarioRepository.findAll();
    }

    public Escenario saveEscenario(Escenario escenario) {
        return escenarioRepository.save(escenario);
    }
}
