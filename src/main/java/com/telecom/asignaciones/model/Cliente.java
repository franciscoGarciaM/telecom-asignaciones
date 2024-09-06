package com.telecom.asignaciones.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "cliente")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_id_gen")
    @SequenceGenerator(name = "cliente_id_gen", sequenceName = "cliente_id_cliente_seq", allocationSize = 1)
    @Column(name = "id_cliente", nullable = false)
    private Integer id;

    @Column(name = "nombre_cliente", nullable = false, length = Integer.MAX_VALUE)
    private String nombreCliente;

    @Column(name = "uuid_cliente", nullable = false)
    private UUID uuidCliente;

    // Getters and Setters
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

    public UUID getUuidCliente() {
        return uuidCliente;
    }

    public void setUuidCliente(UUID uuidCliente) {
        this.uuidCliente = uuidCliente;
    }


}
