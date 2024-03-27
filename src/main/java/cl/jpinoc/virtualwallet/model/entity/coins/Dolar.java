package cl.jpinoc.virtualwallet.model.entity.coins;

import cl.jpinoc.virtualwallet.controller.interfaces.IMoneda;

public class Dolar implements IMoneda {
    @Override
    public String getNombre() {
        return "USD";
    }

    @Override
    public double getValor() {
        return 983.04;
    }
}