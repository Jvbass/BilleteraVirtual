package cl.jpinoc.virtualwallet.model.entity.coins;

import cl.jpinoc.virtualwallet.controller.interfaces.IMoneda;

/**
 * Clase que representa la moneda Euro (EUR).
 * Implementa la interfaz IMoneda para proporcionar el nombre y el valor de la moneda.
 *  @author Jpino.dev
 *  @version 1.0
 */
public class Dolar implements IMoneda {

    /**
     * Método para obtener el nombre de la moneda.
     *
     * @return el nombre de la moneda ("USD" para Dólar estadounidense).
     */
    @Override
    public String getNombre() {
        return "USD";
    }

    /**
     * Método para obtener el valor de la moneda respecto a una unidad base.
     * En este caso, el valor del Dólar estadounidense es 983.04 (por ejemplo, 1 USD = 983.04 CLP).
     *
     * @return el valor de la moneda (983.04 para Dólar estadounidense).
     */
    @Override
    public double getValor() {
        return 983.04;
    }
}
