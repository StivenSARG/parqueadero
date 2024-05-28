package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class MotoClasicaTest {

    private static final Logger LOG = Logger.getLogger(MotoHibridaTest.class.getName());

    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datosCompletos");

        MotoClasica motoClasica = new MotoClasica("Carlos", "ts234b", "toyota", Tarifa.MOTOCLASICA, 125);

        assertEquals("Carlos", motoClasica.getNombrePropietario());
        assertEquals("ts234b", motoClasica.getPlaca());
        assertEquals("toyota", motoClasica.getModelo());
        assertEquals(Tarifa.MOTOCLASICA, motoClasica.getTarifa());
        assertEquals(125, motoClasica.getVelocidadmax());

        LOG.info("Finalizando test datosCompletos");
    }

    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datosVacios");

        assertThrows(Throwable.class, () -> new MotoClasica("", "", "", Tarifa.MOTOCLASICA, 170));

        LOG.info("Finalizando test datosVacios");
    }

    @Test
    public void datosNulos() {
        LOG.info("Iniciado test datosNulos");

        assertThrows(Throwable.class, () -> new MotoClasica(null, null, null, null, 0));

        LOG.info("Finalizando test datosNulos");
    }
}
