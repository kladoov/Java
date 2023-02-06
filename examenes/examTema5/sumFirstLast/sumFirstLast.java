package sumFirstLast;

import java.util.Arrays;

public class sumFirstLast {
public static int[] sumaPrimeroUltimo (int v[]) {
int i = 0;
int j = v.length -1;
int aux[] = new int[v.length / 2];

while (i < j) {
    aux[i] = v[i] + v[j];
    i++;
    j--; 
    }
    return aux;
}

public static void main(String[] args) {
int vector[] = {2, -7, 14, 5, -45, 5, 7, 2, 4, 6};

System.out.println(Arrays.toString(vector));
int aux[] = sumaPrimeroUltimo(vector);
System.out.println(Arrays.toString(aux));

    }
}
