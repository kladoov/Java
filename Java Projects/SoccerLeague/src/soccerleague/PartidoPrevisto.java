
package soccerleague;

import java.time.LocalDate;
import java.time.LocalTime;

public class PartidoPrevisto {
    private int numeroPartido;
    private String equipoLocal;
    private String equipoVisitante;
    private LocalDate fecha;
    private LocalTime hora;

public PartidoPrevisto() {}

public PartidoPrevisto(int num, String el, String ev, LocalDate fec, LocalTime hor) {
    this.numeroPartido = num;
    this.equipoLocal = el; 
    this.equipoVisitante = ev; 
    this.fecha = fec;
    this.hora = hor;
}
    
public int getNumeroPartido() {return this.numeroPartido;}
public String getEquipoLocal() {return this.equipoLocal;}
public String getEquipoVisitante() {return this.equipoVisitante;}
public LocalDate getFechaPartido() {return this.fecha;}
public LocalTime getHoraPartido() {return this.hora;}

public void setNumeroPartido(int num) {this.numeroPartido = num;}

public String toString() {
    return  "\nPartido: " + numeroPartido +
            "\nLocal: " + this.equipoLocal + " - " + this.equipoVisitante + " :Visitante" +
            "\nFecha: " + this.fecha + 
            "\nHora: " + this.hora;
}
    
    
    
}
