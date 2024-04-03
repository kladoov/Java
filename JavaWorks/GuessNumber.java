import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    /*
     * Crea un juego en Java donde la computadora elige un número aleatorio entre 1
     * y 100,
     * y el jugador debe adivinar cuál es ese número. Después de cada intento, la
     * computadora
     * debe indicar si el número ingresado por el jugador es demasiado alto,
     * demasiado bajo o correcto.
     * El juego debe continuar hasta que el jugador adivine el número correcto.
     */

    // return random number between 1 and 100
    private static int generateRandomNumber() {
        Random rnd = new Random();
        int num = rnd.nextInt(1, 100);
        return num;
    }

    // scanner method
    private static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {

        int rnd = generateRandomNumber(); // random number

        try {

            System.out.print("Tell me number between 1 and 100: ");
            int tellRnd = tc.nextInt();

            do {

                if (tellRnd == rnd) {
                    break;

                } else {

                    if (tellRnd > rnd) {
                        System.out.println("It is a lower number.");
                    } else {
                        System.out.println("It is a higher number.");
                    }

                    System.out.print("Tell me other number between 1 and 100: ");
                    tellRnd = tc.nextInt();
                }

            } while (tellRnd != rnd);

            System.out.println("¡¡¡You guess the number, congratulations!!!");

        } catch (InputMismatchException e) {
            System.out.println("Only numbers.");
        }

    }

}
