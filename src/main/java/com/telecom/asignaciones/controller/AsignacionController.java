package com.telecom.asignaciones.controller;

import com.telecom.asignaciones.model.Asignacion;
import com.telecom.asignaciones.request.AsignacionesRequest;
import com.telecom.asignaciones.service.AsignacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/asignaciones")
public class AsignacionController {

    @Autowired
    private AsignacionService asignacionService;

    @PostMapping
    public ResponseEntity<Asignacion> createAsignacion(@RequestBody AsignacionesRequest request) {
        try {
            Asignacion asignacion = asignacionService.saveAsignacion(request);
            return ResponseEntity.status(201).body(asignacion);
        } catch (Exception e) {
            // Log the exception for debugging
            e.printStackTrace();
            return ResponseEntity.status(500).body(null);
        }
    }
}
