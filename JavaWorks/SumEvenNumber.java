import java.util.Scanner;

public class SumEvenNumber {

    /*
     * Escribe un programa en Java que solicite al usuario ingresar un número entero
     * positivo y luego calcule la suma de todos los números pares desde 1 hasta ese
     * número (inclusive).
     * 
     * Por ejemplo, si el usuario ingresa el número 6, el programa debería calcular
     * la suma de todos los números pares desde 1 hasta 6, es decir, 2 + 4 + 6 = 12.
     */

    public static Scanner tc = new Scanner(System.in); // scanner method

    // return num
    public static int tellNumber() {
        System.out.print("Dime un numero par y te calculo todos los numeros pares posteriores: ");
        int num = tc.nextInt();
        return num;
    }

    public static void main(String[] args) {

        int tellNumber = tellNumber();
        int i;
        int result = 0;

        if (tellNumber > 0) {
            for (i = 1; i <= tellNumber; i++) {
                if (i % 2 == 0) {
                    result = result + i;
                }
            }

            System.out.println("Has introducido el numero " + tellNumber + " la suma de numeros pares es: " + result);

        } else {
            System.out.println("No se admiten numeros negativos.");
        }

    }
}
