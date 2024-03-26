package cl.jpinoc.virtualwallet.model.entity;

import java.util.List;

public class Transaccion {

    private List<Deposito> listaDepositos;
    private List<Retiro> listaRetiros;

    public List<Deposito> getDepositos() {
        return listaDepositos;
    }

    public void guardarDeposito(Deposito deposito){
        listaDepositos.add(deposito);
    }

    public List<Retiro> getRetiros() {
        return listaRetiros;
    }

    public void guardarRetiro(Retiro retiro){
        listaRetiros.add(retiro);
    }

    public void mostrarDepositos(){
        if (listaDepositos.isEmpty()) {
            System.out.println("No hay depósitos que mostrar");
        } else {
            for (Deposito deposito : listaDepositos) {
                System.out.println(deposito.getFecha() + " " + deposito.getHora() + " " + deposito.getMonto() + "\n");
            }
        }
    }

    public void mostrarRetiros(){
        if (listaRetiros.isEmpty()) {
            System.out.println("No hay retiros que mostrar");
        } else {
            for (Retiro retiro : listaRetiros) {
                System.out.println(retiro.getFecha() + " " + retiro.getHora() + " " + retiro.getMonto() + "\n");
            }
        }
    }

    public void mostrarMovimientos(){
        if (listaDepositos.isEmpty() && listaRetiros.isEmpty()) {
            System.out.println("No hay movimientos que mostrar");
        } else {
            mostrarDepositos();
            mostrarRetiros();
        }
    }
}
