package ec.edu.epn.g12.CreacionTorneo;

import ec.edu.epn.g12.Objetos.Deporte;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreacionTorneoTest {

    @Test
    public void given_codigo_when_seleccionarDeporte_then_ok(){
        CreacionTorneo c = new CreacionTorneo();
        assertEquals("Tenis", c.seleccionarDeporte(6));
    }

    @Test
    public void given_Deporte_when_definirReglas_then_error() {
        CreacionTorneo c = new CreacionTorneo();
        Deporte d = new Deporte();
        d.setCodigo(11);
        d.setNombre("Badminton");
        d.setSexo("Mixto");
        d.setCategoria("U-20");
        assertNull(c.definirReglas(d,"Default"));
    }

}