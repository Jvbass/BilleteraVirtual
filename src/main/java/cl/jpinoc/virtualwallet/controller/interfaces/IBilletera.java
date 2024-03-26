package cl.jpinoc.virtualwallet.controller.interfaces;

public interface IBilletera {
public void depositar(double cantidad);
    public boolean retirar(double cantidad);
    public double consultar();

}
