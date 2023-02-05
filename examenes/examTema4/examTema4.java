package examTema4;
 
public class examTema4 {
public static int cargaNumero (int min, int max) {
    int aleatorio = (int)(Math.random()*(max-min+1)+min);
    return aleatorio;
}

public static int cargaNumeroDistinto (int n1, int min, int max) {
    int n2 = (int)(Math.random()*(max-min+1)+min);
    while (n2 == n1) {
        n2 = (int)(Math.random()*(max-min+1)+min);
    }
    return n2;
}

public static int cargaNumeroDistintoAnteriores (int n1, int n2, int min, int max) {
    int n3 = (int)(Math.random()*(max-min+1)+min);
    while (n3 == n1 || n3 == n2) {
        n3 = (int)(Math.random()*(max-min+1)+min);
    }
    return n3;
}

public static boolean dimeTriplete (int n1, int n2, int n3) {
    if (n1 + n2 == n3 || n1 + n3 == n2) {
    } else if (n2 + n1 == n3 || n2 + n3 == n1) {
    } else if (n3 + n1 == n2 || n3 + n2 == n1) {
    } 
    return true;
}

public static void dibujaPiramideUltimaCifra (int n1) {
if (n1 > 0 && n1 >=9) {
    n1 = n1 % 1;
} else if (n1 > 10 && n1 <= 99) {
    n1 = n1 % 10;
}
    for (int i = n1; i >= 1; i--) {
        System.out.println();
        for (int a = 1; a <= i; a++) {
            System.out.print(i);
        }
    }
}

public static void main(String[] args) {
int min = 0;
int max = 100;
int n1, n2, n3;
    n1 = cargaNumero(min, max);
    n2 = cargaNumeroDistinto(n1, min, max);
    n3 = cargaNumeroDistintoAnteriores(n1, n2, min, max);
    System.out.println("RANDOM NUMERS: " + n1 + ", " + n2 + ", " + n3);

System.out.println("-------------------------------------------------------");

boolean triplete = dimeTriplete(n1, n1, n3);
if (triplete) {
    System.out.println("LOS NUMEROS FORMAN UN TRIPLETE");
} else {
    System.out.println("NO FORMAN UN TRIPLETE");
}

System.out.println("-------------------------------------------------------");

dibujaPiramideUltimaCifra(n1);

    }
}