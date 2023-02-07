package ex1;
import java.util.Scanner;
/*Crea un programa en Java que cree un vector de 10 elementos de tipo
entero, cárgalo por teclado y visualiza por pantalla todos sus elementos.*/

public class ex1 {
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
}

public static void main(String[] args) {
int vector[] = new int[10];

cargarVector(vector);
visualizarVector(vector);



    }
}
