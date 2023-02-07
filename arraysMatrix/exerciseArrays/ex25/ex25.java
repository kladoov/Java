package ex25;
/*Dado un vector A de n números enteros, se pide obtener los vectores B 
y  C  a  partir  del  vector  A.  En  el  vector  B  se  deben  poner  los  números 
pares  y  en  el  vector  C  se  deben  poner  los  números  impares.  Visualizar 
todos los vectores. 
int[]A = {2, 8, 15, 3, 22, 14, 5, 6, 7}; 
int[]B= {2, 8, 22, 14, 6}; 
int[]C = {15, 3, 5, 7}; */

import java.util.Scanner;
public class ex25 {
public static Scanner tc = new Scanner(System.in);
public static void oddEvenMatrix (int a[], int b[], int c[]) {
int cont = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i]%2 == 0) {
            a[i] = b[cont];
            cont++;
        } else {
            a[i] = c[cont];
        }
    }
}

public static void visualizarMatrixB (int b[]) {
    for (int i = 0; i < b.length; i++) {
        System.out.print(b[i] + "|");
    }
}

public static void visualizarMatrixC (int c[]) {
    for (int i = 0; i < c.length; i++) {
        System.out.print(c[i] + "|");
    }
}
public static void main(String[] args) {
int a[] = {2, 8, 15, 3, 22, 14, 5, 6, 7};
int b[] = {};
int c[] = {};

oddEvenMatrix(a, b, c);
visualizarMatrixB(b);
visualizarMatrixC(c);



    }
}
