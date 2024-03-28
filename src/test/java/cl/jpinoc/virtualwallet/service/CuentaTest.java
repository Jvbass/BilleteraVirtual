package cl.jpinoc.virtualwallet.service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    private Cuenta cuenta;

    @BeforeEach
    void setUp() {
        cuenta = new Cuenta();
    }

    @Test
    void depositarMontoPositivoSumaSaldo() {
        double montoInicial = cuenta.consultarSaldo();
        double montoDeposito = 100.0;

        cuenta.depositar(montoDeposito);

        assertEquals(montoInicial + montoDeposito, cuenta.consultarSaldo());
    }

    @Test
    void depositarMontoNegativoNoCambiaSaldo() {
        double montoInicial = cuenta.consultarSaldo();
        double montoDeposito = -50.0;

        cuenta.depositar(montoDeposito);

        assertEquals(montoInicial, cuenta.consultarSaldo());
    }

    @Test
    void retirarMontoMenorAlSaldoDisminuyeSaldo() {
        double montoDeposito = 100.0;
        double montoRetiro = 50.0;
        cuenta.depositar(montoDeposito);

        boolean result = cuenta.retirar(montoRetiro);

        assertTrue(result);
        assertEquals(montoDeposito - montoRetiro, cuenta.consultarSaldo());
    }

    @Test
    void retirarMontoMayorAlSaldoNoCambiaSaldo() {
        double montoDeposito = 100.0;
        double montoRetiro = 150.0;
        cuenta.depositar(montoDeposito);

        boolean result = cuenta.retirar(montoRetiro);

        assertFalse(result);
        assertEquals(montoDeposito, cuenta.consultarSaldo());
    }

    @Test
    void retirarMontoNegativoNoCambiaSaldo() {
        double montoDeposito = 100.0;
        double montoRetiro = -50.0;
        cuenta.depositar(montoDeposito);

        boolean result = cuenta.retirar(montoRetiro);

        assertFalse(result);
        assertEquals(montoDeposito, cuenta.consultarSaldo());
    }


    @Test
    void depositarCeroNoCambiaSaldo() {
        double montoInicial = cuenta.consultarSaldo();
        double montoDeposito = 0.0;

        cuenta.depositar(montoDeposito);

        assertEquals(montoInicial, cuenta.consultarSaldo());
    }

    @Test
    void retirarCeroNoCambiaSaldo() {
        double montoDeposito = 100.0;
        cuenta.depositar(montoDeposito);
        double montoInicial = cuenta.consultarSaldo();
        double montoRetiro = 0.0;

        boolean result = cuenta.retirar(montoRetiro);

        assertFalse(result);
        assertEquals(montoInicial, cuenta.consultarSaldo());
    }

    @Test
    void retirarMontoIgualSaldo() {
        double montoDeposito = 100.0;
        cuenta.depositar(montoDeposito);

        boolean result = cuenta.retirar(montoDeposito);

        assertTrue(result);
        assertEquals(0.0, cuenta.consultarSaldo());
    }
}