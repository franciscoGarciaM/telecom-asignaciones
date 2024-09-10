package com.telecom.asignaciones.Response.external;

import java.math.BigDecimal;
import java.util.Date;

public class ViaticosResponse {
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    private Date fechaInicio;
    private Date fechaFin;
    private BigDecimal monto;

}
