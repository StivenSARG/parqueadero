package co.edu.uniquindio.poo;

public class MotoClasica extends Vehiculo {

    private int velocidadmax;

    public MotoClasica(String nombrePropietario, String placa, String modelo, Tarifa tarifa, int velocidadmax) {
        super(nombrePropietario, placa, modelo, tarifa);
        this.velocidadmax = velocidadmax;
        assert nombrePropietario != null && !nombrePropietario.isBlank();
        assert placa != null && !placa.isBlank();
        assert modelo != null && !modelo.isBlank();
        assert tarifa != null;
    }

    @Override
    public String toString() {
        return "\nMoto clasica: \n" + "Nombre propietario: " + nombrePropietario + "\nPlaca: " + placa
                + "\nModelo vehiculo : " + modelo + "\nTarifa: " + getValorTarifa() + "\nVelocidad maxima: "
                + velocidadmax;
    }

    public int getVelocidadmax() {
        return velocidadmax;
    }

    public void setVelocidadmax(int velocidadmax) {
        this.velocidadmax = velocidadmax;
    }

}
