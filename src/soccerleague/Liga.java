package soccerleague;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import Excepciones.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Liga {

    private String nombreLiga;
    private ArrayList<Equipo> equipos;
    private ArrayList<PartidoPrevisto> partidoPrevisto;
    private ArrayList<PartidoJugado> partidoJugado;
    private ArrayList<Arbitraje> arbitraje;

    public Liga(String nom) throws NumeroImparEquiposExcepcion {
        this.nombreLiga = nom;
        this.equipos = new Equipo().añadirEquipos();
        this.partidoPrevisto = new ArrayList<>();
        this.partidoJugado = new ArrayList<>();
        this.arbitraje = new ArrayList<>();
        if (equipos.size() % 2 != 0) {
            throw new NumeroImparEquiposExcepcion();
        }

    }

//ARBITRAJE-----------------------------------------------------------------------------------------------------------------------------
    public void importarArbitrajes() {
        Arbitraje arb = new Arbitraje();
        this.arbitraje.add(arb);
    }
    public void visualizarArbitraje() {
        for (int i = 0; i < this.arbitraje.size(); i++) {
            System.out.println(this.arbitraje.get(i).toString());
        }
    }

    public void ficheroArbitros() {
        Arbitraje arb = new Arbitraje();
        try {
            String ruta = "c:\\FICHEROS_EXAMEN\\arbitros_liga_XXX.txt";
            FileWriter archivo = new FileWriter(ruta); //true para sobrescribir
            archivo.write(arb.toString());
            archivo.write("\n");
            System.out.println("FICHERO " + ruta + " CREADO");
            archivo.close();
        } catch (FileNotFoundException e1) {
            System.out.println(e1.toString());
        } catch (IOException e2) {
            System.out.println(e2.toString());
        }
    }
    
    public void ficheroPartidos() {
        try {
            String ruta = "c:\\FICHEROS_EXAMEN\\partidos_liga_XXX.dat";
            File fichero = new File(ruta);
            FileOutputStream archivo = new FileOutputStream(ruta);
            ObjectOutputStream registro = new ObjectOutputStream(archivo);
            for (int i = 0; i < partidoPrevisto.size(); i++) {
            registro.writeObject(partidoPrevisto.get(i).toString());
            }
            System.out.println("FICHERO " + ruta + " CREADO");
            registro.close();
            archivo.close();
        } catch (FileNotFoundException e1) {
            System.out.println(e1.toString());
        } catch (IOException e2) {
            System.out.println(e2.toString());
        }
           
    }

//CUARTOS DE FINAL-----------------------------------------------------------------------------------------------------------------------
    public void planificarCuartosFinal() {
        String equipoLocal, equipoVisitante, paisLocal, paisVisitante;

        int cont = 0;
        int contLocal = 0;
        int contVisitante = 4;
        for (int i = 0; i < 4; i++) {
            equipoLocal = equipos.get(contLocal).getNombreClub();
            paisLocal = equipos.get(contLocal).getPaisClub();
            contLocal++;
            equipoVisitante = equipos.get(contVisitante).getNombreClub();
            paisVisitante = equipos.get(contVisitante).getPaisClub();
            contVisitante++;

            LocalDate date = LocalDate.of(2023, 03, 24);

            int hour = (int) (Math.random() * (23 - 1) + 1);
            int minute = (int) (Math.random() * (59 - 1) + 1);
            LocalTime time = LocalTime.of(hour, minute);

            cont++;
            
            PartidoPrevisto partido = new PartidoPrevisto(cont, equipoLocal, paisLocal, equipoVisitante, paisVisitante, date, time); 

            //ASIGNAR ARBITRAJE A PARTIDO
            Arbitraje aux = null;
            boolean asignarArbitraje = false;
            int a = 0;
            while (!asignarArbitraje && a < arbitraje.size()) {
                aux = arbitraje.get(a);
                try {
                    String nacionalidad = aux.getArbitro().getNacionalidadArbitro();
                    if (nacionalidad.equalsIgnoreCase(paisLocal) || nacionalidad.equalsIgnoreCase(paisVisitante)) {
                        throw new ArbitroExcepcion();
                    } else {
                        asignarArbitraje = true;
                    }
                } catch (ArbitroExcepcion e) {
                    System.out.println(e.toString() + "\nNacionalidad arbitro: " + aux.getArbitro().getNacionalidadArbitro());
                }
                a++;
            }
            partido.setArbitraje(aux);
            partidoPrevisto.add(partido);
        }

    }

    public void jugarCuartosFinal() {
        int golesLocal = 0, golesVisitante = 0;

        for (int i = 0; i < 4; i++) {
            golesLocal = (int) (Math.random() * (5 - 0) + 1);
            golesVisitante = (int) (Math.random() * (5 - 0) + 1);

            while (golesLocal == golesVisitante) {
                golesVisitante = (int) (Math.random() * (5 - 0) + 1);
            }

            this.partidoJugado.add(new PartidoJugado(partidoPrevisto.get(i).getNumeroPartido(),
                    partidoPrevisto.get(i).getEquipoLocal(),
                    partidoPrevisto.get(i).getPaisLocal(),
                    partidoPrevisto.get(i).getEquipoVisitante(),
                    partidoPrevisto.get(i).getPaisVisitante(),
                    partidoPrevisto.get(i).getFechaPartido(),
                    partidoPrevisto.get(i).getHoraPartido(),
                    golesLocal,
                    golesVisitante));

            if (golesLocal > golesVisitante) {
                this.partidoJugado.get(i).setEquipoGanador(getPartidoPrevisto().get(i).getEquipoLocal());
                this.partidoJugado.get(i).setEquipoPerdedor(getPartidoPrevisto().get(i).getEquipoVisitante());
            } else if (golesLocal < golesVisitante) {
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

        String equipoLocal, equipoVisitante, paisLocal = "", paisVisitante = "";

        int contEquipoLocal = 0;
        int contEquipoVisitante = 2;

        for (int i = 0; i < 2; i++) {
            equipoLocal = partidoJugado.get(contEquipoLocal).getEquipoGanador();
            contEquipoLocal++;
            equipoVisitante = partidoJugado.get(contEquipoVisitante).getEquipoGanador();
            contEquipoVisitante++;

            LocalDate date = LocalDate.of(2023, 03, 24);

            int hour = (int) (Math.random() * (23 - 1) + 1);
            int minute = (int) (Math.random() * (59 - 1) + 1);
            LocalTime time = LocalTime.of(hour, minute);

            cont++;

            PartidoPrevisto partido = new PartidoPrevisto(cont, equipoLocal, paisLocal, equipoVisitante, paisVisitante, date, time); 

            //ASIGNAR ARBITRAJE A PARTIDO
            Arbitraje aux = null;
            boolean asignarArbitraje = false;
            int a = 0;
            while (!asignarArbitraje && a < arbitraje.size()) {
                aux = arbitraje.get(a);
                try {
                    String nacionalidad = aux.getArbitro().getNacionalidadArbitro();
                    if (nacionalidad.equalsIgnoreCase(paisLocal) || nacionalidad.equalsIgnoreCase(paisVisitante)) {
                        throw new ArbitroExcepcion();
                    } else {
                        asignarArbitraje = true;
                    }
                } catch (ArbitroExcepcion e) {
                    System.out.println(e.toString());
                }
                a++;
            }
            partido.setArbitraje(aux);
            partidoPrevisto.add(partido);
        }
    }

    public void jugarSemiFinales() {
        this.partidoJugado.clear();
        int golesLocal = 0, golesVisitante = 0;

        for (int i = 0; i < 2; i++) {
            golesLocal = (int) (Math.random() * (5 - 0) + 1);
            golesVisitante = (int) (Math.random() * (5 - 0) + 1);

            while (golesLocal == golesVisitante) {
                golesVisitante = (int) (Math.random() * (5 - 0) + 1);
            }

            this.partidoJugado.add(new PartidoJugado(partidoPrevisto.get(i).getNumeroPartido(),
                    partidoPrevisto.get(i).getEquipoLocal(),
                    partidoPrevisto.get(i).getPaisLocal(),
                    partidoPrevisto.get(i).getEquipoVisitante(),
                    partidoPrevisto.get(i).getPaisVisitante(),
                    partidoPrevisto.get(i).getFechaPartido(),
                    partidoPrevisto.get(i).getHoraPartido(),
                    golesLocal,
                    golesVisitante));

            if (golesLocal > golesVisitante) {
                this.partidoJugado.get(i).setEquipoGanador(getPartidoPrevisto().get(i).getEquipoLocal());
                this.partidoJugado.get(i).setEquipoPerdedor(getPartidoPrevisto().get(i).getEquipoVisitante());
            } else if (golesLocal < golesVisitante) {
                this.partidoJugado.get(i).setEquipoGanador(getPartidoPrevisto().get(i).getEquipoVisitante());
                this.partidoJugado.get(i).setEquipoPerdedor(getPartidoPrevisto().get(i).getEquipoLocal());
            }

        }
    }
//-------------------------------------------------------------------------------------------------------------------------------

    public void planificarFinalLiga() {
        int cont = 0;
        this.partidoPrevisto.clear();

        String equipoLocal, equipoVisitante, paisLocal = "", paisVisitante = "";

        equipoLocal = partidoJugado.get(0).getEquipoGanador();
        equipoVisitante = partidoJugado.get(1).getEquipoGanador();

        LocalDate date = LocalDate.of(2023, 03, 24);

        int hour = (int) (Math.random() * (23 - 1) + 1);
        int minute = (int) (Math.random() * (59 - 1) + 1);
        LocalTime time = LocalTime.of(hour, minute);

        cont++;

            PartidoPrevisto partido = new PartidoPrevisto(cont, equipoLocal, paisLocal, equipoVisitante, paisVisitante, date, time); 

            //ASIGNAR ARBITRAJE A PARTIDO
            Arbitraje aux = null;
            boolean asignarArbitraje = false;
            int a = 0;
            while (!asignarArbitraje && a < arbitraje.size()) {
                aux = arbitraje.get(a);
                try {
                    String nacionalidad = aux.getArbitro().getNacionalidadArbitro();
                    if (nacionalidad.equalsIgnoreCase(paisLocal) || nacionalidad.equalsIgnoreCase(paisVisitante)) {
                        throw new ArbitroExcepcion();
                    } else {
                        asignarArbitraje = true;
                    }
                } catch (ArbitroExcepcion e) {
                    System.out.println(e.toString());
                }
                a++;
            }
            partido.setArbitraje(aux);
            partidoPrevisto.add(partido);
    }

    public void jugarFinalLiga() {
        this.partidoJugado.clear();
        int golesLocal = 0, golesVisitante = 0;

        golesLocal = (int) (Math.random() * (5 - 0) + 1);
        golesVisitante = (int) (Math.random() * (5 - 0) + 1);

        while (golesLocal == golesVisitante) {
            golesVisitante = (int) (Math.random() * (5 - 0) + 1);
        }

        this.partidoJugado.add(new PartidoJugado(partidoPrevisto.get(0).getNumeroPartido(),
                partidoPrevisto.get(0).getEquipoLocal(),
                partidoPrevisto.get(0).getPaisLocal(),
                partidoPrevisto.get(0).getEquipoVisitante(),
                partidoPrevisto.get(0).getPaisVisitante(),
                partidoPrevisto.get(0).getFechaPartido(),
                partidoPrevisto.get(0).getHoraPartido(),
                golesLocal,
                golesVisitante));

        if (golesLocal > golesVisitante) {
            this.partidoJugado.get(0).setEquipoGanador(getPartidoPrevisto().get(0).getEquipoLocal());
            this.partidoJugado.get(0).setEquipoPerdedor(getPartidoPrevisto().get(0).getEquipoVisitante());
        } else if (golesLocal < golesVisitante) {
            this.partidoJugado.get(0).setEquipoGanador(getPartidoPrevisto().get(0).getEquipoVisitante());
            this.partidoJugado.get(0).setEquipoPerdedor(getPartidoPrevisto().get(0).getEquipoLocal());
        }

    }

    public ArrayList<PartidoPrevisto> getPartidoPrevisto() {
        return this.partidoPrevisto;
    }

    public ArrayList<PartidoJugado> getPartidoJugado() {
        return this.partidoJugado;
    }

}
