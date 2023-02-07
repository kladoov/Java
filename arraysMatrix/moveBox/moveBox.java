package moveBox;

import java.util.Arrays;

public class moveBox {
public static void moveBoxes (int v[], int a[]) {
        a[4] = v[4];
        a[9] = v[9];
        v[4] = a[9];
}
public static void main(String[] args) {
int vector[] = {1, 2, 3, 4 , 5, 6, 7, 8, 9, 10};
int aux[] = new int[vector.length];

System.out.println(Arrays.toString(vector));

moveBoxes(vector, aux);

System.out.println(Arrays.toString(aux));

    }
}