package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Parqueadero {

    private Collection<Puesto> puestos;
    private Collection<Vehiculo> registroVehiculos;

    public Parqueadero(int numeroPuesto) {
        puestos = new LinkedList<>();
        registroVehiculos = new LinkedList<>();

        for (int i = 0; i < numeroPuesto; i++) {
            for (int j = 0; j < numeroPuesto; j++) {
                puestos.add(new Puesto(i, j));
            }

        }
    }

    public void registrarVehiculo(Vehiculo vehiculo, int i, int j) {
        Puesto puesto = buscarPuesto(i, j);
        if (puesto != null && !puesto.puestoOcupado()) {
            puesto.ocuparPuesto(vehiculo);
            registroVehiculos.add(vehiculo);
            System.out.println("El vehiculo ocupo el puesto (" + i + "," + j + ")");
        } else {
            System.out.println("El puesto se encuentra ocupado o no existe la posición en el parqueadero");
        }
    }

    public void desocuparPuesto(int i, int j) {
        Puesto puesto = buscarPuesto(i, j);
        if (puesto != null && puesto.puestoOcupado()) {
            puesto.desocuparPuesto();
        } else {
            System.out.println("El puesto esta vacio o no existe en el parqueadero");
        }

    }

    public Puesto buscarPuesto(int i, int j) {
        for (Puesto puesto : puestos) {
            if (puesto.getI() == i && puesto.getJ() == j) {
                return puesto;
            }
        }
        return null;
    }

    public void mostrarPuestos() {
        for (Puesto puesto : puestos) {
            System.out.println(puesto);
        }
    }

    public void mostrarRegistroParqueadero() {
        for (Vehiculo vehiculo : registroVehiculos) {
            int[] posicion = buscarPosicionVehiculo(vehiculo);
            if (posicion != null) {
                System.out.println(vehiculo.toString() + "\n" + "Posición: (" + posicion[0] + ", " + posicion[1] + ")");
            }
        }
    }

    private int[] buscarPosicionVehiculo(Vehiculo vehiculo) {
        for (Puesto puesto : puestos) {
            if (puesto.getVehiculo() != null && puesto.getVehiculo().equals(vehiculo)) {
                return new int[] { puesto.getI(), puesto.getJ() };
            }
        }
        return null;
    }

    public void cambiarTarifa(Tarifa tipoVehiculo, double nuevaTarifa) {
        tipoVehiculo.setTarifaVehiculos(nuevaTarifa);
        System.out.println("La tarifa para: " + tipoVehiculo.name() + " se cambio a: " + nuevaTarifa);
    }

}
