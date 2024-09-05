package com.telecom.asignaciones.service;

import com.telecom.asignaciones.model.Proyecto;
import com.telecom.asignaciones.repository.ProyectoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProyectoService {

    @Autowired
    private ProyectoRepository proyectoRepository;

    public List<Proyecto> getAllProyectos() {
        return proyectoRepository.findAll();
    }

    public Proyecto getProyectoById(Integer id) {
        return proyectoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Proyecto not found with id " + id));
    }

    public Proyecto saveProyecto(Proyecto proyecto) {
        proyecto.setUuidProyecto(UUID.randomUUID());
        return proyectoRepository.save(proyecto);
    }
}
