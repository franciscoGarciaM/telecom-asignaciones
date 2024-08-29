package com.telecom.asignaciones.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "asignacion")
public class Asignacion {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre_sitio", nullable = false, length = Integer.MAX_VALUE)
    private String nombreSitio;

    @Column(name = "id_enlace", nullable = false, length = Integer.MAX_VALUE)
    private String idEnlace;

    @Column(name = "proyecto", nullable = false, length = Integer.MAX_VALUE)
    private String proyecto;

    @Column(name = "escenario", length = Integer.MAX_VALUE)
    private String escenario;

    @Column(name = "fecha_inicio", nullable = false)
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_proyecto")
    private com.telecom.asignaciones.model.Proyecto idProyecto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_escenario")
    private com.telecom.asignaciones.model.Escenario idEscenario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_estado")
    private com.telecom.asignaciones.model.EntidadFederativa idEstado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public com.telecom.asignaciones.model.Proyecto getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(com.telecom.asignaciones.model.Proyecto idProyecto) {
        this.idProyecto = idProyecto;
    }

    public com.telecom.asignaciones.model.Escenario getIdEscenario() {
        return idEscenario;
    }

    public void setIdEscenario(com.telecom.asignaciones.model.Escenario idEscenario) {
        this.idEscenario = idEscenario;
    }

    public com.telecom.asignaciones.model.EntidadFederativa getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(com.telecom.asignaciones.model.EntidadFederativa idEstado) {
        this.idEstado = idEstado;
    }

}