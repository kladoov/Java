package procesos;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/*@author alekk*/
public class ComandProcess {

    public void processNotepad() {
        //Ejecta el proceso notepad.exe
        try {
            ProcessBuilder pb = new ProcessBuilder("notepad.exe");
            Process p = pb.start();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public void cmdProcess() {
        //Una vez lanzado el proceso, no lo veremos a simple vista ya que se ejecuta en la habitacion de al lado
        try {
            Process cmd = new ProcessBuilder("cmd.exe", "/C", "dir").start();
            //.getInputStream devuelve el resultado de un proceso
            InputStream is = cmd.getInputStream();
            int c;
            //lee caracter a caracter
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            }
            is.close();

            //salida si da algun error de sintaxis
            InputStream er = cmd.getErrorStream();
            int e;
            while ((e = er.read()) != -1) {
                System.out.println((char) e);
            }
            er.close();

        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void proyectoJava() {
        try {
            File directorio = new File(".//sumaNumeros//src//sumanumeros");
            ProcessBuilder pb = new ProcessBuilder("java", "sumaNumeros.java");
            pb.directory(directorio);
            System.out.println("El directorio de trabajo es: " + directorio);
            Process p = pb.start();

            //visualiza la salida del proceso
            InputStream is = p.getInputStream();
            int c;
            //lee caracter a caracter
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            }
            is.close();

            //visualiza el error de un proceso
            InputStream er = p.getErrorStream();
            int e;
            while ((e = er.read()) != -1) {
                System.out.print((char) e);
            }
            is.close();

        } catch (Exception e) {
            e.getMessage();
        }
    }

}
