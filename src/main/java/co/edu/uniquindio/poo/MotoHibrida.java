package co.edu.uniquindio.poo;

public class MotoHibrida extends Vehiculo {

    private int velocidadMax;

    public MotoHibrida(String nombrePropietario, String placa, String modelo, Tarifa tarifa, int velocidadMax) {
        super(nombrePropietario, placa, modelo, tarifa);
        this.velocidadMax = velocidadMax;
        assert nombrePropietario != null && !nombrePropietario.isBlank();
        assert placa != null && !placa.isBlank();
        assert modelo != null && !modelo.isBlank();
        assert tarifa != null;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    @Override
    public String toString() {
        return "\nMoto hibrida: \n" + "Nombre propietario: " + nombrePropietario + "\nPlaca: " + placa
                + "\nModelo vehiculo : " + modelo + "\nTarifa: " + getValorTarifa() + "\nVelocidad maxima: "
                + velocidadMax;
    }

}
