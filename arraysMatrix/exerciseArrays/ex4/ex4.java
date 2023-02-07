package ex4;
import java.util.Scanner;
/*Crea un programa en Java que cree un vector de 10 elementos de tipo
entero. Cargarlo, visualizarlo, obtener la suma de los elementos del
vector y su media*/

public class ex4 {
public static Scanner tc = new Scanner(System.in);
public static void cargarVector (int v[]) {
int cont = 0;
    for (int i = 0; i < v.length; i++) {
    System.out.print("Position " + cont + ": ");
        v[i] = tc.nextInt();
        cont = cont + 1;
    }
    System.out.println("READY");
    System.out.println(" ");
}

public static void visualizarVector (int v[]) {
    System.out.println("VIEW ARRAY");
    for (int i = 0; i < v.length; i++) {
        System.out.print(v[i] + "|");
    }
    System.out.println(" ");
}

public static int sumaVector (int v[]) {
int suma = 0;
    for (int i = 0; i < v.length; i++) {
        suma = suma + v[i];
    }
    return suma;
} 

public static int mediaVector (int suma) {
    int media = 0;
    media = suma / 2;
    return media;
}
public static void main(String[] args) {
int vector[] = new int[10];

cargarVector(vector);
visualizarVector(vector);

System.out.println("");

int suma = sumaVector(vector);
System.out.println("THE SUM OF ARRAY IS: " + suma);

int media = mediaVector(suma);
System.out.println("LA MEDIA ES: " + media);

    }
}
