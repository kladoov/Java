
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
    this.jugadores = new ArrayList<>();
    this.equipos = new ArrayList<>();
}

//JUGADORES
//-------------------------------------------------------------------------------------------
//METODO QUE AÑADE 11 JUGADORES AL ARRAYLIST
public void añadeOnceJugadores() {
    for (int i = 0; i < 11; i++) {
        Jugador jgd  = new Jugador();
        jugadores.add(jgd);
    }
}
//VISUALIZA EL RESULTADO DE ALGUNO DE LOS 2 METODOS ANTERIORES
public void visualizaJugador() {
    for (int i = 0; i < 11; i++) {
        System.out.println(jugadores.get(i).toString());
    }
}
//-------------------------------------------------------------------------------------------


//EQUIPOS
//-------------------------------------------------------------------------------------------
//METODO QUE AÑADE EQUIPOS AL ARRAYLIST
public ArrayList<Equipo> añadirEquipos() {
    equipos.add(new Equipo("Real Madrid C.F", "Madrid", "España", "Santiago Bernabeu", 1902, 03, 06));
    equipos.add(new Equipo("Juventus F.C", "Turín", "Italia", "Allianz Stadium", 1897, 11, 01));
    equipos.add(new Equipo("Manchester City", "Manchester", "Inglaterra", "Etihad Stadium", 1880, 11, 23));
    equipos.add(new Equipo("Barcelona F.C", "Barcelona", "España", "Spotify Camp Nou", 1899, 11, 29));
    equipos.add(new Equipo("Real Betis Balompié S.A.D", "Sevilla", "España", "Benito Villamarín", 1929, 05, 19));
    equipos.add(new Equipo("F.C Dinamo de Kiev", "Kiev", "Ucrania", "Olimpico de Kiev", 1923, 10, 12));
    equipos.add(new Equipo("La Roda F.C", "Albacete", "España", "Campo municipal de deportes", 2002, 07, 14));
    equipos.add(new Equipo("Inter de Milan", "Milan", "Italia", "Giuseppe Meazza", 1926, 02, 19));
    return equipos;
}
public void visualizarEquipos() {
    for (int i = 0; i < equipos.size(); i++) {
        System.out.println(equipos.get(i).toString());
    }
}
//-------------------------------------------------------------------------------------------


//FICHAJES
//-------------------------------------------------------------------------------------------
//METODO QUE FICHA LOS JUGADORES
public void ficharJugadores() {
for (int i = 0; i < equipos.size(); i++) {
    equipos.get(i).añadeOnceJugadores();
    }
}

//METODO QUE VISUALIZA LOS FICHAJES
public void visualizaFichajes() {
    for (int i = 0; i < equipos.size(); i++) {
    System.out.println("-------------------------------------------------------------------------------");
    System.out.println(equipos.get(i));
    System.out.println("-------------------------------------------------------------------------------");
        for (int j = 0; j < jugadores.size(); j++) {
            System.out.println(jugadores.get(j));
        }
    }
}
//-------------------------------------------------------------------------------------------


public String getNombreClub() {return nombre;}
public String getPaisClub() {return pais;}


//METODO TOSTRING PARA VISUALIZAR CADA CLUB
public String toString() {
String texto = nombre + ", CIUDAD " + ciudad + ", PAIS " + pais + ", ESTADIO " + estadio + " FUNDACIÓN " + fechaFundacion;
return texto;
}


}