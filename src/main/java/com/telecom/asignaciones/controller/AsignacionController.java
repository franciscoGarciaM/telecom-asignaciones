package com.telecom.asignaciones.controller;

import com.telecom.asignaciones.Response.AsignacionResponse;
import com.telecom.asignaciones.service.AsignacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AsignacionController {

    @Autowired
    private AsignacionService asignacionService;

    @GetMapping("/asignacionesgit")
    public List<AsignacionResponse> getAsignaciones() {
        return AsignacionService.findAll();
    }
}
