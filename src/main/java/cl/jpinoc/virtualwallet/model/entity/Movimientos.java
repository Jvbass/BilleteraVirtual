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

    public double getMonto() {
        return monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }
}

