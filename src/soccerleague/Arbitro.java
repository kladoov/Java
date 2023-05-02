
package soccerleague;

public class Arbitro {
    private String nombre;
    private String nacionalidad;
    
public Arbitro() {
    this.nombre = nombreArbitro();
    this.nacionalidad = nacionalidadArbitro();
} 

private String nombreArbitro() {
    String nombres[] = {"Mark Geiger", "Felix Brych", "Nestor Pitana", "Bjorn Kuipers", "Cuneyt Cakir",
                        "Ravshan Irmatov", "Ricardo Montero", "Anthony Taylor", "Daniele Orsato", "Carlos Vera"};
    int nombresRandom = (int)(Math.random()*(nombres.length));
    return nombres[nombresRandom];
}

private String nacionalidadArbitro() {
    String nacionalidad[] = {"Brasil", "Argentina", "España", "Francia", "Alemania", "Inglaterra", "Italia", 
                             "Portugal", "Bélgica", "Holanda"};
    int nacionalidadRandom = (int)(Math.random()*(nacionalidad.length));
    return nacionalidad[nacionalidadRandom];
}

public String getNombreArbitro() {return this.nombre;}
public String getNacionalidadArbitro() {return this.nacionalidad;}


@Override
public String toString() {
    return "Nombre del arbitro: " + nombre + "\nNacionalidad: " + nacionalidad;
}
    
    
}
