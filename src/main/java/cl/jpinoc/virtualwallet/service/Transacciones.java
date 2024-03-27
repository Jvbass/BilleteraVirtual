package cl.jpinoc.virtualwallet.service;

import cl.jpinoc.virtualwallet.controller.interfaces.ITransaccion;
import cl.jpinoc.virtualwallet.model.entity.Movimientos;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Transacciones implements ITransaccion{

    private List<Movimientos> movimiento;

    public Transacciones(){
        this.movimiento = new ArrayList<>();
    }

    public void agregarMovimiento(Movimientos movimiento){
        this.movimiento.add(movimiento);
    }

    public void listarMovimientos(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        if (movimiento.isEmpty()){
            System.out.println("No hay movimientos que mostrar");
        } else {
            for (Movimientos movimiento : movimiento) {
                if (movimiento.getTipoMovimiento().equals("Deposito")){
                    System.out.println("Deposito: " + movimiento.getMonto() + " " + movimiento.getFecha() + " " + movimiento.getHora().format(formatter) + "\n");
                } else {
                    System.out.println("Retiro: -" + movimiento.getMonto() + " " + movimiento.getFecha() + " " + movimiento.getHora().format(formatter) + "\n");
                }
            }
        }
    }
}
