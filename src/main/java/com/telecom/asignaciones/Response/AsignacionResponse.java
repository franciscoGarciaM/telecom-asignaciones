package com.telecom.asignaciones.Response;



import java.time.LocalDate;
import java.util.UUID;

public class AsignacionResponse {


    private String nombreSitio;

    private String idEnlace;

    private String proyecto;

    private String escenario;

    private LocalDate fechaInicio;

    private LocalDate fechaAsignacion;

    private String cordinador;

    private String lider;

    private Integer nomiembros;

    private String estado;

    private Boolean estatus;

    private UUID uuidAsignaciones;

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

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getEscenario() {
        return escenario;
    }

    public void setEscenario(String escenario) {
        this.escenario = escenario;
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

    public String getCordinador() {
        return cordinador;
    }

    public void setCordinador(String cordinador) {
        this.cordinador = cordinador;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public Integer getNomiembros() {
        return nomiembros;
    }

    public void setNomiembros(Integer nomiembros) {
        this.nomiembros = nomiembros;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

}
