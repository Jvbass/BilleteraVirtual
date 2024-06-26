package cl.jpinoc.virtualwallet.controller.interfaces;

/**
 * Interfaz que define el contrato para una billetera virtual.
 *  @author Jpino.dev
 *  @version 1.0
 */
public interface ICuenta {

    /**
     * Método para depositar una cantidad en la billetera.
     *
     * @param cantidad la cantidad a depositar.
     */
    void depositar(double cantidad);

    /**
     * Método para retirar una cantidad de la billetera.
     *
     * @param cantidad la cantidad a retirar.
     * @return true si el retiro fue exitoso, false si no se pudo realizar.
     */
    boolean retirar(double cantidad);

    /**
     * Método para consultar el saldo actual de la billetera.
     *
     * @return el saldo actual de la billetera.
     */
    double consultarSaldo();

}
