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

        // Configurar la EntidadFederativa asociada
        if (asignacion.getIdEstado() != null) {
            EntidadFederativa entidadFederativa = entidadFederativaService.getEntidadFederativaById(asignacion.getIdEstado().getId());
            asignacion.setIdEstado(entidadFederativa);
        }

        // Configurar el Proyecto asociado
        if (asignacion.getIdProyecto() != null) {
            Proyecto proyecto = proyectoService.getProyectoById(asignacion.getIdProyecto().getId());
            asignacion.setIdProyecto(proyecto);
        }

        // Configurar el Escenario asociado
        if (asignacion.getIdEscenario() != null) {
            Escenario escenario = escenarioService.getEscenarioById(asignacion.getIdEscenario().getId());
            asignacion.setIdEscenario(escenario);
        }

        // Guardar la asignación
        return asignacionRepository.save(asignacion);
    }
}

