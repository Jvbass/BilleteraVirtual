package cl.jpinoc.virtualwallet.model.entity.coins;

import cl.jpinoc.virtualwallet.controller.interfaces.IMoneda;

public class Euro implements IMoneda {

    @Override
    public String getNombre() {
        return "EUR";
    }

    @Override
    public double getValor() {
        return 1063.31;
    }
}
