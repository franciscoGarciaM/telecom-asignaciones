package com.telecom.asignaciones.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @Column(name = "id_cliente", nullable = false)
    private Integer id;

    @Column(name = "nombre_cliente", length = Integer.MAX_VALUE)
    private String nombreCliente;

    @Column(name = "proyecto", length = Integer.MAX_VALUE)
    private String proyecto;



    @Column(name = "uuid_cliente", nullable = false)
    private UUID uuidCliente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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


    public UUID getUuidCliente() {
        return uuidCliente;
    }

    public void setUuidCliente(UUID uuidCliente) {
        this.uuidCliente = uuidCliente;
    }

}