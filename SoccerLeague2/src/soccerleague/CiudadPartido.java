
package soccerleague;

public class CiudadPartido extends Ciudad {
    private String estadioFutbolNombre;
    private String estadioFutbolDireccion;
   
public CiudadPartido() {
    super();
    this.estadioFutbolNombre = estadioNombre();
    this.estadioFutbolDireccion = estadioDireccion();
}

private String estadioNombre() {
    String estadio[] = {"Bernabeu", "Carlos Belmonte", "Spotify Camp Nou", "Charmander", "Bulbasur"};
    int estadioRandom = (int)(Math.random()*(estadio.length));
    return estadio[estadioRandom];
}

private String estadioDireccion() {
    String direccion[] = {"Avd. Los 100 pozuelos", "C/ Echegaray", "Avd. Hermanos Falco", "Avd. España"};
    int direccionRandom = (int)(Math.random()*(direccion.length));
    return direccion[direccionRandom];
}

public String getEstadioFutbolNombre() {return this.estadioFutbolNombre;}
public String getEstadioFutbolDireccion() {return this.estadioFutbolDireccion;}

public String toString() {
    return super.toString() + "\nNOMBRE DEL ESTADIO: " + this.estadioFutbolNombre
                            + "\nDIRECCION DEL ESTADIO: " + this.estadioFutbolDireccion;
}
    
}