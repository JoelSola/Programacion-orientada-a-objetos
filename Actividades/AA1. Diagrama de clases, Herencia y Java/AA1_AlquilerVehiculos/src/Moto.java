public class Moto extends Vehiculo {

    private int cc;

    public Moto (String pMatricula, String pMarca, String pModelo) {
        super (pMatricula, pMarca, pModelo);
        this.cc = 0;
    }

    public Moto (String pMatricula, String pMarca, String pModelo, int pCc) {
        super (pMatricula, pMarca, pModelo);
        this.cc = pCc;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int pCc) {
        this.cc = pCc;
    }

    @Override
    public String toString() {
        return "Moto " + super.toString() + ", cc=" + cc + "}";
    }
}
