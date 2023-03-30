
package soccerleague;

import java.time.LocalDate;
import java.time.LocalTime;

public class PartidoJugado extends PartidoPrevisto {
    private int golesLocal;
    private int golesVisitante;
    private String equipoGanador;
    private String equipoPerdedor;
    
public PartidoJugado(){}

public PartidoJugado(int num, String el, String ev, LocalDate fec, LocalTime hor, int golesLocal, int golesVisitante) {
    super(num, el, ev, fec, hor);
    this.golesLocal = golesLocal;
    this.golesVisitante = golesVisitante;
}

public void setEquipoGanador(String eqg) {this.equipoGanador = eqg;}
public void setEquipoPerdedor(String eqp) {this.equipoPerdedor = eqp;}

public String getEquipoGanador() {return equipoGanador;}


public String toString() {
    return getEquipoLocal() + "| " + " " + golesLocal + " - " + golesVisitante + " " + " |" + getEquipoVisitante() + "\nGANADOR: " + equipoGanador + "\nPERDEDOR: " + equipoPerdedor + "\n";
}    
    
    
}
