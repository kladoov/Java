package oddEven;

//odd impar
//even par
import java.util.Scanner;

public class oddEven {
public static void main(String[] args) {
Scanner tc = new Scanner(System.in);
System.out.print("Tell me a number: ");
double num = tc.nextDouble();

if (num%2 == 0) {
    System.out.println("Is even");
    } else if  (num%2 != 0) {
    System.out.println("Is odd");
    }

tc.close();
    }
}
