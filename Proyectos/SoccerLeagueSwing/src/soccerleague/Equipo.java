
package soccerleague;

import java.time.LocalDate;
import java.util.ArrayList;

public class Equipo {
   
    private String nombre;
    private String ciudad;
    private String pais;
    private String estadio;
    private LocalDate fechaFundacion;
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private ArrayList<Equipo> equipos = new ArrayList<>();


public Equipo() {}

public Equipo (String nom, String ciu, String pa, String est, int año, int mes, int dia) {
    this.nombre = nom;
    this.ciudad = ciu;
    this.pais = pa;
    this.estadio = est;
    this.fechaFundacion = LocalDate.of(año, mes, dia);
    jugadores = new ArrayList<>();
    equipos = new ArrayList<>();
}


//---------------------------------------------------------------------------------------------------------------------------------------
//AÑADIR JUGADORES 1 A 1 AL ARRAYLIST
public void añadeJugador() {
    Jugador jug = new Jugador();
    jugadores.add(jug);
}
//AÑADIR JUGADORES AL ARRAYLIST JUGADORES
public void añadirJugadores() {
    for(int i = 0; i < 11; i++) {
        Jugador jug = new Jugador();
        jugadores.add(jug);
    }
}
public void visualizarJugadores() {
    for(int i = 0; i < jugadores.size(); i++) {
        System.out.println(jugadores.get(i).toString());
    }
}


//---------------------------------------------------------------------------------------------------------------------------------------
//CREAMOS LOS CLUBS
public void añadeEquipo() {
equipos.add(new Equipo("Real Madrid C.F", "Madrid", "España", "Santiago Bernabeu", 1902, 03, 06));
equipos.add(new Equipo("Juventus F.C", "Turín", "Italia", "Allianz Stadium", 1897, 11, 01));
equipos.add(new Equipo("Manchester City", "Manchester", "Inglaterra", "Etihad Stadium", 1880, 11, 23));
equipos.add(new Equipo("Barcelona F.C", "Barcelona", "España", "Spotify Camp Nou", 1899, 11, 29));
equipos.add(new Equipo("Real Betis Balompié S.A.D", "Sevilla", "España", "Benito Villamarín", 1929, 05, 19));
equipos.add(new Equipo("F.C Dinamo de Kiev", "Kiev", "Ucrania", "Olimpico de Kiev", 1923, 10, 12));
equipos.add(new Equipo("La Roda F.C", "Albacete", "España", "Campo municipal de deportes", 2002, 07, 14));
equipos.add(new Equipo("Inter de Milan", "Milan", "Italia", "Giuseppe Meazza", 1926, 02, 19));

}

public void muestraEquipo() {
for (int i=0 ;i<equipos.size();i++){
    System.out.println(equipos.get(i).toString());
}
}

//---------------------------------------------------------------------------------------------------------------------------------------
//IMPORTAR 11 JUGADORES A CADA CLUB
public void añadirJugadoresClub(){
    for (int i = 0; i < equipos.size(); i++) {
        for (int j = 0; j < jugadores.size(); j++) {
            equipos.get(i).añadeJugador();
        }
    }
}
//METODO QUE MUESTRA LOS FICHAJES
public void muestraFichajes() {
    for (int i = 0; i < equipos.size(); i++) {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(equipos.get(i));
        System.out.println("-------------------------------------------------------------------------------");
        for (int j = 0; j < jugadores.size(); j++) {
            System.out.println(jugadores.get(j));
        }
    }
}


public String getNombreClub() {return nombre;}



//METODO TOSTRING PARA VISUALIZAR CADA CLUB
public String toString() {
String texto="\nNOMBRE " + nombre + ", CIUDAD " + ciudad + ", PAIS " + pais + ", ESTADIO " + estadio + " FUNDACIÓN " + fechaFundacion;
return texto;
}


}

