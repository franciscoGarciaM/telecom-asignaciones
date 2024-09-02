package com.telecom.asignaciones.service;

import com.telecom.asignaciones.model.Asignacion;
import com.telecom.asignaciones.repository.AsignacionRepository;
import org.springframework.stereotype.Service;

@Service
public class AsignacionService {

    private final AsignacionRepository asignacionRepository;

    public AsignacionService(AsignacionRepository asignacionRepository) {
        this.asignacionRepository = asignacionRepository;
    }

    public Asignacion saveAsignacion(Asignacion asignacion) {
        return asignacionRepository.save(asignacion);
    }
}
