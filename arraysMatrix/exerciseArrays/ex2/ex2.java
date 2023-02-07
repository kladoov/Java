package ex2;
import java.util.Scanner;
/*Crea un programa en Java que cree un vector de 10 elementos de tipo
entero. Cargarlo, visualizarlo y pedir una posición por teclado y mostrar
el dato contenido en el vector en dicha posición*/

public class ex2 {
public static Scanner tc = new Scanner(System.in);
public static void cargarVector (int v[]) {
    System.out.println("Tell me 10 numbers: ");
        for (int i = 0; i < v.length; i++) {
            v[i] = tc.nextInt();
        }
    System.out.println("READY");
    System.out.println();
}
    
public static void visualizarVector(int v[]) {
System.out.println("VIEW ARRAY");
    for (int i = 0; i < v.length; i++) {
        System.out.print(v[i] +  "|");
    }
    System.out.println();
}

public static void pedirPosicion (int v[]) {
    int num;
    System.out.print("TELL ME A POSITION OF ARRAY: ");
    num = tc.nextInt();
    System.out.println("LA POSICION " + num + " DEL ARRAY, CONTIENE EL NUMERO " + v[num]);
}
public static void main(String[] args) {
int vector[] = new int[10];
    
cargarVector(vector);
visualizarVector(vector);
pedirPosicion(vector);
    
    }
}