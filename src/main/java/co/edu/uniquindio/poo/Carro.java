package co.edu.uniquindio.poo;

public class Carro extends Vehiculo {

    public Carro(String nombrePropietario, String placa, String modelo, Tarifa tarifa) {
        super(nombrePropietario, placa, modelo, tarifa);
        assert nombrePropietario != null && !nombrePropietario.isBlank();
        assert placa != null && !placa.isBlank();
        assert modelo != null && !modelo.isBlank();
        assert tarifa != null;

    }

    @Override
    public String toString() {
        return "\n Se ubica un carro: \n" + "Nombre propietario: " + nombrePropietario + "\nPlaca: " + placa
                + "\nModelo del vehiculo: " + modelo + "\nTarifa: " + getValorTarifa();
    }

}
