package sumFirstLast;

public class sumFirstLast {
public static void sumaPrimeroUltimo (int v[], int a[]) {
    a[0] = v[0] + v[9];
    a[1] = v[1] + v[8];
    a[2] = v[2] + v[7];
    a[3] = v[3] + v[6];
    a[4] = v[4] + v[5];
    for (int i = 0; i <= 4; i ++) {
        System.out.print(a[i] + " ");
    }
}

public static void main(String[] args) {
int vector[] = {2, -7, 14, 5, -45, 5, 7, 2, 4, 6};
int aux[] = new int [5];

sumaPrimeroUltimo(vector, aux);



    }
}
