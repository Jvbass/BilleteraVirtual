package cl.jpinoc.virtualwallet.model.entity;

import java.util.List;

public class Transacciones {

    private List<Movimientos> movimiento;

    public List<Movimientos> getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(List<Movimientos> movimiento) {
        this.movimiento = movimiento;
    }

    public void agregarMovimiento(Movimientos movimiento){
        this.movimiento.add(movimiento);
    }


    public void mostrarMovimientos(){
        if (movimiento.isEmpty()) {
            System.out.println("No hay movimientos que mostrar");
        } else {
            for (Movimientos movimiento : movimiento) {
                System.out.println(movimiento.getTipoMovimiento() + " " + movimiento.getFecha() + " " + movimiento.getHora() + " " + movimiento.getMonto() + "\n");
            }
        }
    }
}
