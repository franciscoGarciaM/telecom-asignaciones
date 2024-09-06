package com.telecom.asignaciones.service;

import com.telecom.asignaciones.model.Asignacion;
import com.telecom.asignaciones.model.EntidadFederativa;
import com.telecom.asignaciones.model.Escenario;
import com.telecom.asignaciones.model.Proyecto;
import com.telecom.asignaciones.repository.AsignacionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


    @Service
public class AsignacionService {

    @Autowired
    private AsignacionRepository asignacionRepository;

    @Autowired
    private EntidadFederativaService entidadFederativaService;

    @Autowired
    private ProyectoService proyectoService;

    @Autowired
    private EscenarioService escenarioService;

    @Transactional
    public Asignacion saveAsignacion(Asignacion asignacion) {
        asignacion.setUuidAsignacion(UUID.randomUUID());
        return asignacionRepository.save(asignacion);
    }
}

