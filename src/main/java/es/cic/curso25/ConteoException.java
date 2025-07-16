package es.cic.curso25;

public class ConteoException extends RuntimeException {

    private static String ruta;

    public ConteoException(){}

    public ConteoException(String message, String ruta, Throwable throwable){
        super(message, throwable);
        this.ruta = ruta;
    }
}
