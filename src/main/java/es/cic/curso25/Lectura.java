package es.cic.curso25;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {

    public static int leerFichero(String ruta) {
        int contador = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(new File(ruta)))) {

            while (reader.read() != -1) {
                contador++;
            }
        
        } catch (IOException ioe) {
            throw new ConteoException(
                String.format("Problema con el conteo del fichero %s", ruta),
                ruta,
                ioe);
        }

        return contador;
    }
}
