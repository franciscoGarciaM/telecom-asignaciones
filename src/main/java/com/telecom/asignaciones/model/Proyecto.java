package com.telecom.asignaciones.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "proyecto")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "proyecto_id_gen")
    @SequenceGenerator(name = "proyecto_id_gen", sequenceName = "proyecto_id_proyecto_seq", allocationSize = 1)
    @Column(name = "id_proyecto", nullable = false)
    private Integer id;

    @Column(name = "nombre_proyecto", length = Integer.MAX_VALUE, nullable = true)
    private String nombreProyecto;

    @Column(name = "lider_proyecto", length = Integer.MAX_VALUE)
    private String liderProyecto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Cliente idCliente;

    @Column(name = "uuid_proyecto", nullable = false)
    private UUID uuidProyecto;

    @Column(name = "factor_cobro")
    private Double factorCobro;

    @OneToMany(mappedBy = "idProyecto")
    private Set<Asignacion> asignacions = new LinkedHashSet<>();

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getLiderProyecto() {
        return liderProyecto;
    }

    public void setLiderProyecto(String liderProyecto) {
        this.liderProyecto = liderProyecto;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public UUID getUuidProyecto() {
        return uuidProyecto;
    }

    public void setUuidProyecto(UUID uuidProyecto) {
        this.uuidProyecto = uuidProyecto;
    }

    public Set<Asignacion> getAsignacions() {
        return asignacions;
    }

    public void setAsignacions(Set<Asignacion> asignacions) {
        this.asignacions = asignacions;
    }

    public Double getFactorCobro() {
        return factorCobro;
    }

    public void setFactorCobro(Double factorCobro) {
        this.factorCobro = factorCobro;
    }
}
