
package Excepciones;

public class NumeroImparEquiposExcepcion extends Exception {
    private int codError;
    private String mensaje;

public NumeroImparEquiposExcepcion() {
    this.codError = (int)(Math.random()*(10-1)+1);
    this.mensaje = ". Numero impar de equipos.";
}

public String toString() {
    return "Codigo de error " + codError + " " + mensaje; 
}
   
}
