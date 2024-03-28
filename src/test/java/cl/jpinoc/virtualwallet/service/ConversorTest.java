package cl.jpinoc.virtualwallet.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversorTest {

    @Test
    void convertirMonedasValidasConversionCorrecta() {
        double monto = 100.0;
        String monedaDesde = "USD";
        String monedaA = "CLP";

        assertDoesNotThrow(() -> Conversor.convertir(monto, monedaDesde, monedaA));
    }

    @Test
    void convertirMonedaOrigenInvalidaArrojaExcepcion() {
        double monto = 100.0;
        String monedaDesde = "INVALID";
        String monedaA = "CLP";

        assertThrows(IllegalArgumentException.class, () -> Conversor.convertir(monto, monedaDesde, monedaA));
    }

    @Test
    void convertirMonedaDestionInvalidaArrojaExcepcion() {
        double monto = 100.0;
        String monedaDesde = "USD";
        String monedaA = "INVALID";

        assertThrows(IllegalArgumentException.class, () -> Conversor.convertir(monto, monedaDesde, monedaA));
    }

    @Test
    void convertirMontoNegativoArrojaExcepcion() {
        double monto = -100.0;
        String monedaDesde = "EUR";
        String monedaA = "CLP";

        assertThrows(IllegalArgumentException.class, () -> Conversor.convertir(monto, monedaDesde, monedaA));
    }

    @Test
    void convertirMontoCeroDevuelveCero() {
        double monto = 0.0;
        String monedaDesde = "USD";
        String monedaA = "CLP";

        assertDoesNotThrow(() -> Conversor.convertir(monto, monedaDesde, monedaA));
    }
}