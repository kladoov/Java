package gameBoats;

import java.util.Scanner;

public class gameBoats {
public static Scanner tc = new Scanner(System.in);

public static void viewBoat(int b[][]) {        //method to view position of boat
    for (int i = 0; i < b.length; i++) {
        for (int j = 0; j < b[i].length; j++) {
            System.out.print(b[i][j] + " ");
        }
        System.out.println();
    }
}

public static void main(String[] args) {
int boat[][] = new int[3][3];
int tries = 0;      //intentos
boolean guess = false;  //adivinar 
 boat[0][0] = 1;
 boat[1][1] = 1;
 boat[2][2] = 1;

// while loop to check if the user can guess where 1 is in the boat
while (guess == false && tries < 2) {
    System.out.println("Guess where 1 is in the boat");
    int row = tc.nextInt();
    int column = tc.nextInt();
        if  (boat[row][column] == 1) {
            System.out.println("You guessed right!");
            guess = true;
        } else {
            System.out.println("You guessed wrong!");
            tries++;
        }
        if (tries == 3) {
            System.out.println("You have used all your tries");
            guess = true;
        }
    }

if (guess == true) {
    System.out.println("you won!");
} else {
    System.out.println("you lost!");
}
    
    viewBoat(boat);   //visualizar posicion barco

    }
}