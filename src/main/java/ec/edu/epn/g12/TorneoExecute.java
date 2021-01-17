package ec.edu.epn.g12;

import ec.edu.epn.g12.CreacionTorneo.CreacionTorneo;
import ec.edu.epn.g12.GestionUsuario.GestorDeUsuarios;
import ec.edu.epn.g12.InscripcionTorneo.InscripcionTorneo;
import ec.edu.epn.g12.Objetos.Usuario;

public class TorneoExecute {
    public static void main(String[] args){

        System.out.println(" === Bienvenido al sistema === ");
        GestorDeUsuarios GDU= new GestorDeUsuarios();
        Usuario objUsuario = new Usuario();
        System.out.println("Ingrese los datos de inicio de Sesion");
        objUsuario.setUsuario("Juan123");
        objUsuario.setPassword("pasw123");
        objUsuario.imprimirUsuario();
        boolean valUsr =GDU.validarUsuario(objUsuario);
        System.out.println("GDU.validarUsuario(objUsuario)= "+valUsr);

        InscripcionTorneo IT= new InscripcionTorneo();

        CreacionTorneo CT = new CreacionTorneo();
    }
}
