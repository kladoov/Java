
package soccerleague;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Liga {
    private String nombreLiga;
    private ArrayList<Equipo> equipos;
    private ArrayList<PartidoPrevisto> partidoPrevisto;
    private ArrayList<PartidoJugado> partidoJugado;

public Liga(String nom) {
    this.nombreLiga = nom;
    this.equipos = new Equipo().añadirEquipos();
    this.partidoPrevisto = new ArrayList<>();
    this.partidoJugado = new ArrayList<>();
}

//CUARTOS DE FINAL-----------------------------------------------------------------------------------------------------------------------
public void planificarCuartosFinal() {
    String equipoLocal, equipoVisitante;
    int cont = 0;
    int contLocal = 0;
    int contVisitante = 4;
    for (int i = 0; i < 4; i++) {
        equipoLocal = equipos.get(contLocal).getNombreClub();
        contLocal++;
        equipoVisitante = equipos.get(contVisitante).getNombreClub();
        contVisitante++;
        
        LocalDate date = LocalDate.of(2023, 03, 24);
        
        int hour = (int)(Math.random()*(23-1)+1);
        int minute = (int)(Math.random()*(59-1)+1);
        LocalTime time = LocalTime.of(hour, minute);
        
        cont++;
        
        partidoPrevisto.add(new PartidoPrevisto(cont, equipoLocal, equipoVisitante, date, time));
        
        
    }
   
}

public void jugarCuartosFinal() {
    int golesLocal = 0, golesVisitante = 0;
    
    for (int i = 0; i < 4; i++) {
        golesLocal = (int)(Math.random()*(5-0)+1);
        golesVisitante = (int)(Math.random()*(5-0)+1);
        
    while (golesLocal == golesVisitante) {
        golesVisitante = (int)(Math.random()*(5-0)+1);
    }
   
    this.partidoJugado.add(new PartidoJugado(partidoPrevisto.get(i).getNumeroPartido(), partidoPrevisto.get(i).getEquipoLocal(),
    partidoPrevisto.get(i).getEquipoVisitante(),partidoPrevisto.get(i).getFechaPartido(), 
    partidoPrevisto.get(i).getHoraPartido(), golesLocal, golesVisitante));
    
    if (golesLocal > golesVisitante) {
        this.partidoJugado.get(i).setEquipoGanador(getPartidoPrevisto().get(i).getEquipoLocal());
        this.partidoJugado.get(i).setEquipoPerdedor(getPartidoPrevisto().get(i).getEquipoVisitante());
    }
    else if (golesLocal < golesVisitante) {
        this.partidoJugado.get(i).setEquipoGanador(getPartidoPrevisto().get(i).getEquipoVisitante());
        this.partidoJugado.get(i).setEquipoPerdedor(getPartidoPrevisto().get(i).getEquipoLocal());
    }
    
    }
    
}
//-------------------------------------------------------------------------------------------------------------------------------

//SEMI FINALES-------------------------------------------------------------------------------------------------------------------
public void planificarSemiFinal() {
    int cont = 0;
    this.partidoPrevisto.clear();
    
    String equipoLocal;
    String equipoVisitante;
    
    int contEquipoLocal = 0;
    int contEquipoVisitante = 2;

    for (int i = 0; i < 2; i++) {
        equipoLocal = partidoJugado.get(contEquipoLocal).getEquipoGanador();
        contEquipoLocal++;
        equipoVisitante = partidoJugado.get(contEquipoVisitante).getEquipoGanador();
        contEquipoVisitante++;
        
        LocalDate date = LocalDate.of(2023, 03, 24);
        
        int hour = (int)(Math.random()*(23-1)+1);
        int minute = (int)(Math.random()*(59-1)+1);
        LocalTime time = LocalTime.of(hour, minute);
        
        cont++;
        
        partidoPrevisto.add(new PartidoPrevisto(cont, equipoLocal, equipoVisitante, date, time));
        
    }
}

public void jugarSemiFinales() {
    this.partidoJugado.clear();
    int golesLocal = 0, golesVisitante = 0;
    
    for (int i = 0; i < 2; i++) {
        golesLocal = (int)(Math.random()*(5-0)+1);
        golesVisitante = (int)(Math.random()*(5-0)+1);
        
    while (golesLocal == golesVisitante) {
        golesVisitante = (int)(Math.random()*(5-0)+1);
    }
   
    this.partidoJugado.add(new PartidoJugado(partidoPrevisto.get(i).getNumeroPartido(), partidoPrevisto.get(i).getEquipoLocal(),
    partidoPrevisto.get(i).getEquipoVisitante(),partidoPrevisto.get(i).getFechaPartido(), 
    partidoPrevisto.get(i).getHoraPartido(), golesLocal, golesVisitante));
    
    if (golesLocal > golesVisitante) {
        this.partidoJugado.get(i).setEquipoGanador(getPartidoPrevisto().get(i).getEquipoLocal());
        this.partidoJugado.get(i).setEquipoPerdedor(getPartidoPrevisto().get(i).getEquipoVisitante());
    }
    else if (golesLocal < golesVisitante) {
        this.partidoJugado.get(i).setEquipoGanador(getPartidoPrevisto().get(i).getEquipoVisitante());
        this.partidoJugado.get(i).setEquipoPerdedor(getPartidoPrevisto().get(i).getEquipoLocal());
    }
    
    }
}
//-------------------------------------------------------------------------------------------------------------------------------
public void planificarFinalLiga() {
    int cont = 0;
    this.partidoPrevisto.clear();
    
    String equipoLocal;
    String equipoVisitante;
    
        equipoLocal = partidoJugado.get(0).getEquipoGanador();
        equipoVisitante = partidoJugado.get(1).getEquipoGanador();
        
        LocalDate date = LocalDate.of(2023, 03, 24);
        
        int hour = (int)(Math.random()*(23-1)+1);
        int minute = (int)(Math.random()*(59-1)+1);
        LocalTime time = LocalTime.of(hour, minute);
        
        cont++;
        
        partidoPrevisto.add(new PartidoPrevisto(cont, equipoLocal, equipoVisitante, date, time));
}

public void jugarFinalLiga() {
    this.partidoJugado.clear();
    int golesLocal = 0, golesVisitante = 0;
    
    golesLocal = (int)(Math.random()*(5-0)+1);
    golesVisitante = (int)(Math.random()*(5-0)+1);
        
    while (golesLocal == golesVisitante) {
        golesVisitante = (int)(Math.random()*(5-0)+1);
    }
   
    this.partidoJugado.add(new PartidoJugado(partidoPrevisto.get(0).getNumeroPartido(), partidoPrevisto.get(0).getEquipoLocal(),
    partidoPrevisto.get(0).getEquipoVisitante(),partidoPrevisto.get(0).getFechaPartido(), 
    partidoPrevisto.get(0).getHoraPartido(), golesLocal, golesVisitante));
    
    if (golesLocal > golesVisitante) {
        this.partidoJugado.get(0).setEquipoGanador(getPartidoPrevisto().get(0).getEquipoLocal());
        this.partidoJugado.get(0).setEquipoPerdedor(getPartidoPrevisto().get(0).getEquipoVisitante());
    }
    else if (golesLocal < golesVisitante) {
        this.partidoJugado.get(0).setEquipoGanador(getPartidoPrevisto().get(0).getEquipoVisitante());
        this.partidoJugado.get(0).setEquipoPerdedor(getPartidoPrevisto().get(0).getEquipoLocal());
    }
    
    
}

    
public ArrayList<PartidoPrevisto> getPartidoPrevisto() {return this.partidoPrevisto;}
public ArrayList<PartidoJugado> getPartidoJugado() {return this.partidoJugado;}
    
    
}
