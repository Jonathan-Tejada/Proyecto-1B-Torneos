package ec.edu.epn.g12.GestionUsuario;

import ec.edu.epn.g12.Objetos.Usuario;
import org.junit.Test;

import static org.junit.Assert.*;

public class GestorDeUsuariosTest {

    @Test
    public void given_credentiales_when_ingresoUsuarios_then_ok(){
        GestorDeUsuarios gu = new GestorDeUsuarios();
        Usuario user = new Usuario();
        user.setUsuario("Luchoxtu");
        user.setPassword("pasw896");
        assertTrue(gu.ingresoUsuario(user));
    }

}