package printF;

import java.util.Scanner;

public class printF {
public static void main(String[] args) {
Scanner tc= new Scanner(System.in);
        
System.out.print("Dime tu nombre: ");
    String nombre = tc.nextLine();
System.out.print("Dime tu edad: ");
    int edad = tc.nextInt();
System.out.print("Dime tu altura: ");
    double altura = tc.nextDouble();
        
System.out.printf("\nHola, eres %s y en mayusculas sales %S, tienes %d años y mides %f y con dos decimales mides %.2f \n", nombre, nombre, edad, altura, altura);
    
tc.close();    
    
    }
        
}