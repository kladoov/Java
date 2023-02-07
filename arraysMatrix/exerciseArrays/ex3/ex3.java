package ex3;
import java.util.Scanner;

/*Mejorar el ejercicio anterior controlando que la posición sea correcta,
si no lo es, volver a pedir la posición.*/

public class ex3 {
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
    System.out.println("");
    System.out.print("TELL ME A POSITION OF ARRAY: ");
    num = tc.nextInt();
    while (num <= 0 || num >= v.length) {
        System.out.println("HAS INTRODUCIDO UN VALOR INCORRECTO");
        System.out.println("PRUEBA DE NUEVO DEL 0 AL 9");
        num = tc.nextInt();
    }
    System.out.println("LA POSICION " + num + " DEL ARRAY, CONTIENE EL NUMERO " + v[num]);
}
public static void main(String[] args) {
int vector[] = new int[10];
    
cargarVector(vector);
visualizarVector(vector);
pedirPosicion(vector);
    
    }
}