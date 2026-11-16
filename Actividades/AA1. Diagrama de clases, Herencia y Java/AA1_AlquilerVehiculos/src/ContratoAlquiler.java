import java.util.Date;


public class ContratoAlquiler {

    private Date fechaInicio;
    private Date fechaFin;
    private float precioDia;
    private Vehiculo vehiculo;
    private Cliente cliente;

    public ContratoAlquiler(Date pFechaInicio, Date pFechaFin, float pPrecioDia, Vehiculo pVehiculo, Cliente pCliente) {

        this.fechaInicio = pFechaInicio;
        this.fechaFin = pFechaFin;
        this.precioDia = pPrecioDia;
        this.vehiculo = pVehiculo;
        this.cliente = pCliente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public float getPrecioDia() {
        return precioDia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setFechaInicio(Date pFechaInicio) {
        this.fechaInicio = pFechaInicio;
    }

    public void setFechaFin(Date pFechaFin) {
        this.fechaFin = pFechaFin;
    }

    public void setPrecioDia(float pPrecioDia) {
        this.precioDia = pPrecioDia;
    }

    public void setVehiculo(Vehiculo pVehiculo) {
        this.vehiculo = pVehiculo;
    }

    public void setCliente(Cliente pCliente) {
        this.cliente = pCliente;
    }

    public int nDias(Date pFechaInicio, Date pFechaFin) {
        long nDias = pFechaFin.getTime() - pFechaInicio.getTime();

        return (int)nDias / (1000 * 60 * 60 * 24);
    }

    public float costeTotal(int nDias, float precioDia) {

        return (float)nDias*precioDia;
    }

    @Override
    public String toString() {
        return "ContratoAlquiler {" + "fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin + ", precioDia=" + precioDia +
                ", " + vehiculo + ", " + cliente + "}";
    }
}
