package arraysMatrix.matrix;

import java.util.Scanner;
//import java.lang.Math;

public class matrix{
public static Scanner tc = new Scanner(System.in);

public static void cargarVector (String asignatura[], int m[][]) {
    for (int f=0; f < m.length; f++) {
    System.out.println("Carga las 3 notas de la asignatura " + asignatura[0] + ": ");
        for (int c=0; c < m[0].length; c++) {
            m[f][c] = tc.nextInt();
        }
    }
}

public static void visualizarVector (String asignatura[], int m[][]) {
    for (int f=0; f < m.length; f++) {
        System.out.println();
        for (int c=0; c < m[0].length; c++) {
            System.out.print("Las notas de " + asignatura[0] + "|" + m[f][c] + "|");
        }
    }
}

    public static void main(String[] args) {
        String asignatura[] = {"BDD", "LGMS", "ENDE", "PROG", "SISI", "ING"};
        int matrix[][] = new int[6][3];
        //int aux[][] = new int[6][3];

        cargarVector(asignatura, matrix);
        visualizarVector(asignatura, matrix);

        //copiaVector(vector, aux);
        //visualizarVector(aux);

        

    }
    
}