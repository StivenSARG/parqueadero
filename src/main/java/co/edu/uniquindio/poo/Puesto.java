package co.edu.uniquindio.poo;

public class Puesto {
    private int i;
    private int j;
    private Vehiculo vehiculo;

    public Puesto(int i, int j) {
        this.i = i;
        this.j = j;
        this.vehiculo = null;
    }

    public boolean puestoOcupado() {
        return vehiculo != null;
    }

    public void ocuparPuesto(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void desocuparPuesto() {
        this.vehiculo = null;
    }

    @Override
    public String toString() {
        return ("En la posición: " + i + "," + j + " del parqueadero "
                + (puestoOcupado() ? vehiculo : "se encuentra libre)"));
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

}
