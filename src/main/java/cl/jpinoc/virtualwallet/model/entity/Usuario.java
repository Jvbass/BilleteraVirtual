package cl.jpinoc.virtualwallet.model.entity;

public class Usuario {
    private static String nombre;
    private static String password;
    private static int numeroCuenta;

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Usuario.nombre = nombre;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Usuario.password = password;
    }

    public static int getNumeroCuenta() {
        return numeroCuenta;
    }

    public static void setNumeroCuenta(int numeroCuenta) {
        Usuario.numeroCuenta = numeroCuenta;
    }
}
