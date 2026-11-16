import java.util.ArrayList;

public class Agencia {

    private String nombre;
    private Flota flota;
    private ArrayList<ContratoAlquiler> contratosAlquiler;

    /** Constructor de "Agencia" */

    public Agencia(String pNombre, Flota pFlota){
        this.nombre = pNombre;
        this.flota = pFlota;
        this.contratosAlquiler = new ArrayList<>();
    }

    /** Getters y Setters */

    public String getNombre() {
        return nombre;
    }

    public Flota getFlota() {
        return flota;
    }

    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    public void setFlota(Flota pFlota) {
        this.flota = pFlota;
    }

    /** Metodo toString */

    @Override
    public String toString() {
        return "Agencia {" + "nombre=" + nombre + ", flota=" + flota + ", " +
                "\n Lista de Contratos de Alquiler=" + contratosAlquiler + "}";
    }
}
