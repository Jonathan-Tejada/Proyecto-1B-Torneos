package ec.edu.epn.g12.Objetos;




import java.util.Calendar;
import java.util.GregorianCalendar;

public class Participante {
    private boolean equipo;
    private String identificacion;
    private String nombre;
    private String apellido;
    private GregorianCalendar fecha;
    private String sexo;

    private String equipoPertenece;

    public void imprimirParticipante(){
        if (isEquipo()){
            System.out.println("Equipo");
            System.out.println("IdEquipo: "+ getIdentificacion());
            System.out.println("Nombre: "+ getNombre());
            System.out.println("Fecha de fundacion: "+ getFecha().get(Calendar.YEAR)+"-"+ getFecha().get(Calendar.MONTH)+"-"+ getFecha().get(Calendar.DAY_OF_MONTH));

        }
        else {
            System.out.println("Persona");
            System.out.println("\tCedula: "+ getIdentificacion());
            System.out.println("\tNombre: "+ getNombre());
            System.out.println("\tApellido: "+ getApellido());
            System.out.println("\tFecha de nacimiento: "+ getFecha().get(Calendar.YEAR)+"-"+ getFecha().get(Calendar.MONTH)+"-"+ getFecha().get(Calendar.DAY_OF_MONTH));

        }

        if (getSexo().equalsIgnoreCase("m")){
            System.out.println("Sexo: Masculino");
        }
        else if (getSexo().equalsIgnoreCase("f")){
            System.out.println("Sexo: Femenino");
        }
        else {
            System.out.println("Sexo: Mixto");
        }

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getEquipoPertenece() {
        return equipoPertenece;
    }

    public void setEquipoPertenece(String equipoPertenece) {
        this.equipoPertenece = equipoPertenece;
    }

    public boolean isEquipo() {
        return equipo;
    }

    public void setEquipo(boolean equipo) {
        this.equipo = equipo;
    }


}

