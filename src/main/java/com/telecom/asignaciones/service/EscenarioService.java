package com.telecom.asignaciones.service;

import com.telecom.asignaciones.model.Escenario;
import com.telecom.asignaciones.repository.EscenarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EscenarioService {

    @Autowired
    private EscenarioRepository escenarioRepository;


    public List<Escenario> getAllEscenarios() {
        return escenarioRepository.findAll();
    }


    public Escenario saveEscenario(Escenario escenario) {
        escenario.setUuidEscenario(UUID.randomUUID());
        return escenarioRepository.save(escenario);
    }
}
