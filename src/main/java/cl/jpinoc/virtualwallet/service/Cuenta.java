package cl.jpinoc.virtualwallet.service;

import cl.jpinoc.virtualwallet.controller.interfaces.IBilletera;
import cl.jpinoc.virtualwallet.model.entity.Movimientos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Cuenta implements IBilletera {
    private double saldo;
    private List<Movimientos> movimientos;

    public Cuenta(double saldo) {
        this.saldo = saldo;
        this.movimientos = new ArrayList<>();
    }

    public Cuenta() {
        this.movimientos = new ArrayList<>();
    }
    public double getSaldo() {
        return saldo;
    }

    public void deposito(double cantidad) {

    }

    @Override
    public void depositar(double cantidad) {
        if (cantidad <= 0 ) {
            System.out.println("No se puede depositar una cantidad negativa o igual a 0");
        } else {
            this.saldo += cantidad;
            Movimientos movimiento = new Movimientos("Depósito", cantidad, LocalDate.now(), LocalTime.now());
            this.movimientos.add(movimiento);
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
            this.movimientos.add(movimiento);
            return true;
        }
    }

    @Override
    public double consultarSaldo() {
        return this.saldo;
    }
}
