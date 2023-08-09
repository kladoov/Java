
package soccerleague;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class PartidoPrevisto implements Serializable {
    private int numeroPartido;
    private String equipoLocal;
    private String paisLocal;
    private String equipoVisitante;
    private String paisVisitante;
    private LocalDate fecha;
    private LocalTime hora;
    private Arbitraje arb;
    private CiudadPartido ciudadPartido;


public PartidoPrevisto() {}

public PartidoPrevisto(int num, String el, String paisLo, String ev, String paisVi, LocalDate fec, LocalTime hor) {
    this.numeroPartido = num;
    this.equipoLocal = el; 
    this.paisLocal = paisLo;
    this.equipoVisitante = ev;
    this.paisVisitante = paisVi;
    this.fecha = fec;
    this.hora = hor;
}

public void setArbitraje(Arbitraje arb) {this.arb = arb;}
public void setCiudadPartido(CiudadPartido ciu) {this.ciudadPartido = ciu;}
    
public int getNumeroPartido() {return this.numeroPartido;}
public String getEquipoLocal() {return this.equipoLocal;}
public String getPaisLocal() {return this.paisLocal;}
public String getEquipoVisitante() {return this.equipoVisitante;}
public String getPaisVisitante() {return this.paisVisitante;}
public LocalDate getFechaPartido() {return this.fecha;}
public LocalTime getHoraPartido() {return this.hora;}

public void setNumeroPartido(int num) {this.numeroPartido = num;}

@Override
public String toString() {
    return  "----------------------------" +
            "\nPartido: " + numeroPartido +
            "\nLocal: " + this.equipoLocal + " - " + this.equipoVisitante + " :Visitante" +
            "\nPais Local: " + this.paisLocal + " - " + this.paisVisitante + " :Pais Visitante" +
            "\nFecha: " + this.fecha + 
            "\nHora: " + this.hora +
            "\n" + this.arb.toString() + 
            "\n" + this.ciudadPartido.toString();
}
    
    
    
}