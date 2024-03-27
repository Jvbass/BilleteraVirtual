package cl.jpinoc.virtualwallet.controller.interfaces;

/**
 * Interfaz que define el contrato para representar una moneda en una billetera virtual.
 *  @author Jpino.dev
 *  @version 1.0
 */
public interface IMoneda {

    /**
     * Método para obtener el nombre de la moneda.
     *
     * @return el nombre de la moneda.
     */
    String getNombre();

    /**
     * Método para obtener el valor de la moneda respecto a una unidad base.
     *
     * @return el valor de la moneda.
     */
    double getValor();
}
