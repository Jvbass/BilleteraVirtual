package cl.jpinoc.virtualwallet.service;

import cl.jpinoc.virtualwallet.controller.interfaces.ITransaccion;
import cl.jpinoc.virtualwallet.model.entity.Movimientos;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona las transacciones realizadas en una billetera virtual.
 * @author Jpino.dev
 * @version 1.0
 */
public class Transacciones implements ITransaccion {

    // Lista que almacena los movimientos realizados
    private List<Movimientos> movimiento;

    /**
     * Constructor de la clase Transacciones.
     * Inicializa la lista de movimientos vacía.
     */
    public Transacciones() {
        this.movimiento = new ArrayList<>();
    }

    /**
     * Método para agregar un nuevo movimiento a la lista de movimientos.
     *
     * @param movimiento el movimiento a agregar.
     */
    public void agregarMovimiento(Movimientos movimiento) {
        this.movimiento.add(movimiento);
    }

    /**
     * Método para listar todos los movimientos registrados.
     * Imprime en la consola los detalles de cada movimiento, incluyendo el tipo, monto, fecha y hora.
     * @see Movimientos
     */
    public void listarMovimientos() {
        // Formateador de fecha y hora
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Verificar si la lista de movimientos está vacía
        if (movimiento.isEmpty()) {
            System.out.println("No hay movimientos que mostrar");
        } else {
            // Iterar sobre la lista de movimientos y mostrar cada uno
            for (Movimientos movimiento : movimiento) {
                // Imprimir el tipo de movimiento, monto, fecha y hora
                if (movimiento.getTipoMovimiento().equals("Deposito")) {
                    System.out.println("Deposito: " + movimiento.getMonto() + " " + movimiento.getFecha() + " " + movimiento.getHora().format(formatoHora) + "\n");
                } else {
                    System.out.println("Retiro: -" + movimiento.getMonto() + " " + movimiento.getFecha() + " " + movimiento.getHora().format(formatoHora) + "\n");
                }
            }
        }
    }
}
