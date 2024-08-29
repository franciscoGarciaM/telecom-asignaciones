package com.telecom.asignaciones.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Column(name = "id_cliente", length = Integer.MAX_VALUE)
    private String idCliente;

    @Column(name = "nombre_cliente", length = Integer.MAX_VALUE)
    private String nombreCliente;

    @Column(name = "proyecto", length = Integer.MAX_VALUE)
    private String proyecto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_proyecto")
    private com.telecom.asignaciones.model.Proyecto idProyecto;

    @Column(name = "uuid_cliente", nullable = false)
    private UUID uuidCliente;

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public com.telecom.asignaciones.model.Proyecto getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(com.telecom.asignaciones.model.Proyecto idProyecto) {
        this.idProyecto = idProyecto;
    }

    public UUID getUuidCliente() {
        return uuidCliente;
    }

    public void setUuidCliente(UUID uuidCliente) {
        this.uuidCliente = uuidCliente;
    }

}