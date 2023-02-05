package deleteSpaces;
import java.util.Scanner;

/*Pedir una frase por tc y devolver al programa principal la misma
 * frase sin espacios en blanco. No utilizar ninguna funcion predefinida
 * del tipo de datos String.
*/

public class deleteSpaces {
public static Scanner tc = new Scanner(System.in);

public static String tellString(String text) {
String newString = " ";
    for (int i = 0; i < text.length(); i++) {
        if (text.charAt(i) != ' ') {
            newString = newString + text.charAt(i);
        }
    }
    return newString;
}
public static void main(String[] args) {
System.out.print("Tell me a String: ");
String text = tc.nextLine();
tellString(text);
System.out.println(tellString(text));
    



    }
}
