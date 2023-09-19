package clasecliente;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cliente {

    private int id_cliente;
    private String nombre;
    private String direccion;
    private int telefono;

    public Cliente() {

    }

    public Cliente(int id, String nom, String dir, int tel) {
        this.id_cliente = id;
        this.nombre = nom;
        this.direccion = dir;
        this.telefono = tel;
    }

    public Cliente pedirDatos(Cliente cl) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Id: ");
        this.id_cliente = tc.nextInt();
        System.out.print("Nombre: ");
        this.nombre = tc.next();
        System.out.print("Direccion:");
        this.direccion = tc.next();
        System.out.print("Telefono: ");
        this.telefono = tc.nextInt();
        Cliente cli = new Cliente(this.id_cliente, this.nombre, this.direccion, this.telefono);
        System.out.println(this.nombre + " CREATED");
        return cli;
    }

    public void guardarDatos() throws IOException {
        try {
            FileWriter fw = new FileWriter("nombre.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.print("\nID: " + this.id_cliente + "\nNOMBRE: " + this.nombre + "\nDIRECCION: " + this.direccion + "\nTELEFONO: " + this.telefono);
            salida.close();
            bw.close();
            fw.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
    
    //LEER EN UN FICHERO DE TEXTO
    public void leerDatos() throws FileNotFoundException {
        try {
            FileReader fr = new FileReader("nombre.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea); 
            }
            br.close();
            fr.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public String toString() {
        return "\nID: " + this.id_cliente + "\nNOMBRE: " + this.nombre + "\nDIRECCION: " + this.direccion + "\nTELEFONO: " + this.telefono;

    }

}
