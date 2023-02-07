package arraysMatrix.ordenarDesordenar;

//desordenar y ordenar array

import java.util.Arrays;
import java.util.Scanner;

public class ordenarDesordenar {
public static Scanner tc = new Scanner(System.in);

public static void cargaVector(int v[]) {
int cont = 0;
    for (int i = 0; i < v.length; i++) {
        System.out.print("POSICION " + cont + ": ");
        v[i] = tc.nextInt();
        cont++;
    }
    System.out.println("READY");
    System.out.println("");
} 
    
public static void visualizaVector(int v[], String texto) {
    System.out.println("El vector " + texto + " es: ");
    System.out.println(Arrays.toString(v)); 
}
public static void main(String[] args) {
    int vector[]= new int [10];
        
    cargaVector(vector);
    visualizaVector(vector,"desordenado");
    Arrays.sort(vector);            //Arrays.sort();  <-- clase que ordena un array  
    visualizaVector(vector,"ordenado");
        
    }
}