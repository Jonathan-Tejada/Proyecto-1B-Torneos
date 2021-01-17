package ec.edu.epn.g12.Objetos;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Torneo {
    private int codigoDeporte;
    private String nombre;
    private GregorianCalendar fechaInicio;
    private GregorianCalendar fechaFin;
    private int numeroContendientes;
    private int numPartidosPorFecha;
    private int numFechaPorSemana;
    private int numeroInscritos;
    private boolean colectivo;

    public void imprimirTorneo(boolean adicional){
        System.out.println("\t----Torneo-----");
        System.out.println("\tCodigoDeporte: "+codigoDeporte);
        System.out.println("\tNombre: "+nombre);
        System.out.println("\tFecha Inicio: "+fechaInicio.get(Calendar.YEAR)+"-"+fechaInicio.get(Calendar.MONTH)+"-"+fechaInicio.get(Calendar.DAY_OF_MONTH));
        System.out.println("\tFecha Fin: "+fechaFin.get(Calendar.YEAR)+"-"+fechaFin.get(Calendar.MONTH)+"-"+fechaFin.get(Calendar.DAY_OF_MONTH));
        if (adicional) {
            System.out.println("\tNumero de Contendientes: " + numeroContendientes);
            System.out.println("\tNumero de Partidos Por Fecha: " + numPartidosPorFecha);
            System.out.println("\tNumero de Fechas Por Semana: " + numFechaPorSemana);
            System.out.println("\tNumero de Inscritos: " + numeroInscritos);
            System.out.println("\tColectivo: " + colectivo);
        }
    }





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

    public int getNumPartidosPorFecha() {
        return numPartidosPorFecha;
    }

    public void setNumPartidosPorFecha(int numPartidosPorFecha) {
        this.numPartidosPorFecha = numPartidosPorFecha;
    }

    public int getNumFechaPorSemana() {
        return numFechaPorSemana;
    }

    public void setNumFechaPorSemana(int numFechaPorSemana) {
        this.numFechaPorSemana = numFechaPorSemana;
    }

    public int getNumeroInscritos() {
        return numeroInscritos;
    }

    public void setNumeroInscritos(int numeroInscritos) {
        this.numeroInscritos = numeroInscritos;
    }
}

