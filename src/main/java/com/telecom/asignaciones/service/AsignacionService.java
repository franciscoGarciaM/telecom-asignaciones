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
        // Obtener los IDs de las entidades desde el request
        int proyectoId = request.getProyecto().getId();
        int escenarioId = request.getEscenario().getId();
        int estadoId = request.getEstado().getId();

        // Buscar las entidades en los repositorios
        Proyecto proyecto = proyectoRepository.findById(proyectoId)
                .orElseThrow(() -> new ResourceNotFoundException("Proyecto no encontrado con el ID proporcionado."));

        Escenario escenario = escenarioRepository.findById(escenarioId)
                .orElseThrow(() -> new ResourceNotFoundException("Escenario no encontrado con el ID proporcionado."));

        EntidadFederativa estado = entidadFederativaRepository.findById(estadoId)
                .orElseThrow(() -> new ResourceNotFoundException("Estado no encontrado con el ID proporcionado."));

        // Crear y configurar la entidad Asignacion
        Asignacion asignacion = new Asignacion();
        asignacion.setProyecto(proyecto);
        asignacion.setEscenario(escenario);
        asignacion.setEstado(estado);
        asignacion.setNombreSitio(request.getNombreSitio());
        asignacion.setIdEnlace(request.getIdEnlace());
        asignacion.setFechaInicio(request.getFechaInicio());
        asignacion.setFechaAsignacion(request.getFechaAsignacion());
        asignacion.setCoordinador(request.getCoordinador());
        asignacion.setLider(request.getLider());
        asignacion.setNumeroMiembros(request.getNumeroMiembros());

        // Guardar la entidad Asignacion en el repositorio
        return asignacionRepository.save(asignacion);
    }
}
