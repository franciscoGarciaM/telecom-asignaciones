package com.telecom.asignaciones.service;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.telecom.asignaciones.model.Proyecto;
import com.telecom.asignaciones.repository.ProyectoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoService {

    private final ProyectoRepository proyectoRepository;

    public ProyectoService(ProyectoRepository proyectoRepository) {
        this.proyectoRepository = proyectoRepository;
    }

    public List<Proyecto> getAllProyectos() {
        return proyectoRepository.findAll();
    }

    public Proyecto saveProyecto(Proyecto proyecto) {

        return proyectoRepository.save(proyecto);
    }
}

