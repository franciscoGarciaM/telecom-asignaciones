package com.telecom.asignaciones.service;

import com.telecom.asignaciones.model.Asignacion;
import com.telecom.asignaciones.repository.AsignacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AsignacionService {

    @Autowired
    private AsignacionRepository asignacionRepository;

    public Asignacion saveAsignacion(Asignacion asignacion) {
        asignacion.setUuidAsignaciones(UUID.randomUUID());
        return asignacionRepository.save(asignacion);
    }
}
