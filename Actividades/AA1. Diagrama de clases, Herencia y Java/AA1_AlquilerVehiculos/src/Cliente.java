public class Cliente {
    private String nif;
    private String nombre;

    public Cliente(String pNif, String pNombre) {
        this.nif = pNif;
        this.nombre = pNombre;
    }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNif(String pNif) {
        this.nif = pNif;
    }

    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    @Override
    public String toString() {
        return "Cliente {" + "nif=" + nif + ", nombre=" + nombre + "}";
    }
}
