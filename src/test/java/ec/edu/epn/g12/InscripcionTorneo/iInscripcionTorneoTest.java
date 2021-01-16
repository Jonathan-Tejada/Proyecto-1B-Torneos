package ec.edu.epn.g12.InscripcionTorneo;


import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class iInscripcionTorneoTest {

    @Test
    public void given_cedula_when_esFederado_then_ok() {
        iInscripcionTorneo c = Mockito.mock(iInscripcionTorneo.class);

        Mockito.when(c.esFederado("1750702068")).thenReturn(true);
        assertEquals(true,c.esFederado("1750702068"));
    }
    @Test
    public void given_Cedula_idToreo_when_esAptoParaParticipar_then_ok(){
        iInscripcionTorneo c = Mockito.mock(iInscripcionTorneo.class);

        Mockito.when(c.esAptoParaParticipar("1750702068","15")).thenReturn(true);
        assertEquals(true,c.esAptoParaParticipar("1750702068","15"));
    }
}