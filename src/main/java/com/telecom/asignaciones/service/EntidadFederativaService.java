package com.telecom.asignaciones.service;


import com.telecom.asignaciones.model.EntidadFederativa;
import com.telecom.asignaciones.repository.EntidadFederativaRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntidadFederativaService {

    private final EntidadFederativaRepository entidadFederativaRepository;

    public EntidadFederativaService(EntidadFederativaRepository entidadFederativaRepository) {
        this.entidadFederativaRepository = entidadFederativaRepository;
    }

    public List<EntidadFederativa> getAllEntidadesFederativas() {
        return entidadFederativaRepository.findAll();
    }
}
