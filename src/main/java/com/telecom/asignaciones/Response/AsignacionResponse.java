package com.telecom.asignaciones.Response;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.UUID;

public class AsignacionResponse {
    private Integer id;

    private String nombreSitio;

    private String idEnlace;

    private String proyecto;

    private String escenario;

    private LocalDate fechaInicio;

    @Column(name = "fecha_asignacion")
    private LocalDate fechaAsignacion;

    @Column(name = "cordinador", length = Integer.MAX_VALUE)
    private String cordinador;

    @Column(name = "lider", length = Integer.MAX_VALUE)
    private String lider;

    @Column(name = "nomiembros", nullable = false)
    private Integer nomiembros;

    @Column(name = "estado", length = Integer.MAX_VALUE)
    private String estado;

    @Column(name = "estatus")
    private Boolean estatus;

    @Column(name = "uuid_asignaciones", nullable = false)
    private UUID uuidAsignaciones;
}
