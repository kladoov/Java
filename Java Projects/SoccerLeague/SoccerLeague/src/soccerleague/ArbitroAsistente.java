
package soccerleague;

public class ArbitroAsistente extends Arbitro {
    private String posicion;
    
public ArbitroAsistente(String pos) {
    super();
    this.posicion = pos;
}

public String getposicionArbitro() {return this.posicion;}
    
public String toString() {
    return  "Nombre Linier: " + getNombreArbitro() + 
            "\nNacionalidad: " + 
            getNacionalidadArbitro() + 
            "\n" + "Posicion: " + posicion;
}

}