package co.edu.uniquindio.poo;

public enum Tarifa {

    CARRO(8000, 0),
    MOTOHIBRIDA(7000, 0),
    MOTOCLASICA(6000, 0);

    private double tarifaVehiculos;

    private Tarifa(double tarifaVehiculos, int i) {
        this.tarifaVehiculos = tarifaVehiculos;
    }

    public double getTarifaVehiculos() {
        return tarifaVehiculos;
    }

    public void setTarifaVehiculos(double tarifaVehiculos) {
        this.tarifaVehiculos = tarifaVehiculos;
    }

}
