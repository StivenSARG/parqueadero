package co.edu.uniquindio.poo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static Scanner mensaje = new Scanner(System.in);
    public static Parqueadero parqueadero = new Parqueadero(6);

    public static void main(String[] args) {

        int opcion = 0;
        while (opcion != 6) {/* Abre el menu principal del parqueadero */
            System.out.println("\nMenu Principal");
            System.out.println("1.Cambiar tarifa valor hora vehiculo");
            System.out.println("2.Verificar disponibilidad puesto");
            System.out.println("3.Ingresar vehículo");
            System.out.println("4.Retirar vehiculo");
            System.out.println("5.Registro de vehiculos");
            System.out.println("6.Salir");

            System.out.println("Ingrese la opcion que desea realizar: ");
            opcion = mensaje.nextInt();

            switch (opcion) {
                case 1:
                    cambioTarifaValor();

                    break;
                case 2:
                    disponibilidadPuesto();

                    break;

                case 3:
                    registrarVehiculo();

                    break;
                case 4:

                    System.out.println("Ingrese la posición (i,j) del puesto a desocupar");

                    int i = mensaje.nextInt();
                    int j = mensaje.nextInt();

                    parqueadero.desocuparPuesto(i, j);

                    break;

                case 5:
                    parqueadero.mostrarRegistroParqueadero();

                case 6:
                    System.out.println("Saliendo del sistema.......");

                    break;
            }

        } /* Cierra el menu principal del parquedero */

    }

    private static void cambioTarifaValor() {
        System.out.println("\n Elija el vehiculo para el cambio de tarifa-hora según las opciones ");

        System.out.println("\n1.Carro, 2.Moto hibrida, 3.Moto clasica");

        int tipoVehiculo = mensaje.nextInt();
        System.out.println("Ingrese la nueva tarifa: ");
        double nuevaTarifa = mensaje.nextDouble();
        switch (tipoVehiculo) {
            case 1:
                parqueadero.cambiarTarifa(Tarifa.CARRO, nuevaTarifa);
                break;

            case 2:
                parqueadero.cambiarTarifa(Tarifa.MOTOHIBRIDA, nuevaTarifa);
                break;

            case 3:
                parqueadero.cambiarTarifa(Tarifa.MOTOCLASICA, nuevaTarifa);
                break;

            default:
                System.out.println("La opcion no es valida.");
                break;
        }
    }

    private static void registrarVehiculo() {
        System.out.println(
                "\nSeleccione el tipo de vehiculo según las siguientes opciones: \n1.Carro, 2.Moto hibrida, 3.Moto clasica\n");

        System.out.println("Ingrese el tipo de Vehiculo: ");
        int tipoVehiculo = mensaje.nextInt();

        mensaje.nextLine();

        System.out.println("Ingrese el nombre del propietario: ");
        String nombrePropietario = mensaje.nextLine();

        System.out.println("Ingrese la placa del vehiculo: ");
        String placa = mensaje.nextLine();

        System.out.println("Ingrese el modelo del vehiculo: ");
        String modelo = mensaje.nextLine();
        mensaje.nextLine();

        int velocidadMax = 0;

        if (tipoVehiculo == 2 || tipoVehiculo == 3) {
            System.out.println("Ingrese velocidad maxima: ");
            velocidadMax = mensaje.nextInt();
        }

        System.out.println("Ingrese la posición (i,j): ");
        int i = mensaje.nextInt();
        int j = mensaje.nextInt();

        switch (tipoVehiculo) {
            case 1:
                parqueadero.registrarVehiculo(new Carro(nombrePropietario, placa, modelo, Tarifa.CARRO), i, j);
                break;
            case 2:
                parqueadero.registrarVehiculo(
                        new MotoHibrida(nombrePropietario, placa, modelo, Tarifa.MOTOHIBRIDA, velocidadMax), i, j);
                break;
            case 3:
                parqueadero.registrarVehiculo(
                        new MotoClasica(nombrePropietario, placa, modelo, Tarifa.MOTOCLASICA, velocidadMax), i, j);
                System.out.println("Vehiculo registrado correctamente.");

                break;

            default:
                System.out.println("El tipo de vehiculo no se pudo registrar.");
                break;
        }

    }

    private static void disponibilidadPuesto() {
        System.out.println("Ingrese la posición (i,j) del puesto que quiere verificar su disponibilidad.");
        int i = mensaje.nextInt();
        int j = mensaje.nextInt();

        System.out.println(parqueadero.buscarPuesto(i, j));

    }

}
