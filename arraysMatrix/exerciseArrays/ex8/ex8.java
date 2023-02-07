package ex8;
import java.util.Scanner;

/*Crea un programa en Java que cree un vector de 10 elementos de tipo 
entero. Cargarlo y visualizarlo. Guardar en un segundo vector todos los 
datos  del  primero  que  son  superiores  a  su  media.  Visualizar  el  vector 
resultante.*/
public class ex8 {
public static Scanner tc = new Scanner(System.in);
public static void cargarVector(int v[]) {
int cont = 0;
    for (int i = 0; i < v.length; i++) {
        System.out.print("Position " + cont + ": ");
        v[i] = tc.nextInt();
        cont++;
    }
    System.out.println("READY");
    System.out.println("");
}

public static void visualizarVector (int v[]) {
    System.out.println("VIEW VECTOR");
    for (int i = 0; i < v.length; i++) {
        System.out.print(v[i] + "|");
    }
}

public static int calculaMediaVector (int v[]) {
    int suma = 0, media = 0;
    for (int i = 0; i < v.length; i++) {
        suma = suma + v[i];
    }
    media = suma / v.length;
    return media;
}

public static void visualizarAux (int a[]) {
    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i] + "|");
    }
}
public static void main(String[] args) {
int vector[] = new int[10];
int aux[] = new int[10];
int aux2 = 0;

cargarVector(vector);
visualizarVector(vector);

int media = calculaMediaVector(vector);
System.out.println(" ");
System.out.println("LA MEDIA ES: "  + media);

visualizarAux(aux);

    }    
}
