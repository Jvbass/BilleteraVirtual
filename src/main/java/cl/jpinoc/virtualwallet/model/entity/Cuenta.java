package cl.jpinoc.virtualwallet.model.entity;

import cl.jpinoc.virtualwallet.controller.interfaces.IBilletera;

public class Cuenta implements IBilletera {
    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double cantidad) {

    }

    @Override
    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }

    @Override
    public boolean retirar(double cantidad) {
        if (this.saldo < cantidad) return false;
        else {
            this.saldo -= cantidad;
            return true;
        }
    }

    @Override
    public double consultar() {
        return this.saldo;
    }
}
