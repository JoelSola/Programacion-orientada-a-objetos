
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AA2_AlquilerVehiculos {
    /** Creamos el escáner para poder introducir cosas por pantalla */
    Scanner teclado = new Scanner(System.in);
    /** Creo objeto flota para poder añadir vehículos a "Flota 1" */
    private Flota flota = new Flota("Flota 1");

    public static void main(String[] args) {
        AA2_AlquilerVehiculos prg = new AA2_AlquilerVehiculos();
        prg.inicio();
    }

    void inicio() {
        boolean salir = false;
        char opcio;
        do {
            System.out.println("");
            System.out.println("1. Añadir vehiculos en una flota");
            System.out.println("2. Mostrar vehiculos de una flota");
            System.out.println("3. Quitar un vehiculo de una flota");
            System.out.println("4. Ejemplo solución AA1");
            System.out.println("0. Salir de la aplicación");
            opcio = demanarOpcioMenu();
            switch (opcio) {
                case '1':
                    addVehiculoFlota();
                    break;
                case '2':
                    mostrarVehiculosFlota();
                    break;
                case '3':
                    quitarVehiculosFlota();
                    break;
                case '4':
                    ejemploAA1();
                    break;
                case '0':
                    salir = true;
            }
        } while (!salir);
    }

    char demanarOpcioMenu() {
        String resp;
        System.out.print("Elige una opción (1,2,3,4 o 0): ");
        resp = teclado.nextLine();
        if (resp.isEmpty()) {
            resp = " ";
        }
        return resp.charAt(0);
    }

    void addVehiculoFlota() {

        /** Pedimos por pantalla los atributos del vehículo que queremos añadir */

        System.out.print("Introduzca la matricula: ");
        String matricula = teclado.nextLine();
        System.out.print("Introduzca el modelo: ");
        String modelo = teclado.nextLine();
        System.out.print("Introduzca la marca: ");
        String marca = teclado.nextLine();

        /** Pido especificar el tipo de vehículo para añadir otros tipos de atributos según clase de vehículo */

        System.out.print("Que tipo de vehiculo introducirás: [coche, moto o camion] ");
        String tipo  = teclado.nextLine();

        /** Creo la variable vehiculo como parametro de entrada para el metodo "addVehiculo"
         *  esta en valor null porque posteriormente le añadimos el objeto creado */

        Vehiculo vehiculo = null;

        /** Para clasificar dependiendo lo que se pida por pantalla utilizo "switch" y por cada tipo de vehículo "case" */

        switch (tipo) {
            case "coche":
                /** Pedimos por pantalla los atributos de la clase coche */

                System.out.print("Introduzca el numero de puertas: ");
                int puertas = Integer.parseInt(teclado.nextLine());
                System.out.print("Introduzca el numero de plazas: ");
                int plazas = Integer.parseInt(teclado.nextLine());

                /** Creamos y añadimos el objeto "coche" a la variable "vehículo" */

                vehiculo = new Coche(matricula, marca, modelo, puertas, plazas);

                /** Añadimos el coche a la flota y mostramos por pantalla que se ha añadido correctamente */

                flota.addVehiculo(vehiculo);
                System.out.println("El vehiculo se ha añadido correctamente");
                break;

            case "moto":
                /** Pedimos por pantalla el atributo de la clase moto */

                System.out.print("Introduzca el numero de cc:");
                int cc = Integer.parseInt(teclado.nextLine());

                /** Creamos y añadimos el objeto "moto" a la variable "vehículo" */

                vehiculo = new Moto(matricula, marca, modelo, cc);

                /** Añadimos la moto a la flota y mostramos por pantalla que se ha añadido correctamente */

                flota.addVehiculo(vehiculo);
                System.out.println("El vehiculo se ha añadido correctamente");
                break;

            case "camion":
                /** Pedimos por pantalla el atributo de la clase camion */

                System.out.print("Introduzca lo que pesa el camion en kg:");
                int kg = Integer.parseInt(teclado.nextLine());

                /** Creamos y añadimos el objeto "camion" a la variable "vehículo" */

                vehiculo = new Camion(matricula, marca, modelo, kg);

                /** Añadimos el camion a la flota y mostramos por pantalla que se ha añadido correctamente */

                flota.addVehiculo(vehiculo);
                System.out.println("El vehiculo se ha añadido correctamente");
                break;

            /** Control de error si no introducimos solamente alguno de estos tres tipos que no sea válido */

            default:
                System.out.println("Vehiculo no válido, escriba [coche, moto o camion]");
                return;


        }



    }

    /** Muestra por pantalla la flota de vehículos llamando al método "listVehiculos" de la clase "Flota" */

    void mostrarVehiculosFlota() {
        flota.listVehiculos();

    }

    /** Metodo para introducir la matrícula del vehículo que queramos eliminar de la flota */

    void quitarVehiculosFlota() {
        /** Pedimos por pantalla la matricula */

        System.out.print("Introduce la matricula del vehiculo que desea quitar: ");
        String eliminar = teclado.nextLine();

        /** Llamamos al método "removeVehiculo" para eliminar el vehículo mediante la matrícula escrita */

        flota.removeVehiculo(eliminar);


    }

    void ejemploAA1() {
//indicamos el formato de fecha a la que vamos a convertir nuestros tipos String
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");

        //1. Crea un objeto de cada una de las clases Coche, Moto y Camión
        Coche coche1 = new Coche("1122ABC", "Audi", "TT", 2, 4);
        Moto moto1 = new Moto("2233LML", "Piaggio", "Liberty", 125);
        Camion camion1 = new Camion("3344HJK", "Renault", "Jumpy", 560);

        //2. Crea dos objetos de tipo Cliente
        Cliente cliente1 = new Cliente("11222333A", "Ana");
        Cliente cliente2 = new Cliente("22333444B", "Josep");

        //3. Crea tres contratos de alquiler, uno para cada tipo de vehículo, dos de los contratos tendrán el mismo cliente
        ContratoAlquiler contrato1 = new ContratoAlquiler(LocalDate.parse("15/11/2022", formatter), LocalDate.parse("25/11/2022", formatter), 100, coche1, cliente1);
        ContratoAlquiler contrato2 = new ContratoAlquiler(LocalDate.parse("30/03/2022", formatter), LocalDate.parse("04/04/2022", formatter), 60, moto1, cliente2);
        ContratoAlquiler contrato3 = new ContratoAlquiler(LocalDate.parse("16/07/2022", formatter), LocalDate.parse("05/08/2022", formatter), 250, camion1, cliente1);

        //4. Utilizando los métodos toString, muestra por pantalla los datos de todos los objetos que has creado
        System.out.println("\nVEHÍCULOS: \n" + coche1.toString() + "\n" + moto1.toString() + "\n" + camion1.toString());
        System.out.println("\n///////////////////////////////////////////////////  \n");

        System.out.println("CLIENTES: \n" + cliente1 + "\n" + cliente2 + "\n");
        System.out.println("\n///////////////////////////////////////////////////  \n");

        System.out.println("\nCONTRATOS DE ALQUILER: \n" + "\nContrato 1" + contrato1
                + "\nContrato 2" + contrato2
                + "\nContrato 3" + contrato3);
    }

}
