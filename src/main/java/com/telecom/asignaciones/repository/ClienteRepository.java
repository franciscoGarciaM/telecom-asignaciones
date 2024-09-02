package com.telecom.asignaciones.repository;

import com.telecom.asignaciones.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
}
