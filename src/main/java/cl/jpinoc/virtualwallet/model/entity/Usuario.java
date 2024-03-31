package cl.jpinoc.virtualwallet.model.entity;
/**
 * Clase que representa un usuario en una billetera virtual.
 * @author Jpino.dev
 * @version 1.0
 */
public class Usuario {
    private static String nombre;
    private static String password;
    private static int numeroCuenta;

    /**
     * Método para obtener el nombre del usuario.
     * @return el nombre del usuario.
     */
    public static String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del usuario.
     * @param nombre el nombre del usuario.
     */
    public static void setNombre(String nombre) {
        Usuario.nombre = nombre;
    }

    /**
     * Método para obtener la contraseña del usuario.
     *
     * @return la contraseña del usuario.
     */
    public static String getPassword() {
        return password;
    }

    /**
     * Método para establecer la contraseña del usuario.
     * @param password la contraseña del usuario.
     */
    public static void setPassword(String password) {
        Usuario.password = password;
    }

    /**
     * Método para obtener el número de cuenta del usuario.
     * @return el número de cuenta del usuario.
     */
    public static int getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Método para establecer el número de cuenta del usuario.
     * @param numeroCuenta el número de cuenta del usuario.
     */
    public static void setNumeroCuenta(int numeroCuenta) {
        Usuario.numeroCuenta = numeroCuenta;
    }
}