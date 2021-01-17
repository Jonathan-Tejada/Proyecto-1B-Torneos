package ec.edu.epn.g12;

import ec.edu.epn.g12.CreacionTorneo.CreacionTorneo;
import ec.edu.epn.g12.GestionUsuario.GestorDeUsuarios;
import ec.edu.epn.g12.InscripcionTorneo.InscripcionTorneo;
import ec.edu.epn.g12.Objetos.Deporte;
import ec.edu.epn.g12.Objetos.Torneo;
import ec.edu.epn.g12.Objetos.Usuario;

import java.util.GregorianCalendar;

public class TorneoExecute {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(" === Bienvenido al sistema === ");
        GestorDeUsuarios GDU= new GestorDeUsuarios();
        Usuario objUsuario = new Usuario();
        System.out.println("Ingrese los datos de inicio de Sesion");
        objUsuario.setUsuario("Juan123");
        objUsuario.setPassword("pasw123");
        objUsuario.imprimirUsuario();
        boolean valUsr =GDU.validarUsuario(objUsuario);
        System.out.println("GDU.validarUsuario(objUsuario)= "+valUsr);
        System.out.println("  ");
        Thread.sleep(500);

        CreacionTorneo CT = new CreacionTorneo();
        System.out.println("Seleccione el deporte");
        String Deporte;
        Deporte=CT.seleccionarDeporte(5);
        System.out.println("CT.seleccionarDeporte(5)= "+Deporte);
        System.out.println("  ");
        Thread.sleep(500);

        System.out.println("Definir parametros del torneo");
        Torneo objTorneo= new Torneo();
        objTorneo.setCodigoDeporte(1);
        objTorneo.setNombre("Copa Simon Bolivar");
        objTorneo.setColectivo(true);
        objTorneo.setFechaInicio(new GregorianCalendar(2021,2,14));
        objTorneo.setFechaFin(new GregorianCalendar(2021 ,5,30));
        objTorneo.setNumeroContendientes(15);
        objTorneo.setNumeroInscritos(0);
        objTorneo.setNumPartidosPorFecha(2);
        objTorneo.setNumFechaPorSemana(2);
        CT.definirTorneo(objTorneo);
        System.out.println("CT.definirTorneo(objTorneo)");

        System.out.println("  ");
        Thread.sleep(500);
        System.out.println("Definir reglas del deporte escogido previamente ("+CT.deporteEscogido.getNombre()+")");
        CT.definirReglas(CT.deporteEscogido,"Default");
        System.out.println("CT.definirReglas(CT.deporteEscogido,''Default'')");
        System.out.println("  ");
        Thread.sleep(500);

        System.out.println("Seleccione el deporte al que se desea inscribir");
        InscripcionTorneo IT= new InscripcionTorneo();
        System.out.println("Lista de "+Deporte);
        IT.consultarTorneo(Deporte);
        System.out.println("IT.consultarTorneo(Deporte)----Deporte="+Deporte);
        System.out.println("  ");
        Thread.sleep(500);



        System.out.println("Seleccione el Torneo");
        Torneo objTorneoSeleccionado = new Torneo();

        objTorneoSeleccionado= IT.selleccionarToneo("Copa Jr. Magdalena");

        System.out.println("  ");
        Thread.sleep(500);



        System.out.println("Lista de Participantes");
        IT.consultarObjParticipantes(objTorneoSeleccionado.isColectivo());

        System.out.println("  ");
        Thread.sleep(500);

        System.out.println("Seleccione el participante");
        IT.seleccionarParticipante("1750702068");

        System.out.println("  ");
        Thread.sleep(500);

        System.out.println("Confirmar Inscripcion");
        IT.inscribirPartipante(IT.participanteEscogido,objTorneoSeleccionado);

        System.out.println("Inscripcion Confirmada");





    }
}
