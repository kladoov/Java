package accessCourse;

import java.util.Scanner;

public class accessCourse {
public static void main(String[] args) {
Scanner tc = new Scanner(System.in);
System.out.println("What group do you belong to?: "); //¿A que clase perteneces?
String group = tc.nextLine();
if (group.equals("A")) { //.equals sirve para localizar chars
    System.out.println("Access to SMR");
    } else if (group.equals("B")) {
    System.out.println("Access to DAM");
    } else if (group.equals("C")) {
    System.out.println("Access to DAW");
    } else {
        System.out.println("GOOD BYE!!!");
    }
tc.close();
    }
}
