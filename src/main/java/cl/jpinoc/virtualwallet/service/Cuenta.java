package cl.jpinoc.virtualwallet.service;

import cl.jpinoc.virtualwallet.controller.interfaces.IBilletera;
import cl.jpinoc.virtualwallet.model.entity.Movimientos;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Clase que representa una cuenta en una billetera virtual.
 * @author Jpino.dev
 * @version 1.0
 */
public class Cuenta implements IBilletera {

    // Saldo de la cuenta
    private double saldo;

    // Instancia de Transacciones para gestionar los movimientos de la cuenta
    private Transacciones transacciones;

    /**
     * Constructor de la clase Cuenta.
     * Inicializa la instancia de Transacciones asociada a la cuenta.
     */
    public Cuenta() {
        this.transacciones = new Transacciones();
    }

    /**
     * Método para depositar una cantidad en la cuenta.
     *
     * @param cantidad la cantidad a depositar.
     * @exception IllegalArgumentException si la cantidad es negativa o igual a 0.
     */
    @Override
    public void depositar(double cantidad) {
        // Verificar si la cantidad es válida
        if (cantidad <= 0 ) {
            System.out.println("No se puede depositar una cantidad negativa o igual a 0");
        } else {
            // Actualizar el saldo y registrar el movimiento de depósito
            this.saldo += cantidad;
            Movimientos movimiento = new Movimientos("Deposito", cantidad, LocalDate.now(), LocalTime.now());
            this.transacciones.agregarMovimiento(movimiento);
        }
    }

    /**
     * Método para retirar una cantidad de la cuenta.
     *
     * @param cantidad la cantidad a retirar.
     * @return true si el retiro fue exitoso, false si no se pudo realizar.
     * @exception  IllegalArgumentException si la cantidad es negativa o mayor al saldo.
     */
    @Override
    public boolean retirar(double cantidad) {
        // Verificar si el retiro es válido
        if (this.saldo < cantidad || cantidad <= 0 ){
            System.out.println("No se puede retirar una cantidad negativa o mayor al saldo");
            return false;
        }
        else {
            // Actualizar el saldo y registrar el movimiento de retiro
            this.saldo -= cantidad;
            Movimientos movimiento = new Movimientos("Retiro", cantidad, LocalDate.now(), LocalTime.now());
            this.transacciones.agregarMovimiento(movimiento);
            return true;
        }
    }

    /**
     * Método para consultar el saldo de la cuenta.
     *
     * @return el saldo actual de la cuenta.
     */
    @Override
    public double consultarSaldo() {
        return this.saldo;
    }

    /**
     * Método para obtener los movimientos realizados en la cuenta.
     * Imprime en la consola los detalles de los movimientos registrados.
     * @see Transacciones#listarMovimientos()
     */
    public void obtenerMovimientos() {
        transacciones.listarMovimientos();
    }
}
