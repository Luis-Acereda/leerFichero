package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    void testLeerFichero() {
        App.leerFichero("leer.txt");
    }
}
