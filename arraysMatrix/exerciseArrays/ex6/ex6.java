package ex6;
import java.util.Scanner;
/*Crea un programa en Java que cree un vector de 10 elementos de tipo 
entero. Cargarlo, visualizarlo y mostar el número más alto y el más bajo 
del vector.
*/
public class ex6 {
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

public static int mediaVector (int suma, int v[]) {
    int media = 0;
    media = suma / v.length;
    return media;
}

public static void visualizarSuperiorMedia(int media, int v[]) {
    for (int i = 0; i < v.length; i++) {
        if (v[i] > media) {
            System.out.println("EL VALOR " + v[i] + " ES SUPERIOR A LA MEDIA Y SE ENCUENTRA EN LA POSICIÓN " + i);
        }
    }

}

public static void muestraMayorMenor (int v[]) {
int mayor = v[0];
int menor = v[0];
for (int i = 0; i < v.length; i++) {
    if (v[i] > mayor) {
        mayor = v[i];
    }
}
System.out.println("EL NUMERO MAYOR ES: " + mayor);
    for (int f = 0; f < v.length; f++) {
    if (v[f] < menor) {
        menor = v[f];
    }
}
System.out.println("EL NUMERO MENOR ES: " + menor);
    }


public static void main(String[] args) {
int vector[] = new int[10];

cargarVector(vector);
visualizarVector(vector);

System.out.println("");

int suma = sumaVector(vector);
System.out.println("THE SUM OF ARRAY IS: " + suma);

int media = mediaVector(suma, vector);
System.out.println("LA MEDIA ES: " + media);

System.out.println("");

visualizarSuperiorMedia(media, vector);

System.out.println("");

muestraMayorMenor(vector);

    }
}