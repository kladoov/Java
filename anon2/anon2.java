package anon2;

//import java.util.Random;
import java.util.Scanner;
/*menu con while opciones
 * si es 0 sales
 * si es 1 reemplazas la matriz solo char | visualizar
 * si es 2  
*/

public class anon2 {
    public static Scanner tc= new Scanner(System.in);

    public static void cargarMatrix(int m[][]) {
    int hola;
    System.out.println("Charge the matrix");
    System.out.println("Tell me a number:");
    hola = tc.nextInt();
        for (int f= 0; f < m.length; f++) {
            for (int c= 0; c < m.length; c++) {
                m[f][c] = hola;
            }
        }
    }
    
    public static void visualizarMatrix(int m[][]) {
    System.out.println("");
    System.out.println("View the matrix");
        for (int f= 0; f < m.length; f++) {
            System.out.println();
            for (int c= 0; c < m.length; c++) {
                System.out.print(m[f][c] + " ");
            }
        }
    }

    public static void main(String[] args) {
    int f;
    System.out.println("Insert size of matrix");
    f = tc.nextInt();
        int matrix[][]= new int [f][f];
    
    cargarMatrix(matrix);
    visualizarMatrix(matrix);
        
    }
    
}
