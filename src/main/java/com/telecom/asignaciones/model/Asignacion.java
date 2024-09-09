package com.telecom.asignaciones.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "asignacion")
public class Asignacion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "asignacion_id_gen")
    @SequenceGenerator(name = "asignacion_id_gen", sequenceName = "asignacion_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre_sitio", nullable = false, length = Integer.MAX_VALUE)
    private String nombreSitio;

    @Column(name = "id_enlace", nullable = false, length = Integer.MAX_VALUE)
    private String idEnlace;

    @Column(nullable = false)
    private String nombreProyecto;


    @Column(name = "nombre_escenario", length = Integer.MAX_VALUE)
    private String nombreEscenario;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fecha_asignacion")
    private LocalDate fechaAsignacion;

    @Column(name = "coordinador", length = Integer.MAX_VALUE)
    private String coordinador;

    @Column(name = "lider", length = Integer.MAX_VALUE)
    private String lider;

    @Column(name = "numero_miembros", nullable = false)
    private Integer numeroMiembros;

    @Column(name = "nombre_estado", length = Integer.MAX_VALUE)
    private String nombreEstado;

    @Column(name = "estatus")
    private Boolean estatus;

    @Column(name = "uuid_asignaciones", nullable = false)
    private UUID uuidAsignaciones;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_proyecto", nullable = false)
    private Proyecto idProyecto;

    @ManyToOne
    @JoinColumn(name = "id_escenario", nullable = false)
    private Escenario idEscenario;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_estado", nullable = false)
    private EntidadFederativa idEstado;


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

    public Proyecto getIdProyecto() {
        return idProyecto;
    }


    public Escenario getIdEscenario() {
        return idEscenario;
    }

    public EntidadFederativa getIdEstado() {
        return idEstado;
    }

    public void setIdProyecto(Proyecto idProyecto) {
        this.idProyecto = idProyecto;
    }

    public void setIdEscenario(Escenario idEscenario) {
        this.idEscenario = idEscenario;
    }

    public void setIdEstado(EntidadFederativa idEstado) {
        this.idEstado = idEstado;
    }


    public void setUuidAsignacion(UUID uuid) {
    }
}