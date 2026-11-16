public class Coche extends Vehiculo {

    private int puertas;
    private int plazas;

    public Coche(String pMatricula, String pMarca, String pModelo) {
        super(pMatricula, pMarca, pModelo);
        this.puertas = 0;
        this.plazas = 0;
    }

    public Coche(String pMatricula, String pMarca, String pModelo, int pPuertas, int pPlazas) {
        super(pMatricula, pMarca, pModelo);
        this.puertas = pPuertas;
        this.plazas = pPlazas;
    }

    public int getPuertas() {
        return puertas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPuertas(int pPuertas) {
        this.puertas = pPuertas;
    }

    public void setPlazas(int pPlazas) {
        this.plazas = pPlazas;
    }

    @Override
    public String toString() {
        return "Coche " + super.toString() + ", puertas=" + puertas + ", plazas=" + plazas + "}";
    }
}
