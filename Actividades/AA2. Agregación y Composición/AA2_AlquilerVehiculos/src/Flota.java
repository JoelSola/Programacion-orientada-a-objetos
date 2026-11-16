import java.util.ArrayList; /** Importamos la colección de ArrayList para trabajar con ellas */

public class Flota {

    /** Declaramos los atributos de "Flota" */

    private String nombreZona;
    private ArrayList<Vehiculo> vehiculos;

    /** Constructor de Flota */

    public Flota(String pNombreZona) {
        this.nombreZona = pNombreZona;
        vehiculos = new ArrayList<>();
    }

    /** Getter y Setter de nombreZona */

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String pNombreZona) {
        this.nombreZona = pNombreZona;
    }

    /** Los métodos para añadir, listar y eliminar vehiculos */

    /** En este metodo añadimos un objeto vehículo de entrada para
     *  posteriormente introducirlo dentro de la lista vehiculos */

    public void addVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    /** En este método listamos todos los vehiculos de la lista "vehiculos" mediante un "for",
     *  por cada recorrido que haga lo mostramos por pantalla con "println" */

    public void listVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);

        }

        /** Si la lista esta vacía mostraremos por pantalla lo siguiente */

        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehiculos en esta flota");
        }
    }

    /** En este método introducimos como parámetro de entrada la matrícula del vehículo
     *  que deseamos eliminar */

    public void removeVehiculo(String matricula) {




        boolean encontrado = false; /* Variable para controlar si se encuentra el vehiculo */

        /** Mediante "for" recorremos cada línea de la lista para detectar
         *  si coincide los atributos "matrícula" de cada objeto "vehículo" con la matrícula introducida */

        for (Vehiculo vehiculo : this.vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                vehiculos.remove(vehiculo);
                System.out.println("Vehiculo eliminado satisfactoriamente");
                encontrado = true;
                break;
            }
        }

        /** Control de error si no coincide con ninguna matrícula*/

        if (!encontrado) {
            System.out.println("Vehiculo no encontrado");
        }

    }

    /** Metodo toString */

    @Override
    public String toString() {
        return "Flota {" + "NombreZona=" + nombreZona + ", \nLista de vehiculos=" + vehiculos + "}";
    }


}
