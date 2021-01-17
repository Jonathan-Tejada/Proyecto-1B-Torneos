package ec.edu.epn.g12.GestionUsuario;


import ec.edu.epn.g12.Objetos.Participante;
import ec.edu.epn.g12.Objetos.Usuario;
import ec.edu.epn.g12.Soporte.Ficheros;

import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import static ec.edu.epn.g12.Soporte.Ficheros.muestraContenido;

public class GestorDeUsuarios {

    ArrayList<Usuario> ListaUsuarios = new ArrayList<>();

    public GestorDeUsuarios() {
        obtenerUsuarios();
    }

    public void obtenerUsuarios(){
        ArrayList<String> auxi = new ArrayList<>();
        try {
            auxi = muestraContenido("src/main/resources/usuario.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String linea:auxi) {
            String[] palabras= linea.split(",");
            Usuario objUsuario = new Usuario();
            objUsuario.setUsuario(palabras[0]);
            objUsuario.setPassword(palabras[1]);
            ListaUsuarios.add(objUsuario);
        }
    }

    public boolean ingresoUsuario(Usuario UsuarioIngresado) {
        for (Usuario usr: ListaUsuarios) {
            if (usr.getUsuario().equals(UsuarioIngresado.getUsuario()) &&
            usr.getPassword().equals(UsuarioIngresado.getPassword())) {
                return true;
            }
        }
        return false;
    }

    public void newUser(Usuario User){
        //No aplica para el caso de uso
    }


}