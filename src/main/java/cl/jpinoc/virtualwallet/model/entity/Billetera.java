package cl.jpinoc.virtualwallet.model.entity;

public class Billetera {
    private double saldo;

    public Billetera(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double cantidad) {
        this.saldo += cantidad;
    }

    public void retiro(double cantidad) {
        this.saldo -= cantidad;
    }
}
