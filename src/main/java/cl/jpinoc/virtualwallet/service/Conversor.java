package cl.jpinoc.virtualwallet.service;

import cl.jpinoc.virtualwallet.controller.interfaces.IMoneda;
import cl.jpinoc.virtualwallet.model.entity.coins.Dolar;
import cl.jpinoc.virtualwallet.model.entity.coins.Euro;
import cl.jpinoc.virtualwallet.model.entity.coins.PesoCl;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase que proporciona métodos para convertir entre diferentes monedas.
 *  @author Jpino.dev
 *  @version 1.0
 */
public class Conversor {
   /**
    *Map que almacena las instancias de IMoneda para cada moneda segun su clave Nombre.
    * Todas las clases que implementen IMoneda pueden ser agregadas a este map como valor.
    */
    private static Map<String, IMoneda> monedas = new HashMap<>();

    // Poblamos el map con las monedas disponibles
    static {
        monedas.put("USD", new Dolar());
        monedas.put("EUR", new Euro());
        monedas.put("CLP", new PesoCl());
    }

    /**
     * Método para convertir un monto de una moneda a otra.
     *
     * @param monto el monto a convertir.
     * @param monedaOrigen la moneda de origen.
     * @param monedaDestino la moneda de destino.
     * @exception IllegalArgumentException si alguna de las monedas no se encuentra en el map.
     * @exception IllegalArgumentException si el monto es negativo.
     * @see IMoneda
     */
    public static void convertir(double monto, String monedaOrigen, String monedaDestino) {
        // Obtener las instancias de IMoneda correspondientes a las monedas de origen y destino
        IMoneda monedaDesde = monedas.get(monedaOrigen);
        IMoneda monedaA = monedas.get(monedaDestino);

        // Verificar si las monedas existen en el map
        if (monedaDesde == null || monedaA == null) {
            throw new IllegalArgumentException("Moneda no encontrada");
        }
        // Verificar si el monto es válido
        if (monto < 0) {
            throw new IllegalArgumentException("El monto debe ser mayor o igual a 0");
        }

        // Realizar la conversión
        double resultado = (monto * monedaDesde.getValor()) / monedaA.getValor();
        String resultadoString = String.format("%.2f", resultado);

        // Imprimir el resultado de la conversión
        System.out.println(monto + " " + monedaDesde.getNombre() + " = " + resultadoString + " " + monedaA.getNombre());
    }
}
