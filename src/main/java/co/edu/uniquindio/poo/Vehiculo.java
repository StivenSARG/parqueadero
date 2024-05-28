package co.edu.uniquindio.poo;

public abstract class Vehiculo {
    public String nombrePropietario;
    public String placa;
    public String modelo;
    private Tarifa tarifa;

    public Vehiculo(String nombrePropietario, String placa, String modelo, Tarifa tarifa) {
        this.nombrePropietario = nombrePropietario;
        this.placa = placa;
        this.modelo = modelo;
        this.tarifa = tarifa;
    }

    public double getValorTarifa() {
        return tarifa.getTarifaVehiculos();
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "Vehiculo: \n" + "Nombre del ropietario: " + nombrePropietario + "\nplaca: " + placa
                + "\nModelo vehiculo: " + modelo + "\ntarifa: " + getValorTarifa();
    }

}
