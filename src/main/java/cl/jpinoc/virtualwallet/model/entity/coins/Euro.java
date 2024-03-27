package cl.jpinoc.virtualwallet.model.entity.coins;

import cl.jpinoc.virtualwallet.controller.interfaces.IMoneda;

/**
 * Clase que representa la moneda Euro (EUR).
 * Implementa la interfaz IMoneda para proporcionar el nombre y el valor de la moneda.
 *  @author Jpino.dev
 *  @version 1.0
 */
public class Euro implements IMoneda {
    /**
     * Método para obtener el nombre de la moneda.
     *
     * @return el nombre de la moneda ("EUR" para Euro).
     */
    @Override
    public String getNombre() {
        return "EUR";
    }

    /**
     * Método para obtener el valor de la moneda respecto a una unidad base.
     * En este caso, el valor del Euro es 1063.31 (por ejemplo, 1 Euro = 1063.31 CLP).
     *
     * @return el valor de la moneda (1063.31 para Euro).
     */
    @Override
    public double getValor() {
        return 1063.31;
    }
}
