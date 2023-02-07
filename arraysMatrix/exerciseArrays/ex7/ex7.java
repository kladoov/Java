package ex7;
import java.util.Scanner;
/*Crea un programa en Java que cree un vector de 10 elementos de tipo 
entero. Cargarlo y visualizarlo.  Guardar en un segundo vector todos los 
datos del primero que son superiores a un número dado, que pediremos 
por teclado. Visualizar el vector resultante.*/

public class ex7 {
public static Scanner tc = new Scanner(System.in);
public static void cargarVector (int v[]) {
int cont = 0;
    for (int i = 0; i < v.length; i++) {
        System.out.print("Position " + cont + ": ");
        v[i] = tc.nextInt();
        cont = cont + 1;
    }
    System.out.println("READY");
    System.out.println("");
}

public static void visualizarVector (int v[]) {
System.out.println("VIEW ARRAY");
    for (int i = 0; i < v.length; i++) {
        System.out.print(v[i] + "|");
    }
    System.out.println("");
}

public static int pedirNumber() {
    System.out.print("DIME UN NUMERO Y TE MUESTRO LOS SUPERIORES ALMACENADOS EN EL ARRAY: ");
    int num = tc.nextInt();
    return num;
}

public static void guardarSegundoVector (int v[], int a[], int num, int aux2) {
    for (int i = 0; i < v.length; i++) {
        if (v[i] > num) {
            System.out.println("NUMERO " + v[i] + " ES SUPERIOR AL NUMERO INTRODUCIDO");
            a[aux2] = v[i];
            aux2++;
            }
    }
}

public static void visualizarAux (int a[]) {
    System.out.println("");
    System.out.println("SECOND ARRAY");
    for (int i = 0; i < a.length; i ++) {
        System.out.print(a[i] + "|");
    }
}

public static void main(String[] args) {
int vector[] = new int [10];
int aux[] = new int [10];
int aux2 = 0;

cargarVector(vector);
visualizarVector(vector);

int num = pedirNumber();
guardarSegundoVector(vector, aux, num, aux2);
visualizarAux(aux);

    }
}
