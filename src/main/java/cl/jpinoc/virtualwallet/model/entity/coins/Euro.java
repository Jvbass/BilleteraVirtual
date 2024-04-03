package cl.jpinoc.virtualwallet.model.entity.coins;

import cl.jpinoc.virtualwallet.controller.interfaces.IMoneda;

/**
 * Clase que representa la moneda Euro (EUR).
 * Implementa la interfaz IMoneda para proporcionar el nombre y el valor de la moneda.
 *  @author Jpino.dev
 *  @version 1.0
 */
public class Euro implements IMoneda {

    private final String nombre = "EUR";
    private final double valor = 1063.31;
    /**
     * Método para obtener el nombre de la moneda.
     *
     * @return el nombre de la moneda ("EUR" para Euro).
     */
    @Override
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Método para obtener el valor de la moneda respecto a una unidad base.
     * En este caso, el valor del Euro equivale a 1063.31 CLP.
     *
     * @return el valor de la moneda (1063.31 para Euro).
     */
    @Override
    public double getValor() {
        return this.valor;
    }
}
