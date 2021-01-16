package ec.edu.epn.g12.InscripcionTorneo;

import org.junit.Before;
import org.junit.Test;

import java.util.GregorianCalendar;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class InscripcionTorneoTest {
    InscripcionTorneo it;

    @Before
    public void setUp(){
        it = new InscripcionTorneo();

    }

    @Test
    public void given_a_sport_when_consultarTorneos_then_ok(){
        System.out.println("Test 1");
        assertArrayEquals(new Object[]{"Copa Piston","Liga Mena 2"},it.consultarTorneo("Futbol"));
    }

    @Test(timeout=50)
    public void given_a_sport_when_consultarTorneos_then_timeout_50(){
        System.out.println("Test 2");
        assertArrayEquals(new Object[]{"Copa Piston","Liga Mena 2"},it.consultarTorneo("Futbol"));
    }

    @Test
    public void given_a_non_registered_sport_when_consultarTorneos_then_ok(){
        System.out.println("Test 3");
        assertNull(it.consultarTorneo("Basquet"));
    }

    @Test
    public void given_a_boolean_when_consultarParticipantes_then_ok(){

        assertArrayEquals(new Object[]{"1 Tornado","2 Niupi","3 Fenix"},it.consultarParticipantes(true));
        System.out.println("Test 4");
    }

    @Test
    public void given_false_when_consultarParticipantes_then_ok(){

        assertArrayEquals(new Object[]{"1750702068 Jonathan","1750702088 Maria"},it.consultarParticipantes(false));
        System.out.println("Test 5");
    }

    @Test
    public void given_identificador_when_seleccionarParticipante_then_ok(){
        System.out.println("Test 6");
        assertEquals("Niupi",it.seleccionarParticipante("2"));
    }

    @Test
    public void given_identificador_when_seleccionarParticipante_then_error(){
        System.out.println("Test 7");
        assertNotNull(it.seleccionarParticipante("1"));
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void given_an_integer_when_seleccionarParticipante_then_exception(){
        System.out.println("Test 8");
        assertSame("Las ñañas fc",it.seleccionarParticipante(100));
    }

}