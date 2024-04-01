package cl.jpinoc.virtualwallet;

import cl.jpinoc.virtualwallet.model.entity.Usuario;
import cl.jpinoc.virtualwallet.service.Conversor;
import cl.jpinoc.virtualwallet.service.Cuenta;

import java.util.Scanner;

/**
 * Clase principal que gestiona la interfaz de usuario para la billetera digital.
 * Permite a los usuarios crear una cuenta, autenticarse, administrar fondos,
 * realizar conversiones de moneda y ver un resumen de la cuenta.
 *
 * @author Jpino.dev
 * @version 1.0
 */
public class Main {

    /**
     * Método principal que inicia la aplicación de la billetera digital.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        String nombre = "";
        double cantidad = 0;
        String password;
        int numeroCuenta = (int) (Math.random() * 100000000);
        System.out.println("Bienvenido a tu billetera digital");
        System.out.println("-----------------------------------");

    /*
    * Creación de la cuenta y autenticación del usuario
    */
        do {
            System.out.println("Ingresa tu nombre");
            nombre = sc.next();
            Usuario.setNombre(nombre);

            System.out.println("Crea una contraseña, debe tener al menos 4 caracteres: ");
            password = sc.next();

            Usuario.setPassword(password);
            Usuario.setNumeroCuenta(numeroCuenta);

            System.out.println("Ingresa tu saldo inicial");
            cantidad = sc.nextDouble();
            cuenta.depositar(cantidad);
        } while (Usuario.getNombre().isEmpty() || Usuario.getPassword().length() < 4 || cuenta.consultarSaldo() <= 0);

        System.out.println("Se ha creado la cuenta con número: " + numeroCuenta + "\n");
        System.out.println("Ingrese su contraseña: ");
        password = sc.next();
        boolean autorizacion = false;

        for (int i = 0; i < 3; i++) {
            if (password.equals(Usuario.getPassword())) {
                System.out.print("Bienvenido " + nombre);
                autorizacion = true;
                break;
            } else {
                System.out.println("Contraseña incorrecta, te quedan " + (3 - i) + " intentos");
                password = sc.next();
                if (password.equals(Usuario.getPassword())) {
                    System.out.print("Bienvenido " + nombre);
                    autorizacion = true;
                    break;
                }
            }
        }

        if (!autorizacion) {
            System.out.println("Acceso no autorizado. Cerrando el sistema...");
            return; // Salir del método main y finalizar el programa
        }

        // Menú principal y opciones de la billetera digital
        boolean salir = false;

        while (!salir && autorizacion == true) {
            System.out.println("\n");
            System.out.println(" ");
            System.out.println("Billetera digital de: " + Usuario.getNombre());
            System.out.println("Numero de cuenta: " + Usuario.getNumeroCuenta());
            System.out.println("-----------------------------------");
            System.out.println("1. Consulta saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Ver transacciones");
            System.out.println("5. Ver saldo en otra moneda");
            System.out.println("6. Resumen de cuenta");
            System.out.println("7. Salir");

            switch (sc.nextInt()) {
                // Consultar saldo
                case 1 -> System.out.println("\n Saldo actual: " + cuenta.consultarSaldo());

                case 2 -> {
                    // Depositar en la cuenta
                    System.out.println("\n");
                    System.out.println("Ingrese la cantidad a depositar");
                    cantidad = sc.nextDouble();
                    cuenta.depositar(cantidad);
                }
                case 3 -> {
                    // Retirar fondos de la cuenta
                    System.out.println("\n");
                    System.out.println("Saldo disponible: " + cuenta.consultarSaldo());
                    System.out.println("Ingrese la cantidad a retirar");
                    cantidad = sc.nextDouble();
                    cuenta.retirar(cantidad);
                }
                case 4 -> {
                    // Ver transacciones realizadas
                    System.out.println("\n");
                    System.out.println("Transacciones");
                    cuenta.obtenerMovimientos();
                    System.out.println("-----------------------------------");
                }
                case 5 -> {
                    // Ver saldo en dólares
                    System.out.println("\n");
                    System.out.println("****Saldo en Dolares****");
                    Conversor.convertir(cuenta.consultarSaldo(), "CLP", "USD");
                    System.out.println("-----------------------------------");
                    // Ver saldo en euros
                    System.out.println("****Saldo en Euros****");
                    Conversor.convertir(cuenta.consultarSaldo(), "CLP", "EUR");
                    System.out.println("-----------------------------------");
                }
                case 6 -> {
                    // Opción resumen de la cuenta
                    System.out.println("\n");
                    System.out.println("Resumen de cuenta");
                    System.out.println("Nombre: " + Usuario.getNombre());
                    System.out.println("Numero de cuenta: " + Usuario.getNumeroCuenta());
                    System.out.println("Saldo actual: " + cuenta.consultarSaldo());
                    System.out.print("Saldo en Dolares: ");
                    Conversor.convertir(cuenta.consultarSaldo(), "CLP", "USD");
                    System.out.print("Saldo en Euros: ");
                    Conversor.convertir(cuenta.consultarSaldo(), "CLP", "EUR");
                    System.out.println("Transacciones");
                    cuenta.obtenerMovimientos();
                    System.out.println("-----------------------------------");
                }
                // Salir de la aplicación
                case 7 -> salir = true;
                default -> System.out.println("Opcion no valida");
            }
        } //end of while
    }//end of main
}//end of class
