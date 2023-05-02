
package Excepciones;

public class ArbitroExcepcion extends Exception {
    private int codError;
    private String mensaje;
    
public ArbitroExcepcion() {
    this.codError = (int)(Math.random()*(20-11)+1);
    this.mensaje = ". Arbitro debe ser de nacionalidad distinta a los equipos a arbitrar";
}

@Override
public String toString() {
    return "Codigo " + this.codError + " " + this.mensaje;
}

}
