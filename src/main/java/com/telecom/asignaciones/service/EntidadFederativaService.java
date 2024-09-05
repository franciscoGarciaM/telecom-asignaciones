package com.telecom.asignaciones.service;


import com.telecom.asignaciones.model.EntidadFederativa;
import com.telecom.asignaciones.repository.EntidadFederativaRepository;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntidadFederativaService {

    @Autowired
    private EntidadFederativaRepository entidadFederativaRepository;

    public List<EntidadFederativa> getAllEntidadesFederativas() {
        return entidadFederativaRepository.findAll();
    }

    public EntidadFederativa getEntidadFederativaById(Integer id) {
        return entidadFederativaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("EntidadFederativa not found with id " + id));
    }
}
