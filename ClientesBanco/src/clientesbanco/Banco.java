package clientesbanco;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*@author alekk*/
public class Banco {

    public void verClientes() {
        try {
            Scanner tc = new Scanner(new FileReader("clientesBanco.csv"));
            while (tc.hasNext()) {
                System.out.println(tc.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leerClientes() {
        try {
            Scanner tc = new Scanner(new FileReader("clientesBanco.csv"));
            String linea;
            String datos[];
            while (tc.hasNext()) {
                //leer linea
                linea = tc.nextLine();
                //extraer el nombre de clientes con funcion split
                datos = linea.split(":");
                System.out.println(datos[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sumaDinero() {
        try {
            Scanner tc = new Scanner(new FileReader("clientesBanco.csv"));
            String linea;
            String datos[];
            int suma = 0;
            while (tc.hasNext()) {
                //leer linea
                linea = tc.nextLine();
                //extraer el nombre de clientes con funcion split
                datos = linea.split(":");
                suma = suma + Integer.parseInt(datos[2]);
            }
            System.out.println("EL SALDO TOTAL DE LOS CLIENTES ES: " + suma);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clientesSinSeguro() {
        try {
            Scanner tc = new Scanner(new FileReader("clientesBanco.csv"));
            String linea;
            String datos[];
            //escribe en un .txt
            FileWriter fw = new FileWriter("clientesSinSeguro.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);

            while (tc.hasNext()) {
                //leer linea
                linea = tc.nextLine();
                //extraer el nombre de clientes con funcion split
                datos = linea.split(":");
                if (datos[4].equalsIgnoreCase("false")) {
                    salida.println(datos[1] + " - " + datos[2]);
                    System.out.println(datos[1] + " - " + datos[2]);
                }
            }
            salida.close();
            bw.close();
            fw.close();
            System.out.println("ARCHIVO clientesSinSeguro.txt CREADO");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //1. Generar el archivo clientesVIP con toda la información de los clientes que tienen más de 30.000 euros de saldo.
    public void clientesVIP() {
        try {
            Scanner tc = new Scanner(new FileReader("clientesBanco.csv"));
            String linea;
            String datos[];
            int saldo = 0;
            //escribe en un .txt
            FileWriter fw = new FileWriter("clientesVIP.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);

            while (tc.hasNext()) {
                //leer linea
                linea = tc.nextLine();
                //extraer el nombre de clientes con funcion split
                datos = linea.split(":");
                saldo = Integer.parseInt(datos[2]);
                if (saldo >= 30000) {
                    salida.println(datos[0] + ":" + datos[1] + ":" + datos[2] + ":" + datos[3] + ":" + datos[4]);
                    System.out.println(datos[0] + ":" + datos[1] + ":" + datos[2] + ":" + datos[3] + ":" + datos[4]);
                }
            }
            salida.close();
            bw.close();
            fw.close();
            System.out.println("ARCHIVO clientesVIP.txt CREADO");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //2. Haz un método que pide por pantalla un nombre y busca si está en el archivo o no. si esta, 
    //muestra toda su información por pantalla
    public void buscaNombre() {
        try {
            Scanner tc = new Scanner(new FileReader("clientesBanco.csv"));
            Scanner sc = new Scanner(System.in);
            String linea;
            String datos[];
            System.out.println("DIME UN NOMBRE Y LO BUSCO EN EL .CSV: ");
            String nombre = sc.nextLine();
            while (tc.hasNext()) {
                //leer linea
                linea = tc.nextLine();
                //extraer el nombre de clientes con funcion split
                datos = linea.split(":");
                if (datos[1].equalsIgnoreCase(nombre)) {
                    System.out.println(nombre + " APARECE EN EL .CSV");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*3. Haz un método que crea un archivo ClientesActual.csv.
    El método mira el saldo de cada cliente, y calcula los intereses que
    hay que pagarle, que son el 1% del saldo de su cuenta. El método muestra por
    pantalla el nombre y los intereses que le corresponde a cada cliente y copia
    todos los datos de ese cliente en el archivo "clientesActual.csv",
    con el saldo actualizado, que es la suma de lo que tiene ahora más los
    intereses que hemos calculado*/
    public void clientesActual() {
        try {
            Scanner tc = new Scanner(new FileReader("clientesBanco.csv"));
            String linea;
            String datos[];
            double saldo = 0;
            
            FileWriter fw = new FileWriter("ClientesActual.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);

            while (tc.hasNext()) {
                //leer linea
                linea = tc.nextLine();
                //extraer el nombre de clientes con funcion split
                datos = linea.split(":");
                saldo = Integer.parseInt(datos[2]);
                saldo = (saldo / 100);
                System.out.println("INTERESES DE " + datos[1] + " ES " + saldo + ".");
                salida.println(datos[0] + ":" + datos[1] + ":" + saldo + ":" + datos[3]+ ":" + datos[4]);
            }
            
            salida.close();
            bw.close();
            fw.close();
            System.out.println("FICHERO ClientesActual.csv CREADO");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
