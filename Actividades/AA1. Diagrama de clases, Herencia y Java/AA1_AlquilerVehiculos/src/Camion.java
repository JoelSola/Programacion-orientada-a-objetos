public class Camion extends Vehiculo {

    private int kg;

    public Camion(String pMatricula, String pMarca, String pModelo) {
        super(pMatricula, pMarca, pModelo);
        this.kg = 0;
    }

    public Camion(String pMatricula, String pMarca, String pModelo, int pKg) {
        super(pMatricula, pMarca, pModelo);
        this.kg = pKg;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int pKg) {
        this.kg = pKg;
    }

    @Override
    public String toString() {
        return "Camion " + super.toString() + ", kg=" + kg + "}";
    }
}
