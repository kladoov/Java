package ex28;
/*Crear  un  programa  Java  que  nos  permita  crear  una  matriz  3  por  3  de 
números  enteros.  Inicializarla  en  la  declaración.  Visualizarla.  Crear  un 
vector con la suma de los elementos de cada fila y visualizarlo. */

import java.util.Scanner;

public class ex28 {
public static Scanner tc = new Scanner(System.in);
public static void visualizarVector(int v[][]) {
System.out.println("Visualizacion del vector:");
    for (int f = 0; f < v.length; f++) {
        for (int c = 0; c < v.length; c++) {
            System.out.print(v[f][c] + " ");
        }
        System.out.println();
    }
    System.out.println("\nFINISHED");
    System.out.println();
}

public static void sumarFilas (int v[][]) {
    int suma = 0, i = 0;
        for (int f = 0; f < v.length; f++) {
            for (int c = 0; c < v.length; c++) {
                suma = suma + v[f][c];
            }
            System.out.println("La suma de la fila " + i + " es " + suma);
            i++;
            suma = 0;
        }
    }

public static void main(String[] args) {
    int[][] vector = {{1,2,3},
                      {4,5,6},
                      {7,8,9}};
    visualizarVector(vector);
    sumarFilas(vector);
    
    }
}