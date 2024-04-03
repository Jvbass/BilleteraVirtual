package cl.jpinoc.virtualwallet.service;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
* Clase de pruebas unitarias para la clase Conversor.
* @author  Jpino.dev
* */
class ConversorTest {

    @AfterAll
    static void mensajeAlFinal() {
        System.out.println("\n"+"Pruebas finalizadas.");
    }

    @Test
    @DisplayName("Test monedas validas, conversion correcta")
    void convertirMonedasValidasConversionCorrecta() {
        double monto = 100.0;
        String monedaDesde = "USD";
        String monedaA = "CLP";

        assertDoesNotThrow(() -> Conversor.convertir(monto, monedaDesde, monedaA));
    }

    @Test
    @DisplayName("Test moneda origen no existente, arroja excepcion")
    void convertirMonedaOrigenInvalidaArrojaExcepcion() {
        double monto = 100.0;
        String monedaDesde = "INVALID";
        String monedaA = "CLP";

        assertThrows(IllegalArgumentException.class, () -> Conversor.convertir(monto, monedaDesde, monedaA));
    }

    @Test
    @DisplayName("Test moneda destino no existente, arroja excepcion")
    void convertirMonedaDestionInvalidaArrojaExcepcion() {
        double monto = 100.0;
        String monedaDesde = "USD";
        String monedaA = "INVALID";

        assertThrows(IllegalArgumentException.class, () -> Conversor.convertir(monto, monedaDesde, monedaA));
    }

    @Test
    @DisplayName("Test convierte monto negativo, arroja excepcion")
    void convertirMontoNegativoArrojaExcepcion() {
        double monto = -100.0;
        String monedaDesde = "EUR";
        String monedaA = "CLP";

        assertThrows(IllegalArgumentException.class, () -> Conversor.convertir(monto, monedaDesde, monedaA));
    }

    @Test
    @DisplayName("Test convierte monto cero, no arroja excepcion")
    void convertirMontoCeroDevuelveCero() {
        double monto = 0.0;
        String monedaDesde = "USD";
        String monedaA = "CLP";

        assertDoesNotThrow(() -> Conversor.convertir(monto, monedaDesde, monedaA));
    }
}