package cl.jpinoc.virtualwallet.model.entity.coins;

import cl.jpinoc.virtualwallet.controller.interfaces.IMoneda;

/**
 * Clase que representa la moneda Peso Chileno (CLP).
 * Implementa la interfaz IMoneda para proporcionar el nombre y el valor de la moneda.
 *  @author Jpino.dev
 *  @version 1.0
 */
public class PesoCl implements IMoneda {
    /**
     * Método para obtener el nombre de la moneda.
     *
     * @return el nombre de la moneda ("CLP" para Peso Chileno).
     */
    @Override
    public String getNombre() {
        return "CLP";
    }

    /**
     * Método para obtener el valor de la moneda base.
     * El valor del Peso Chileno es 1.0.
     *
     * @return el valor de la moneda (1.0 para Peso Chileno).
     */
    @Override
    public double getValor() {
        return 1.0;
    }
}
