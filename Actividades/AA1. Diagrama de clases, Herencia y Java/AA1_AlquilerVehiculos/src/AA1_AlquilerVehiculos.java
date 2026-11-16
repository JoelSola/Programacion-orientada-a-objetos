import java.util.Date;

public class AA1_AlquilerVehiculos {

    public static void main(String[] args) {
        AA1_AlquilerVehiculos aa1 = new AA1_AlquilerVehiculos();
        aa1.inicio();
    }

    void inicio() {
        // Crea un objeto de cada una de las clases Coche, Moto y Camión.
        Coche coche1 = new Coche("JSJ747", "Seat", "Ibiza", 4, 5);
        Moto moto1 = new Moto("JSJ748", "Aprilia", "SXR 50", 50);
        Camion camion1 = new Camion("JSJ749","DAF", "CF 430", 9882);

        // Crea dos objetos de tipo cliente.
        Cliente cliente1 = new Cliente("82656358F", "Alex");
        Cliente cliente2 = new Cliente("82657864F", "Martina");

        // Crea tres contratos de alquiler, uno para cada tipo de vehículo, dos de los contratos tendrán el mismo cliente.

        // Contrato Coche
        Date inicioA1 = new Date(126, 7, 12);
        Date finA1 = new Date(126, 7, 22);

        ContratoAlquiler contratoCoche = new ContratoAlquiler(inicioA1, finA1, 10.33f, coche1, cliente2);

        // Contrato Moto
        Date inicioA2 = new Date(126, 2, 5);
        Date finA2 = new Date(126, 2, 10);

        ContratoAlquiler contratoMoto = new ContratoAlquiler(inicioA2, finA2, 8.28f, moto1, cliente2);

        // Contrato Camion
        Date inicioA3 = new Date(126, 0, 1);
        Date finA3 = new Date(126, 0, 12);

        ContratoAlquiler contratoCamion = new ContratoAlquiler(inicioA3, finA3, 25.84f, camion1, cliente1);


        // Utilizando los métodos toString, muestra por pantalla los datos de todos los objetos que has creado.
        System.out.println(coche1.toString());
        System.out.println(moto1.toString());
        System.out.println(camion1.toString());
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println(contratoCoche.toString());
        System.out.println(contratoMoto.toString());
        System.out.println(contratoCamion.toString());

    }


}
