package com.telecom.asignaciones.gastos;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "viaticos", url = "", path = "/api/v1")
public interface ViaticosGastos {

}
