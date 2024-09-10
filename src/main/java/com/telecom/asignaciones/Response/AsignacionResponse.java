package com.telecom.asignaciones.Response;

import com.telecom.asignaciones.model.Asignacion;

import java.time.LocalDate;
import java.util.UUID;

public class AsignacionResponse {

    private String nombreSitio;
    private String idEnlace;
    private String nombreProyecto;
    private String nombreEscenario;
    private LocalDate fechaInicio;
    private LocalDate fechaAsignacion;
    private String coordinador;
    private String lider;
    private Integer numeroMiembros;
    private String nombreEstado;
    private Boolean estatus;
    private UUID uuidAsignaciones;
    private Integer idProyecto;
    private Integer idEscenario;
    private Integer idEstado;

    public AsignacionResponse(Asignacion asignacion) {
        this.nombreSitio = asignacion.getNombreSitio();
        this.idEnlace = asignacion.getIdEnlace();
        this.nombreProyecto = asignacion.getNombreProyecto();
        this.nombreEscenario = asignacion.getNombreEscenario();
        this.fechaInicio = asignacion.getFechaInicio();
        this.fechaAsignacion = asignacion.getFechaAsignacion();
        this.coordinador = asignacion.getCoordinador();
        this.lider = asignacion.getLider();
        this.numeroMiembros = asignacion.getNumeroMiembros();
        this.nombreEstado = asignacion.getNombreEstado();
        this.estatus = asignacion.getEstatus();
        this.uuidAsignaciones = asignacion.getUuidAsignaciones();
        this.idProyecto = asignacion.getIdProyecto().getId();
        this.idEscenario = asignacion.getIdEscenario().getId();
        this.idEstado = asignacion.getIdEstado().getId();
    }

    // Getters y setters

    public String getNombreSitio() {
        return nombreSitio;
    }

    public void setNombreSitio(String nombreSitio) {
        this.nombreSitio = nombreSitio;
    }

    public String getIdEnlace() {
        return idEnlace;
    }

    public void setIdEnlace(String idEnlace) {
        this.idEnlace = idEnlace;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getNombreEscenario() {
        return nombreEscenario;
    }

    public void setNombreEscenario(String nombreEscenario) {
        this.nombreEscenario = nombreEscenario;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDate fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public String getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(String coordinador) {
        this.coordinador = coordinador;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public Integer getNumeroMiembros() {
        return numeroMiembros;
    }

    public void setNumeroMiembros(Integer numeroMiembros) {
        this.numeroMiembros = numeroMiembros;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }

    public UUID getUuidAsignaciones() {
        return uuidAsignaciones;
    }

    public void setUuidAsignaciones(UUID uuidAsignaciones) {
        this.uuidAsignaciones = uuidAsignaciones;
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public Integer getIdEscenario() {
        return idEscenario;
    }

    public void setIdEscenario(Integer idEscenario) {
        this.idEscenario = idEscenario;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }
}
