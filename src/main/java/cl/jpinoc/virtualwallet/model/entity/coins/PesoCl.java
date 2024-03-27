package cl.jpinoc.virtualwallet.model.entity.coins;

import cl.jpinoc.virtualwallet.controller.interfaces.IMoneda;

public class PesoCl implements IMoneda {

    @Override
    public String getNombre() {
        return "CLP";
    }

    @Override
    public double getValor() {
        return 1.0;
    }
}
