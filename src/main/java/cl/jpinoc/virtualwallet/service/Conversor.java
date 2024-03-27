package cl.jpinoc.virtualwallet.service;

import cl.jpinoc.virtualwallet.controller.interfaces.IMoneda;
import cl.jpinoc.virtualwallet.model.entity.coins.Dolar;
import cl.jpinoc.virtualwallet.model.entity.coins.Euro;
import cl.jpinoc.virtualwallet.model.entity.coins.PesoCl;

import java.util.HashMap;
import java.util.Map;

public class Conversor {
    private static Map<String, IMoneda> coins = new HashMap<>();

    static {
        coins.put("USD", new Dolar());
        coins.put("EUR", new Euro());
        coins.put("CLP", new PesoCl());
    }

    public static void  convertir(double monto, String desde, String a) {
        IMoneda monedaDesde = coins.get(desde);
        IMoneda monedaA = coins.get(a);

        if (monedaDesde == null || monedaA == null) {
            throw new IllegalArgumentException("Moneda no encontrada");
        }
        double result = (monto * monedaDesde.getValor()) / monedaA.getValor();

        System.out.println(monto + " " + monedaDesde.getNombre() + " = " + result + " " + monedaA.getNombre());
    }
}
