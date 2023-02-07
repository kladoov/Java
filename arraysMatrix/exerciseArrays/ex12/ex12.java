package ex12;
import java.util.Scanner;
/* Crea un programa en Java que nos permita crear, cargar y visualizar un
vector de 10 nombres de personas.*/
/* Crea un programa en Java que nos permita mostrar las iniciales de 
todos los nombres anteriores.*/

public class ex12 {
public static Scanner tc = new Scanner(System.in);
public static void writeArray (String v[]) {
int cont = 0;
    for (int i = 0; i < v.length; i++) {
        System.out.print("Charge name " + cont + ": ");
        v[i] = tc.nextLine();
        cont++;
    }
    System.out.println("READY");
    System.out.println();
}

public static void viewArray (String v[]) {
    for (int i = 0; i < v.length; i++) {
        System.out.println("|" + v[i] +  "|");
    }
    System.out.println("");
}

public static void initialName (String v[]) {
    for (int i = 0; i < v.length; i++) {
        System.out.println(v[i].charAt(0));
    }
}
public static void main(String[] args) {
String vector[] = new String[10];

writeArray(vector);
viewArray(vector);
initialName(vector);


}


}
