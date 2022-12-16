package valorCompra;
import java.util.Scanner;
/*Diseñar:
Calcula el descuento aplicar a un usuario de la gran superficie segun el valor de su compra. 
Teniendo en cuenta que las compras
inferiores a 150 no tienen descuento (se notificara al usuario).
Para compras entre 150-250 descuento del 5%.
Para compras entre 250-300 descuento del 10%
Para el resto de compras 20%.*/
public class valorCompra {
    public static void main(String[] args) {
    double precio, desc = 0;
    Scanner tc = new Scanner(System.in);
    System.out.println("Cuanto dinero te has gastado en la compra: ");
    precio = tc.nextDouble();

    if (precio < 150) {
        System.out.println("No tienes ningún descuento, debe ser superior a 150");
    } else if (precio >=150 && precio <250) {
        System.out.println("!!Tienes un descuento del 5%!!");
        desc = precio * 0.05;
        System.out.println("Tu compra de " + precio + " euros tiene un descuento de " + desc);
        precio = precio - desc;
        System.out.println("Tu compra se queda en: " + precio);
    } else if (precio >=250 && precio <300) {
        System.out.println("!!Tienes un descuento del 10%!!");
        desc = precio * 0.10;
        System.out.println("Tu compra de " + precio + " euros tiene un descuento de " + desc);
        precio = precio - desc;
        System.out.println("Tu compra se queda en: " + precio);
    } else {
        System.out.println("!!Tienes un descuento del 20%!!");
        desc = precio * 0.20;
        System.out.println("Tu compra de " + precio + " euros tiene un descuento de " + desc);
        precio = precio - desc;
        System.out.println("Tu compra se queda en: " + precio);
    }
    tc.close();
    }
}