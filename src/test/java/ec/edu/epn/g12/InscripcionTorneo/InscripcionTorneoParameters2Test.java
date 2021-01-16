package ec.edu.epn.g12.InscripcionTorneo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class InscripcionTorneoParameters2Test {
    private Object[] expected ;
    private boolean isColective;

    @Parameterized.Parameters
    public static Iterable<Object[]>  parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{new Object[]{"1 Tornado","2 Niupi","3 Fenix"},true});
        objects.add(new Object[]{new Object[]{"1750702068 Jonathan","1750702088 Maria"},false});

        return objects;
    }

    public InscripcionTorneoParameters2Test(Object[] expected, boolean strIdentificador) {
        this.expected = expected;
        this.isColective = strIdentificador;
    }


    @Test
    public void given_a_boolean_when_consultarParticipantes_then_ok(){
        InscripcionTorneo it =new InscripcionTorneo();
        Object[] actual = it.consultarParticipantes(isColective);
        assertArrayEquals(expected,actual);

    }


}