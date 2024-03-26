package cl.jpinoc.virtualwallet.model.entity;

public class Retiro {
    private double monto;
    private String fecha;
    private String hora;

    public Retiro(double monto, String fecha, String hora) {
        this.monto = monto;
        this.fecha = fecha;
        this.hora = hora;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
