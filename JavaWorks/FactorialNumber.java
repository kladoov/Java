import java.util.Scanner;

public class FactorialNumber {

    /*
     * Escribe un programa en Java que solicite al usuario ingresar un número entero
     * no negativo y luego calcule el factorial de ese número. El factorial de un
     * número entero no negativo n se define como el producto de todos los números
     * enteros positivos menores o iguales a n.
     * 
     * Por ejemplo, el factorial de 5 (denotado como 5!) es 5 x 4 x 3 x 2 x 1 = 120.
     */

    public static Scanner tc = new Scanner(System.in); // scanner method

    // return num
    public static int tellNumber() {
        System.out.print("Dime un numero y te calculo el factorial: ");
        int num = tc.nextInt();
        return num;
    }

    public static void main(String[] args) {

        int num = tellNumber();
        int factorialNumber = 1;

        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                factorialNumber = factorialNumber * i;
            }

            System.out.println("El factorial de " + num + " es: " + factorialNumber);
        } else {
            System.out.println("El numero introducido es negativo.");
        }
    }
}
