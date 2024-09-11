package com.telecom.asignaciones.service;

import com.telecom.asignaciones.exception.ResourceNotFoundException;
import com.telecom.asignaciones.model.Asignacion;
import com.telecom.asignaciones.model.Proyecto;
import com.telecom.asignaciones.model.Escenario;
import com.telecom.asignaciones.model.EntidadFederativa;
import com.telecom.asignaciones.repository.AsignacionRepository;
import com.telecom.asignaciones.repository.ProyectoRepository;
import com.telecom.asignaciones.repository.EscenarioRepository;
import com.telecom.asignaciones.repository.EntidadFederativaRepository;
import com.telecom.asignaciones.request.AsignacionesRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Asignacion saveAsignacion(AsignacionesRequest request) {
        Asignacion asignacion = mappingEntityTo(request);
        return asignacionRepository.save(asignacion);
    }

    public Asignacion mappingEntityTo(AsignacionesRequest request) {
        Integer proyectoId = request.getProyecto().getId();
        Integer escenarioId = request.getEscenario().getId();
        Integer estadoId = request.getEstado().getId();

        Proyecto proyecto = proyectoRepository.findById(proyectoId)
                .orElseThrow(() -> new ResourceNotFoundException("Proyecto no encontrado con el ID: " + proyectoId));

        Escenario escenario = escenarioRepository.findById(escenarioId)
                .orElseThrow(() -> new ResourceNotFoundException("Escenario no encontrado con el ID: " + escenarioId));

        EntidadFederativa estado = entidadFederativaRepository.findById(estadoId)
                .orElseThrow(() -> new ResourceNotFoundException("Estado no encontrado con el ID: " + estadoId));

        Asignacion asignacion = new Asignacion();
        asignacion.setIdProyecto(proyecto);
        asignacion.setIdEscenario(escenario);
        asignacion.setIdEstado(estado);
        asignacion.setNombreSitio(request.getNombreSitio());
        asignacion.setIdEnlace(request.getIdEnlace());
        asignacion.setFechaInicio(request.getFechaInicio());
        asignacion.setFechaAsignacion(request.getFechaAsignacion());
        asignacion.setCoordinador(request.getCoordinador());
        asignacion.setLider(request.getLider());
        asignacion.setNumeroMiembros(request.getNumeroMiembros());
        asignacion.setEstatus(request.getEstatus());

        return asignacion;
    }
}
