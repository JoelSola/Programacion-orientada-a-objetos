import java.util.ArrayList;

public class VehiculosRent {

    private String nif;
    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Flota> flotas;
    private ArrayList<Agencia> agencias;

    /** Constructor de "VehiculosRent" */

    public VehiculosRent(String pNif, String pNombre) {
        this.nif = pNif;
        this.nombre = pNombre;
        this.clientes = new ArrayList<>();
        this.flotas = new ArrayList<>();
        this.agencias = new ArrayList<>();
    }

    /** Getters y Setters */

    public String getNif() {
        return nif;
    }

    public void setNif(String pNif) {
        this.nif = pNif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    /** Metodo toString */

    @Override
    public String toString() {
        return "VehiculosRent {" + "nif= " + nif + ", nombre= " + nombre +
                "\nLista de Clientes= " + clientes + ", \nLista de Flotas= " + flotas +
                "\nLista de Agencias= " + agencias + "}";
    }


}
