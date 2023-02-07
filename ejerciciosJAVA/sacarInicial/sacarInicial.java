package sacarInicial;

import java.util.Scanner;

public class sacarInicial {
public static void main(String[] args) {
Scanner tc= new Scanner(System.in);
    
System.out.print("Tell me your name: ");
    String nombre = tc.nextLine();
    
System.out.print("Tell me your last name: ");
    String ap1 = tc.nextLine();
    
System.out.print("Tell me your second last name: ");
    String ap2 = tc.nextLine();
    
    System.out.print(nombre.charAt(0));
    System.out.print(ap1.charAt(0));        //.charAt(0) <-- sacar la primera inicial
    System.out.println(ap2.charAt(0)); 
    
tc.close();
    
    }
}