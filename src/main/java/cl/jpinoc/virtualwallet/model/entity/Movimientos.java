package cl.jpinoc.virtualwallet.model.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Movimientos {
    private String tipoMovimiento; //retiro o deposito
    private double monto;
    private LocalDate fecha;
    private LocalTime hora;

    public Movimientos(String tipoMovimiento, double monto, LocalDate fecha, LocalTime hora) {
        this.tipoMovimiento = tipoMovimiento;
        this.monto = monto;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha() {
        this.fecha = LocalDate.now();
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = LocalTime.now();
    }

}

