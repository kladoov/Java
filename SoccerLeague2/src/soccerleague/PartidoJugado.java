
package soccerleague;

import java.time.LocalDate;
import java.time.LocalTime;

public class PartidoJugado extends PartidoPrevisto {
    private int golesLocal;
    private int golesVisitante;
    private String equipoGanador;
    private String equipoPerdedor;
    private String paisEquipoGanador;
    
public PartidoJugado(){}

public PartidoJugado(int num, String el, String paisLo, String ev, String paisVi, LocalDate fec, LocalTime hor, int golesLocal, int golesVisitante) {
    super(num, el, paisLo, ev, paisVi, fec, hor);
    this.golesLocal = golesLocal;
    this.golesVisitante = golesVisitante;
}

public void setEquipoGanador(String eqg) {this.equipoGanador = eqg;}
public void setEquipoPerdedor(String eqp) {this.equipoPerdedor = eqp;}

public String getEquipoGanador() {return equipoGanador;}
public String getEquipoPerdedor() {return equipoPerdedor;}
public String getPaisEquipoGanador() {return this.paisEquipoGanador;}


public String toString() {
    return getEquipoLocal() + "| " + " " + golesLocal + " - " + golesVisitante + " " + " |" + getEquipoVisitante() + "\nGANADOR: " + equipoGanador + "\nPERDEDOR: " + equipoPerdedor + "\n";
}    
    
    
}