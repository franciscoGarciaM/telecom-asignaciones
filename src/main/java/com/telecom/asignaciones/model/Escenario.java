package com.telecom.asignaciones.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "escenario")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Escenario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "escenario_id_gen")
    @SequenceGenerator(name = "escenario_id_gen", sequenceName = "escenario_id_escenario_seq", allocationSize = 1)
    @Column(name = "id_escenario", nullable = false)
    private Integer id;

    @Column(name = "nombre_escenario", length = Integer.MAX_VALUE)
    private String nombreEscenario;

    @Column(name = "descripcion_escenario", length = Integer.MAX_VALUE)
    private String descripcionEscenario;

    @Column(name = "tipo_escenario", length = Integer.MAX_VALUE)
    private String tipoEscenario;

    @Column(name = "uuid_escenario", nullable = false)
    private UUID uuidEscenario;

    @OneToMany(mappedBy = "idEscenario")
    private Set<Asignacion> asignacions = new LinkedHashSet<>();

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreEscenario() {
        return nombreEscenario;
    }

    public void setNombreEscenario(String nombreEscenario) {
        this.nombreEscenario = nombreEscenario;
    }

    public String getDescripcionEscenario() {
        return descripcionEscenario;
    }

    public void setDescripcionEscenario(String descripcionEscenario) {
        this.descripcionEscenario = descripcionEscenario;
    }

    public String getTipoEscenario() {
        return tipoEscenario;
    }

    public void setTipoEscenario(String tipoEscenario) {
        this.tipoEscenario = tipoEscenario;
    }

    public UUID getUuidEscenario() {
        return uuidEscenario;
    }

    public void setUuidEscenario(UUID uuidEscenario) {
        this.uuidEscenario = uuidEscenario;
    }

    public Set<Asignacion> getAsignacions() {
        return asignacions;
    }

    public void setAsignacions(Set<Asignacion> asignacions) {
        this.asignacions = asignacions;
    }
}
