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

public class CarroTest {
    private static final Logger LOG = Logger.getLogger(CarroTest.class.getName());

    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datosCompletos");

        Carro carro = new Carro("Carlos", "ts234b", "toyota", Tarifa.CARRO);

        assertEquals("Carlos", carro.getNombrePropietario());
        assertEquals("ts234b", carro.getPlaca());
        assertEquals("toyota", carro.getModelo());
        assertEquals(Tarifa.CARRO, carro.getTarifa());

        LOG.info("Finalizando test datosCompletos");
    }

    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datosVacios");

        assertThrows(Throwable.class, () -> new Carro(
                "", "", "", Tarifa.CARRO));

        LOG.info("Finalizando test datosVacios");
    }

    @Test
    public void datosNulos() {
        LOG.info("Iniciado test datosNulos");

        assertThrows(Throwable.class, () -> new Carro(
                null, null, null, null));

        LOG.info("Finalizando test datosNulos");
    }

}
