package ex30;
import java.util.Scanner;
/* Calcular el mayor y el menor número de una serie de números enteros  
introducidos  por teclado, hasta teclear un 0.*/

public class ex30 {
public static Scanner tc = new Scanner(System.in);

public static void introducirNumeros (int num) {
    int mayor = 0, menor = 1000000000;
    while (num != 0) {    
        if (num > mayor) {
            mayor = num;
        } 
        if (num < menor) {
            menor = num;
        }
        System.out.print("DIME UN NUMERO O DIME UN 0 PARA FINALIZAR: ");
        num = tc.nextInt();
    }
    System.out.println("EL NUMERO MAYOR ES: " + mayor);
    System.out.println("EL NUMERO MENOR ES: " + menor);
}
public static void main(String[] args) {
System.out.print("DIME UN NUMERO O DIME UN 0 PARA FINALIZAR: ");
int num = tc.nextInt();

introducirNumeros(num);


}
}
