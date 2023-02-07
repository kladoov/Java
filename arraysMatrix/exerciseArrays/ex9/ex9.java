package ex9;
import java.util.Scanner;
/* Crea un programa en Java que cree dos vectores de 10 elementos de 
tipo entero. Cargarlos, visualizarlos y cargar un tercer vector con la 
suma de los dos vectores, posición a posición. Visualizar el vector 
resultado.*/
public class ex9 {
public static void cargarVector (int v[]) {
int cont = 0;
    for (int i = 0; i < v.length; i++) {
        System.out.print("Charge position " + cont + ": ");
        v[i] = tc.nextInt();
        cont++;
    }
    System.out.println("READY");
    System.out.println();
}

public static void visualizarVector(int v[]) {
    for (int i = 0; i < v.length; i++) {
        System.out.print(v[i] +  "|");
    }
    System.out.println("");
}

public static void sumaVectores (int v[], int v2[], int s[]) {
int cont = 0;
    for (int i = 0; i < v.length; i++) {
        s[i] = v[cont] + v2[cont];
        cont++;
    }
}

public static void viewSumArray (int s[]) {
    for (int i = 0; i < s.length; i++) {
        System.out.print(s[i] + "|");
    }

}

public static Scanner tc = new Scanner(System.in);
public static void main(String[] args) {
int vector[] = new int[10];
int vector2[] = new int[10];
int suma[] = new int[10];    

System.out.println("CHARGE FIRST ARRAY");
cargarVector(vector);

System.out.println("CHARGE SECOND ARRAY");
cargarVector(vector2);

System.out.println("VIEW FIRTS ARRAY");
visualizarVector(vector);
System.out.println();

System.out.println("VIEW SECOND ARRAY");
visualizarVector(vector2);
System.out.println();

sumaVectores(vector, vector2, suma);
System.out.println("SUM OF 2 ARRAYS");
viewSumArray(suma);

    }
}
