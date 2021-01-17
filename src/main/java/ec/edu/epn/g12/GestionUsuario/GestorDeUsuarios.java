package ec.edu.epn.g12.GestionUsuario;


import ec.edu.epn.g12.Objetos.Usuario;

import java.io.IOException;
import java.util.ArrayList;

import static ec.edu.epn.g12.Soporte.Ficheros.extraerContenidoDeFichero;

public class GestorDeUsuarios {

    ArrayList<Usuario> ListaUsuarios = new ArrayList<>();

    public GestorDeUsuarios() {
        obtenerUsuarios();
    }

    public void obtenerUsuarios(){
        ArrayList<String> contenido = new ArrayList<>();
        try {
            contenido = extraerContenidoDeFichero("src/main/resources/usuario.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String linea:contenido) {
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