package com.telecom.asignaciones.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "proyecto")
public class Proyecto {
    @Id
    @Column(name = "id_proyecto", nullable = false)
    private Integer id;

    @Column(name = "nombreproyecto", nullable = false, length = Integer.MAX_VALUE)
    private String nombreproyecto;

    @Column(name = "\"liderProyecto\"", length = Integer.MAX_VALUE)
    private String liderProyecto;

    @Column(name = "uud_proyecto", nullable = false)
    private UUID uudProyecto;

    @OneToMany(mappedBy = "idProyecto")
    private Set<Asignacion> asignacions = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idProyecto")
    private Set<Cliente> clientes = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreproyecto() {
        return nombreproyecto;
    }

    public void setNombreproyecto(String nombreproyecto) {
        this.nombreproyecto = nombreproyecto;
    }

    public String getLiderProyecto() {
        return liderProyecto;
    }

    public void setLiderProyecto(String liderProyecto) {
        this.liderProyecto = liderProyecto;
    }

    public UUID getUudProyecto() {
        return uudProyecto;
    }

    public void setUudProyecto(UUID uudProyecto) {
        this.uudProyecto = uudProyecto;
    }

    public Set<Asignacion> getAsignacions() {
        return asignacions;
    }

    public void setAsignacions(Set<Asignacion> asignacions) {
        this.asignacions = asignacions;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

}