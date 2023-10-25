package appcsv;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/*@author alekk*/
//ejercicio propio de lectura con .csv que controla el stock de una fruteria
//id:nombre:stock:precioKilo:disponinilidad
public class Fruteria {

    public Fruteria() {
    }

    //muestra los datos de toda la fruteria.
    public void viewFruteria() {
        try {
            Scanner tc = new Scanner(new FileReader("fruteria.csv"));
            while (tc.hasNext()) {
                System.out.println(tc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }

    //muestra solo los nombres de las frutas.
    public void readNombreFruta() {
        try {
            Scanner tc = new Scanner(new FileReader("fruteria.csv"));
            String linea;
            String datos[];

            while (tc.hasNext()) {
                linea = tc.nextLine();
                datos = linea.split(":");
                System.out.println(datos[1]);
            }

        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }

    //suma el stock total de frutas
    public void sumStockFrutas() {
        try {
            Scanner tc = new Scanner(new FileReader("fruteria.csv"));
            String linea;
            double suma = 0;
            String datos[];

            while (tc.hasNext()) {
                linea = tc.nextLine();
                datos = linea.split(":");
                suma = suma + Double.parseDouble(datos[2]);
            }
            System.out.println("DISPONIBILIDAD " + suma + " FRUTAS.");

        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }

    //muestra las frutas que estan sin stock y almacenalos en un nuevo .csv
    public void whitoutStock() {
        try {
            Scanner tc = new Scanner(new FileReader("fruteria.csv"));
            String linea;
            String datos[];
            System.out.println("NO HAY STOCK DE: ");

            FileWriter fw = new FileWriter("whitoutStrock.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            while (tc.hasNext()) {
                linea = tc.nextLine();
                datos = linea.split(":");
                if (datos[4].equalsIgnoreCase("false")) {
                    pw.println(datos[1]);
                    System.out.println(datos[1]);
                }
            }

            pw.close();
            bw.close();
            fw.close();
            System.out.println("whitoutStrock.csv CREATED.");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    //busca el nombre de la fruta que quieras mostrar
    public void searchFruta(String nombre) {
        try {
            Scanner tc = new Scanner(new FileReader("fruteria.csv"));
            String linea;
            String datos[];
            System.out.println("Estas buscando " + nombre + ".");
            boolean nombreEncontrado = false;

            while (tc.hasNext()) {
                linea = tc.nextLine();
                datos = linea.split(":");
                if (datos[1].equalsIgnoreCase(nombre)) {
                    nombreEncontrado = true;
                    System.out.println(datos[0] + ":" + datos[1] + ":" + datos[2] + ":" + datos[3] + ":" + datos[4]);
                }
            }

            if (!nombreEncontrado) {
                System.out.println("Tu buscado " + nombre + " no se ha encontrado.");
            }

        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }

    //incrementa el precio por kilo un 21% del IVA
    public int incrementPriceperKg() {
        try {
            Scanner tc = new Scanner(new FileReader("fruteria.csv"));
            String linea;
            double price, precioIncrementado;
            String datos[];
            System.out.println("NOOOO, aumentamos el precio por kilo en un 21%");

            while (tc.hasNext()) {
                linea = tc.nextLine();
                datos = linea.split(":");
                price = Double.parseDouble(datos[3]);
                precioIncrementado = (price * 0.21);
                price = price + precioIncrementado;
                System.out.println(datos[0] + ":" + datos[1] + ":" + datos[2] + ":" + price + ":" + datos[4]);
            }

            return 1;
        } catch (FileNotFoundException e) {
            e.getMessage();
            return -1;
        }
    }

}
