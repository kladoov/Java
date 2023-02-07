package ex24;
import java.util.Scanner;
/*Crear un programa Java que nos permita guardar una matriz de 3 por 3 
con números enteros. Cargar sus datos por teclado y visualizarlos. */

public class ex24 {
public static Scanner tc = new Scanner(System.in);
public static void cargarMatrix (int m[][]) {
System.out.println("CARGA EL MATRIX DE 3x3");
    for (int f = 0; f < m.length; f++) {
        System.out.println();
        for (int c = 0; c < m[0].length; c++) {
            m[f][c] = tc.nextInt();
        }
    }
    System.out.println("MATRIX CARGADO");
    System.out.println();
}

public static void visualizarMatrix (int m[][]) {
System.out.println("VIEW MATRIX");
    for (int f = 0; f < m.length; f++) {
        System.out.println();
        for (int c = 0; c < m[0].length; c++) {
            System.out.print(m[f][c] + "|");
        }
    }
}
public static void main(String[] args) {
int matrix[][] = new int[3][3];

cargarMatrix(matrix);
visualizarMatrix(matrix);


}

}
