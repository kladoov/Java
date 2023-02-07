package deleteChar;
import java.util.Scanner;

/*Realiza un programa en Java que pida al usuario introducir una cadena
de caracteres y un carácter. El programa eliminará de la cadena el
carácter pedido. */

public class deleteChar {
    public static Scanner tc = new Scanner(System.in);

    public static String pedirCadena () {
        System.out.println("Tell me a String of characters: ");
        String pisda = tc.nextLine();
        return pisda;
    }

    public static char pedirCaracter () {
        System.out.println("Tell me a one character: ");
        char hola = tc.next().charAt(0);
        return hola;
    }

    public static String deleteCharacter (String pedirCadena, char pedirCaracter) {
    String nuevo= "";
    for (int i = 0; i < pedirCadena.length(); i++) {
        if (pedirCadena.charAt(i) != pedirCaracter) {
            nuevo = nuevo + pedirCadena.charAt(i);
        }
    }
        System.out.println("The final string is: " + nuevo);
        return nuevo;
    }
    public static void main(String[] args) {
    String pola = pedirCadena();
    char pula = pedirCaracter();
    deleteCharacter(pola, pula);     

    }
}
