import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SearchEvenNumber {

    /*
     * Escribe un programa en Java que solicite al usuario ingresar una lista de
     * números enteros y luego encuentre todos los números pares en esa lista.
     * 
     * El programa debe hacer lo siguiente:
     * 
     * Solicitar al usuario que ingrese el número de elementos que desea ingresar en
     * la lista.
     * Solicitar al usuario que ingrese cada elemento de la lista.
     * Encontrar todos los números pares en la lista ingresada.
     * Mostrar los números pares encontrados en la pantalla.
     */

    public static Scanner tc = new Scanner(System.in); // scanner method

    public static void main(String[] args) {
        try {
            System.out.print("Dime cuantos numeros quieres ingresar: ");
            int num = tc.nextInt();

            int numbers[] = new int[num];
            ArrayList<Integer> evenNumbers = new ArrayList<>();

            // request numbers
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Ingresa un numero en la posicion " + i + ": ");
                int numRequest = tc.nextInt();
                numbers[i] = numRequest;
            }

            // print array
            System.out.println("----------------------------------------");
            System.out.print("Numeros ingresados: ");
            for (int c = 0; c < numbers.length; c++) {
                System.out.print(numbers[c] + " ");

                // here search even numbers
                if (numbers[c] % 2 == 0) {
                    evenNumbers.add(numbers[c]);
                }
            }
            System.out.println();

            // print array even numbers
            System.out.println("Numeros pares encontrados: ");
            System.out.print(evenNumbers);

        } catch (InputMismatchException e) {
            System.out.println("Solo se admiten numeros enteros.");
        }

    }
}
