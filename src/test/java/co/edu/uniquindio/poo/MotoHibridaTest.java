package co.edu.uniquindio.poo;

/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class MotoHibridaTest {
    private static final Logger LOG = Logger.getLogger(MotoHibridaTest.class.getName());

    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datosCompletos");

        MotoHibrida motoHibrida = new MotoHibrida("Carlos", "ts234b", "toyota", Tarifa.MOTOHIBRIDA, 170);

        assertEquals("Carlos", motoHibrida.getNombrePropietario());
        assertEquals("ts234b", motoHibrida.getPlaca());
        assertEquals("toyota", motoHibrida.getModelo());
        assertEquals(Tarifa.MOTOHIBRIDA, motoHibrida.getTarifa());
        assertEquals(170, motoHibrida.getVelocidadMax());

        LOG.info("Finalizando test datosCompletos");
    }

    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datosVacios");

        assertThrows(Throwable.class, () -> new MotoHibrida("", "", "", Tarifa.MOTOHIBRIDA, 170));

        LOG.info("Finalizando test datosVacios");
    }

    @Test
    public void datosNulos() {
        LOG.info("Iniciado test datosNulos");

        assertThrows(Throwable.class, () -> new MotoHibrida(null, null, null, null, 0));

        LOG.info("Finalizando test datosNulos");
    }

}
