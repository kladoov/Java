package anon;
import java.util.Scanner;
 
 
public class anon {
 
 
public static Scanner tc = new Scanner(System.in);   
 
public static void loadarray(int arr[]) {
    System.out.println("Insert " + arr.length + " digits");
    for(int i=0; i < arr.length; i++) {
        arr[i] = tc.nextInt();
        }
    }
 
public static void viewarr(int arr[]) {
    for(int i=0; i < arr.length; i++) {
        System.out.print("|"+ arr[i] + "|");
        }
    }
 
public static double sum(int arr[]) {
    double sum = 0;
    for(int i=0; i<arr.length; i++){
        sum = arr[i] + sum;
    }
    return sum;
} 
 
public static double averge(double sum, int arr[]) {
    double res = sum / arr.length;
    return res;
}
 
 
public static int max(int arr[]) {
    int max = arr[0];
    for(int i=0; i<arr.length; i++){
        if(max<arr[i]) {
            max = arr[i];
        }
    }
    return max;
} 
 
public static int min(int arr[]) {
    int min = arr[0];
    for(int i=0; i<arr.length; i++){
        if(min>arr[i]) {
            min = arr[i];
        }
    }
    return min;
} 
 
 
public static void copy(int arr[], int aux[]) {
    for(int i=0; i < arr.length; i++) {
        aux[i] = arr[i];
    }
    for(int i=0; i < arr.length; i++) {
        System.out.print("|" + aux[i] + "|");
    }
} 
 
public static void even(int arr[]) {
    for(int i=0; i < arr.length; i++) {
        if(arr[i] % 2 == 0) {
            System.out.println(arr[i] + " Is even");
        }
    }
}
 
public static void odd(int arr[]) {
    for(int i=0; i < arr.length; i++) {
        if(arr[i] % 2 != 0) {
            System.out.println(arr[i] + " Is odd");
        }
    }
}
 
// ask usr for a index and return value
 
public static void index(int arr[]){
    System.out.println("Insert a number between 0 and " + arr.length); 
    int n = tc.nextInt();
    System.out.println("Your selected num is: " + arr[n-1]);
}
 
public static void main(String[] args) {
    int vector[] = new int [5];
    int aux[] = new int [5];
 
    loadarray(vector);
    viewarr(vector);
    System.out.println();
    int answer;
    answer = 0;
 
    while (answer != 5) {
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("Select what to do:");
        System.out.println("1. sum & avg");
        System.out.println("2. max & min");
        System.out.println("3. odd & even");
        System.out.println("4. copy arr");
        System.out.println("5. exit");
        System.out.println("-----------------------");
 
 
        answer = tc.nextInt();
 
        switch(answer) {
            case 1: 
                double sum = sum(vector);
                System.out.println();
                System.out.println("The sum of the array is: " + sum);
                System.out.println("The avg of the array is: " + averge(sum, vector));
                System.out.println();
                break;
            case 2:
                System.out.println("The max of the arr is: " + max(vector));
                System.out.println("The min of the arr is: " + min(vector));
                System.out.println();
                break;
            case 3:
                odd(vector);
                even(vector);
                break;
            case 4:
                copy(vector, aux);
                System.out.println();
                System.out.println("Array copiado: ");
                System.out.println();
                index(vector);
                break;
            case 5:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Use numbers between 1-5!");
                break;
        }
    }
 
 
 
    }
}