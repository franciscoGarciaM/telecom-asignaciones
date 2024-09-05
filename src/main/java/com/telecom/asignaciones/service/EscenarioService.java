package com.telecom.asignaciones.service;

import com.telecom.asignaciones.model.Escenario;
import com.telecom.asignaciones.repository.EscenarioRepository;
import jakarta.persistence.EntityNotFoundException;
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
    public Escenario getEscenarioById(Integer id) {
        return escenarioRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Escenario not found with id " + id));
    }

    public Escenario saveEscenario(Escenario escenario) {
        escenario.setUuidEscenario(UUID.randomUUID());
        return escenarioRepository.save(escenario);
    }
}
