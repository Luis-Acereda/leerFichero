package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class LecturaTest {

    @Test
    void testLeerFichero() {
        int numCaracteres = Lectura.leerFichero("fichero.txt");
        assertEquals(11, numCaracteres);
    }
}
