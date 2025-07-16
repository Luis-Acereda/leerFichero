package es.cic.curso25;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App {

    public static void leerFichero(String ruta){

        int contador = 0;

        File file = new File(ruta);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String linea;
            while((linea = reader.readLine())!= null){
                contador++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
