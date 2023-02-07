package ex11;
import java.util.Scanner;
/*Crea  un  programa  en  Java  que  nos  permita  buscar  un  numero  en  un 
vector  de  10  elementos  de  tipo  entero.  El  número  a  buscar  se  pedirá 
por teclado.*/
public class ex11 {
public static Scanner tc = new Scanner(System.in);
public static int askForNumber() {
    System.out.print("TELL ME A NUMBER AND I TELL YOU IF IT EXISTS: ");
    int num = tc.nextInt();
    return num;
}

public static void searchArray(int v[], int num) {
    for (int i = 0; i < v.length; i++) {
        if (v[i] == num) {
            System.out.println("EL NUMERO " + num + " SE ENCUENTRA EN LA POSICION " + i);
        } 
    }   
}
public static void main(String[] args) {
int vector[] = {2, 4, 5, 9, 1, 4, 2, 10, 3, 5};

int num = askForNumber();
searchArray(vector, num);




    }
}
