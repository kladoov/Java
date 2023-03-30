
package soccerleague;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SoccerLeague {
public static Scanner tc = new Scanner(System.in);
public static int muestraMenu() {
    System.out.println("-----------------------------------------------------");
    System.out.println("LIGA ELIMINATORIA");
    System.out.println("1. MUESTRA LOS JUGADORES");
    System.out.println("2. MUESTRA LOS EQUIPOS");
    System.out.println("3. MUESTRA LOS FICHAJES");
    System.out.println("4. EMPEZAR LIGA");
    System.out.println("5. SALIR");
    System.out.print("ELIGE UNA OPCIÓN: ");
    int opt = tc.nextInt();
    return opt;
}

public static void main(String[] args) {
int numError = (int)(Math.random()*(20-1)+1);

    Equipo eqp = new Equipo();
    eqp.añadeOnceJugadores();
    eqp.añadirEquipos();
    eqp.ficharJugadores();
    
    Liga lga = new Liga("Kladov");

try { 
int opt = 0;
while (opt != 5) {
    opt = muestraMenu();

switch (opt) {
    case 1: eqp.visualizaJugador(); break;
    case 2: eqp.visualizarEquipos(); break;
    case 3: eqp.visualizaFichajes(); break;
    case 4: 
    //CUARTOS
    lga.planificarCuartosFinal();
        System.out.println();
        System.out.println("DEBES DE INRODUCIR CUALQUIER CARACTER Y DARLE AL ENTER PARA AVANZAR :)");
        System.out.print("SE DA EL COMIENZO A LA LIGA, EL SORTEO DE PARTIDOS ES: ");
        tc.next();
        for (int i = 0; i < lga.getPartidoPrevisto().size(); i++) {
            System.out.println(lga.getPartidoPrevisto().get(i).toString());
        }
    lga.jugarCuartosFinal();
        System.out.println();
        System.out.print("VER RESULTADOS DE LOS CUARTOS DE FINAL: ");
        tc.next();
        for (int i = 0; i < lga.getPartidoJugado().size(); i++) {
        System.out.println(lga.getPartidoJugado().get(i).toString());
        }
    System.out.println("-----------------------------------------------------------------------");
    //SEMIFINAL
    lga.planificarSemiFinal();
        System.out.println();
        System.out.print("LLEGAMOS A LAS SEMIFINALES, EL SIGUIENTE SORTEO DE PARTIDOS ES: ");
        tc.next();
        for (int i = 0; i < lga.getPartidoPrevisto().size(); i++) {
            System.out.println(lga.getPartidoPrevisto().get(i).toString());
        }
        
    lga.jugarSemiFinales();
        System.out.println();
        System.out.print("VER RESULTADOS DE LAS SEMIFINALES: ");
        tc.next();
        for (int i = 0; i < lga.getPartidoJugado().size(); i++) {
            System.out.println(lga.getPartidoJugado().get(i).toString());
        }
    System.out.println("-----------------------------------------------------------------------");
    //FINAL    
    lga.planificarFinalLiga();
        System.out.println();
        System.out.print("HEMOS LLEGADO A LA FINAL!!! VER ENCUENTRO: ");
        tc.next();
        System.out.println(lga.getPartidoPrevisto().get(0).toString());

    lga.jugarFinalLiga();
        System.out.println();
        System.out.print("EL GANADOR DE LA LIGA ES: ");
        tc.next();
        System.out.println(lga.getPartidoJugado().get(0).toString());
        break;
    
    case 5: System.out.println("HAS CERRADO LA LIGA ELIMINATORIA"); break;
        default: System.out.println("INTRODUCE NUMEROS ENTRE EL 1-5!"); break;
        
    }
    
}

} catch (InputMismatchException e1) {
        System.out.println(e1.toString());
        System.out.println("ERROR " + numError + ". SOLO PUEDES INTRODUDCIR NUMEROS ENTEROS!!");
        }
  catch (IndexOutOfBoundsException e2) {
        System.out.println(e2.toString());
        System.out.println("ERROR " + numError + ". TE HAS SALIDO DEL INDICE DEL ARRAY!!");
        }



        
 }   
}
