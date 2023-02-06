package gameBoats;

import java.util.Scanner;

public class gameBoats {
public static Scanner tc = new Scanner(System.in);
public static void viewBoat (int m[][]) {
    for (int f = 0; f < m.length; f++) {
        System.out.println();
        for (int c = 0; c < m[0].length; c++) {
            System.out.print(m[f][c] + " ");
        }
    }
}


public static void main(String[] args) {
int matrix[][] = new int[3][3];
matrix[0][0] = 1;
matrix[1][1] = 1;
matrix[0][2] = 1;

int tries = 0;
boolean gues = false;

while (gues == false && tries < 3) {
System.out.println("TELL ME A ROW FIRST ANT COL:");
    int row = tc.nextInt();
    int col = tc.nextInt();
    if (matrix[row][col] == 1) {
        System.out.println("BOAT OUT, YOU WON!!");
        gues = true;
    } else {
        System.out.println("BOAT UP, YOU HAVE OTHER TRIE");
        tries++;
    }
    if (tries == 3) {
        System.out.println("BYE BYE, YOU NOT HAVE MORE TRIES");
    }
}

if (gues == true) {
    System.out.println("YOU WON");
} else {
    System.out.println("YOU LOST");
}

viewBoat(matrix);


    }
}