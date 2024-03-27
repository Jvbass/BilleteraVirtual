package cl.jpinoc.virtualwallet;

import cl.jpinoc.virtualwallet.service.Cuenta;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        String nombre = "";
        double cantidad = 0;
        String password;
        int numeroCuenta = (int) (Math.random() * 100000000);


        System.out.println("Bienvenido a tu billetera digital");
        System.out.println("-----------------------------------");


        do {
            System.out.println("Ingresa tu nombre");
            nombre = sc.next();
            System.out.println("Crea una contraseña");
            password = sc.next();
            System.out.println("Ingresa tu saldo inicial");
            cantidad = sc.nextDouble();
            cuenta.depositar(cantidad);
        } while (nombre.isEmpty() || password.isEmpty() || cantidad <= 0);

        System.out.println("Se ha creado la cuenta con número: " + numeroCuenta);
        System.out.println("Ingrese su contraseña: ");
        password = sc.next();

        boolean salir = false;
        boolean volver = false;

        do {
            System.out.println("\n");
            System.out.println("Billetera digital de: " + nombre);
            System.out.println("Numero de cuenta: " + numeroCuenta);
            System.out.println("-----------------------------------");
            System.out.println("1. Administracion de tus fondos");
            System.out.println("2. Ver saldo en otra moneda");
            System.out.println("3. Resumen de cuenta");
            System.out.println("4. Salir");
            System.out.println("\n");

            do {
                switch (sc.nextInt()) {
                    case 1 -> {
                        System.out.println("Administracion de fondos");
                        System.out.println("-----------------------------------");
                        System.out.println("1. Depositar");
                        System.out.println("2. Retirar");
                        System.out.println("3. Consultar saldo");
                        System.out.println("4. Ver transacciones");
                        System.out.println("5. Volver al menu principal");
                        switch (sc.nextInt()) {
                            case 1 -> {
                                System.out.println("\n");
                                System.out.println("Ingrese la cantidad a depositar");
                                cantidad = sc.nextDouble();
                                cuenta.depositar(cantidad);
                            }

                            case 2 -> {
                                System.out.println("\n");
                                System.out.println("Ingrese la cantidad a retirar");
                                cantidad = sc.nextDouble();
                                cuenta.retirar(cantidad);
                            }

                            case 3 -> System.out.println("Saldo actual: " + cuenta.consultarSaldo());
                            case 4 -> {
                                System.out.println("Transacciones");
                                cuenta.obtenerMovimientos();
                                System.out.println("-----------------------------------");

                            }
                            case 5 -> volver = true;
                            default -> System.out.println("Opcion no valida");
                        }
                    }
                    case 2 -> {
                        System.out.println("Ver saldo en otra moneda");
                        System.out.println("-----------------------------------");
                        System.out.println("1. Ver saldo en dolares");
                        System.out.println("2. Ver saldo en euros");
                        System.out.println("3. Volver al menu principal");
                        switch (sc.nextInt()) {
                            case 1 -> {
                                System.out.println("****Saldo en Dolares****");

                                System.out.println("-----------------------------------");
                            }

                            case 2 -> {
                                System.out.println("****Saldo en Euros****");
                                System.out.println("-----------------------------------");
                            }

                            case 3 -> volver = true;
                            default -> System.out.println("Opcion no valida");
                        }
                    }
                    case 3 -> {
                        System.out.println("Resumen de cuenta");
                        System.out.println("-----------------------------------");

                    }

                    case 4 -> salir = true;
                    default -> System.out.println("Opcion no valida");
                }
            } while (volver);

        } while (!salir);

    }//end of main
}//end of class
