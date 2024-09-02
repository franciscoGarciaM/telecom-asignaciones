package com.telecom.asignaciones.repository;

import com.telecom.asignaciones.model.Asignacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsignacionRepository extends JpaRepository<Asignacion, Integer> {
}
