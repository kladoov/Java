package basicCalculator;

import java.util.Scanner;

public class basicCalculator {
public static void main(String[] args) {
Scanner tc = new Scanner(System.in);
double num1, num2;
System.out.print("Tell me first number: ");
num1 = tc.nextDouble();
System.out.print("Tell me second number: ");
num2 = tc.nextDouble();
System.out.println("Has introducido el numero " + num1 + " y el " + num2);
System.out.println();

int cont = 0;
while (cont != 6 ) {
    System.out.println("--------------------");
    System.out.println("1. Sumar");
    System.out.println("2. Restar");
    System.out.println("3. Multiplicar");
    System.out.println("4. Dividir");
    System.out.println("5. Resto");
    System.out.println("6. Exit");
    System.out.println("--------------------");
    cont = tc.nextInt();
    
    switch (cont) {
        case 1: System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                break;   
        case 2: System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                break;
        case 3: System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
                break;
        case 4: System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                break;
        case 5: System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
                break;
        case 6: System.out.println("Good bye!!!");
                System.exit(cont);
        default:
            System.out.println("Use numbers between 1-5!");
            System.out.println();
            break;
    }
}

tc.close();

    }
}
