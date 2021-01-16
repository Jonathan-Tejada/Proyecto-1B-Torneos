package ec.edu.epn.g12.InscripcionTorneo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class InscripcionTorneoParametersTest {
    private String expected,strIdentificador;

    @Parameterized.Parameters
    public static Iterable<Object[]>  parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{"Tornado","1"});
        objects.add(new Object[]{"Niupi","2"});
        objects.add(new Object[]{"Fenix","3"});
        objects.add(new Object[]{null,"4"});
        return objects;
    }

    public InscripcionTorneoParametersTest(String expected, String strIdentificador) {
        this.expected = expected;
        this.strIdentificador = strIdentificador;
    }

    @Test
    public void given_identificador_when_seleccionarParticipante_then_ok(){

        InscripcionTorneo it =new InscripcionTorneo();
        String actual = it.seleccionarParticipante(strIdentificador);
        assertEquals(expected,actual);
    }

}