package cl.jpinoc.virtualwallet.model.entity;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Clase que representa un movimiento realizado en una cuenta de billetera virtual.
 *  @author Jpino.dev
 *  @version 1.0
 */
public class Movimientos {

    // Tipo de movimiento: "Deposito" o "Retiro"
    private String tipoMovimiento;
    // Monto del movimiento
    private double monto;
    // Fecha del movimiento
    private LocalDate fecha;
    // Hora del movimiento
    private LocalTime hora;

    /**
     * Constructor de la clase Movimientos.
     *
     * @param tipoMovimiento el tipo de movimiento ("Deposito" o "Retiro").
     * @param monto el monto del movimiento.
     * @param fecha la fecha del movimiento.
     * @param hora la hora del movimiento.
     */
    public Movimientos(String tipoMovimiento, double monto, LocalDate fecha, LocalTime hora) {
        this.tipoMovimiento = tipoMovimiento;
        this.monto = monto;
        this.fecha = fecha;
        this.hora = hora;
    }

    /**
     * Método para obtener el tipo de movimiento.
     *
     * @return el tipo de movimiento ("Deposito" o "Retiro").
     */
    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    /**
     * Método para obtener el monto del movimiento.
     *
     * @return el monto del movimiento.
     */
    public double getMonto() {
        return monto;
    }

    /**
     * Método para obtener la fecha del movimiento.
     *
     * @return la fecha del movimiento.
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Método para obtener la hora del movimiento.
     *
     * @return la hora del movimiento.
     */
    public LocalTime getHora() {
        return hora;
    }
}
