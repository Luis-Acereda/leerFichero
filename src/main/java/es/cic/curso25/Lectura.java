package es.cic.curso25;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {

    public static int leerFichero(String ruta) {
        int contador = 0;

        File file = new File(ruta);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            while (reader.read() != -1) {
                contador++;
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contador;
    }
}
