package ec.edu.epn.g12.InscripcionTorneo;



import java.util.GregorianCalendar;

public class TorneoBean {
    private int codigoDeporte;
    private String nombre;
    private GregorianCalendar fechaInicio;
    private GregorianCalendar fechaFin;
    private int numeroContendientes;
    private boolean colectivo;





    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public GregorianCalendar getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(GregorianCalendar fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getNumeroContendientes() {
        return numeroContendientes;
    }

    public void setNumeroContendientes(int numeroContendientes) {
        this.numeroContendientes = numeroContendientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoDeporte() {
        return codigoDeporte;
    }

    public void setCodigoDeporte(int codigoDeporte) {
        this.codigoDeporte = codigoDeporte;
    }

    public boolean isColectivo() {
        return colectivo;
    }

    public void setColectivo(boolean colectivo) {
        this.colectivo = colectivo;
    }
}

