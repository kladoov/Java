package numPrimo;

import java.util.Scanner;

public class numPrimo {
public static Scanner tc= new Scanner(System.in);

    public static void primo() {
    int num;
    String respuesta = " ";
    System.out.println("Dime un numero y te dire si es primo o no: ");
        num = tc.nextInt();
        for (int i=2; i < num; i++) {
            if (num%i == 0) {
                respuesta = "Es primo";
            } else {
                respuesta = "No es primo";
            }
        }
        System.out.println(respuesta);
    }   

    public static void main(String[] args) {
        primo();
    }
}
