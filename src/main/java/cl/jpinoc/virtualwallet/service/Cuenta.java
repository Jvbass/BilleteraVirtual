package cl.jpinoc.virtualwallet.service;

import cl.jpinoc.virtualwallet.controller.interfaces.IBilletera;
import cl.jpinoc.virtualwallet.model.entity.Movimientos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Cuenta implements IBilletera {
    private double saldo;
    private Transacciones transacciones;


    public Cuenta(double saldo) {
        this.saldo = saldo;
    }
    public void deposito(double cantidad) {
    }

    public Cuenta() {
        this.transacciones = new Transacciones();
    }
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double cantidad) {
        if (cantidad <= 0 ) {
            System.out.println("No se puede depositar una cantidad negativa o igual a 0");
        } else {
            this.saldo += cantidad;
            Movimientos movimiento = new Movimientos("Deposito", cantidad, LocalDate.now(), LocalTime.now());
            this.transacciones.agregarMovimiento(movimiento); // Asegúrate de tener un método para agregar movimientos en la clase Transacciones

        }
    }

    @Override
    public boolean retirar(double cantidad) {
        if (this.saldo < cantidad || cantidad <= 0 ){
            System.out.println("No se puede retirar una cantidad negativa o mayor al saldo");
            return false;
        }
        else {
            this.saldo -= cantidad;
            Movimientos movimiento = new Movimientos("Retiro", cantidad, LocalDate.now(), LocalTime.now());
            this.transacciones.agregarMovimiento(movimiento);
            return true;
        }
    }

    @Override
    public double consultarSaldo() {
        return this.saldo;
    }

    public void obtenerMovimientos() {
        transacciones.listarMovimientos();
    }

}
