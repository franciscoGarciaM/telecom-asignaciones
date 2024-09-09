package com.telecom.asignaciones.service;

import com.telecom.asignaciones.model.Asignacion;
import com.telecom.asignaciones.model.Escenario;
import com.telecom.asignaciones.model.EntidadFederativa;
import com.telecom.asignaciones.model.Proyecto;
import com.telecom.asignaciones.repository.AsignacionRepository;
import com.telecom.asignaciones.repository.EscenarioRepository;
import com.telecom.asignaciones.repository.EntidadFederativaRepository;
import com.telecom.asignaciones.repository.ProyectoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class AsignacionService {

    @Autowired
    private AsignacionRepository asignacionRepository;

    @Autowired
    private ProyectoRepository proyectoRepository;

    @Autowired
    private EscenarioRepository escenarioRepository;

    @Autowired
    private EntidadFederativaRepository entidadFederativaRepository;

    @Transactional
    public Asignacion saveAsignacion(Asignacion asignacion) {
        asignacion.setUuidAsignacion(UUID.randomUUID());

        // Validar que los IDs no sean nulos antes de buscar en la base de datos
        if (asignacion.getIdProyecto() != null && asignacion.getIdProyecto().getId() != null) {
            Optional<Proyecto> proyecto = proyectoRepository.findById(asignacion.getIdProyecto().getId());
            proyecto.ifPresent(p -> asignacion.setNombreProyecto(p.getNombreProyecto()));
        }

        if (asignacion.getIdEscenario() != null && asignacion.getIdEscenario().getId() != null) {
            Optional<Escenario> escenario = escenarioRepository.findById(asignacion.getIdEscenario().getId());
            escenario.ifPresent(e -> asignacion.setNombreEscenario(e.getNombreEscenario()));
        }

        if (asignacion.getIdEstado() != null && asignacion.getIdEstado().getId() != null) {
            Optional<EntidadFederativa> entidadFederativa = entidadFederativaRepository.findById(asignacion.getIdEstado().getId());
            entidadFederativa.ifPresent(e -> asignacion.setNombreEstado(e.getNombreEstado()));
        }

        return asignacionRepository.save(asignacion);
    }
}
