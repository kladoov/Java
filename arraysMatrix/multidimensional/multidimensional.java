package arraysMatrix.multidimensional;
import java.util.Scanner;

public class multidimensional {
public static Scanner tc = new Scanner(System.in);
public static void cargarMultiverso (int m[][][]) {
    System.out.println("CARGAR MULTIVERSO");
    for (int f = 0; f < m.length; f++) {
        System.out.println();
        for (int c = 0; c < m.length; c++) {
            System.out.println();
            for (int a = 0; a < m.length; a++) {
                m[f][c][a] = tc.nextInt();
            }
        }
    } 
}

public static void visualizarMultiverso (int m[][][]) {
    System.out.println("VIEW MULTIVERSO");
    for (int f = 0; f < m.length; f++) {
        System.out.println();
        for (int c = 0; c < m.length; c++) {
            System.out.println();
            for (int a = 0; a < m.length; a++) {
                System.out.print(m[f][c][a] + "|");
            }
        }
    } 
}

public static void main(String[] args) {
int multi[][][] = new int[3][3][3];

cargarMultiverso(multi);
visualizarMultiverso(multi);

    }
}
