package cl.jpinoc.virtualwallet.service;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la clase Cuenta.
 * @author   Jpino.dev
 */

class CuentaTest {

    private Cuenta cuenta;

    @BeforeEach
    void nuevaCuenta() {
        cuenta = new Cuenta();
    }

    @AfterAll
    static void mensajeAlFinal() {
        System.out.println("\n"+"Pruebas finalizadas.");
    }

    @Test
    @DisplayName("Test deposito monto positivo, compruba suma en saldo")
    void depositarMontoPositivoSumaSaldo() {
        double montoInicial = cuenta.consultarSaldo();
        double montoDeposito = 100.0;

        cuenta.depositar(montoDeposito);

        assertEquals(montoInicial + montoDeposito, cuenta.consultarSaldo());
    }

    @Test
    @DisplayName("Test deposito monto negativo, compruba no hay cambio en saldo")
    void depositarMontoNegativoNoCambiaSaldo() {
        double montoInicial = cuenta.consultarSaldo();
        double montoDeposito = -50.0;

        cuenta.depositar(montoDeposito);

        assertEquals(montoInicial, cuenta.consultarSaldo());
    }

    @Test
    @DisplayName("Test retiro monto menor al saldo, compruba resta en saldo")
    void retirarMontoMenorAlSaldoDisminuyeSaldo() {
        double montoDeposito = 100.0;
        double montoRetiro = 50.0;
        cuenta.depositar(montoDeposito);

        boolean result = cuenta.retirar(montoRetiro);

        assertTrue(result);
        assertEquals(montoDeposito - montoRetiro, cuenta.consultarSaldo());
    }

    @Test
    @DisplayName("Test retiro monto mayor al saldo disponible, comprueba no hay cambio en saldo")
    void retirarMontoMayorAlSaldoNoCambiaSaldo() {
        double montoDeposito = 100.0;
        double montoRetiro = 150.0;
        cuenta.depositar(montoDeposito);

        boolean result = cuenta.retirar(montoRetiro);

        assertFalse(result);
        assertEquals(montoDeposito, cuenta.consultarSaldo());
    }

    @Test
    @DisplayName("Test retiro monto negativo, comprueba no hay cambio en saldo")
    void retirarMontoNegativoNoCambiaSaldo() {
        double montoDeposito = 100.0;
        double montoRetiro = -50.0;
        cuenta.depositar(montoDeposito);

        boolean result = cuenta.retirar(montoRetiro);

        assertFalse(result);
        assertEquals(montoDeposito, cuenta.consultarSaldo());
    }


    @Test
    @DisplayName("Test deposito monto cero, comprueba no hay cambio en saldo")
    void depositarCeroNoCambiaSaldo() {
        double montoInicial = cuenta.consultarSaldo();
        double montoDeposito = 0.0;

        cuenta.depositar(montoDeposito);

        assertEquals(montoInicial, cuenta.consultarSaldo());
    }

    @Test
    @DisplayName("Test retiro monto cero, comprueba no hay cambio en saldo")
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
    @DisplayName("Test retiro monto igual al saldo disponible, comprueba saldo en cero")
    void retirarMontoIgualSaldo() {
        double montoDeposito = 100.0;
        cuenta.depositar(montoDeposito);

        boolean result = cuenta.retirar(montoDeposito);

        assertTrue(result);
        assertEquals(0.0, cuenta.consultarSaldo());
    }
}