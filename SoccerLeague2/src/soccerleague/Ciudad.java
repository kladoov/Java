
package soccerleague;

public class Ciudad {
    private String nombreCiudad;
    private String paisCiudad;

public Ciudad() {
    this.nombreCiudad = nombreCiudad();
    this.paisCiudad = paisCiudad();
}

private String paisCiudad() {
    String pais[] = {"España", "Italia", "Rusia", "Francia", "Alemania", "Eslovaquia", "Croacia", "Turquia", "Grecia"};
    int paisRandom = (int)(Math.random()*(pais.length));
    return pais[paisRandom];
}

private String nombreCiudad() {
    String ciudad[] = {"Madrid", "Paris", "Berlin", "Valencia", "La Roda", "Kiev", "Lviv", "Moscow"};
    int ciudadRandom = (int)(Math.random()*(ciudad.length));
    return ciudad[ciudadRandom];
}

public String getNombreCiudad() {return this.nombreCiudad;}
public String getPaisCiudad() {return this.paisCiudad;}

public String toString() {
    return "\nNOMBRE CIUDAD: " + this.nombreCiudad + "\nPAIS CIUDAD: " + this.paisCiudad;
}
    
}