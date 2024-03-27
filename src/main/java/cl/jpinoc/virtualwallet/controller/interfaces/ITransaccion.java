package cl.jpinoc.virtualwallet.controller.interfaces;

/**
 * Interfaz que define el contrato para las transacciones en una billetera virtual.
 *  @author Jpino.dev
 *  @version 1.0
 */
public interface ITransaccion {

    /**
     * Método para listar los movimientos realizados en la billetera virtual.
     * Este método debe ser implementado por las clases que gestionan las transacciones.
     */
    public void listarMovimientos();
}
