public abstract class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;


    public Vehiculo(String pMatricula, String pMarca, String pModelo) {
        this.matricula = pMatricula;
        this.marca = pMarca;
        this.modelo = pModelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMatricula(String pMatricula) {
        this.matricula = pMatricula;
    }

    public void setMarca(String pMarca) {
        this.marca = pMarca;
    }

    public void setModelo(String pModelo) {
        this.modelo = pModelo;
    }

    @Override
    public String toString() {
        return "{" + "matricula=" + matricula + ", marca=" + marca  + ", modelo=" + modelo;
    }
}

