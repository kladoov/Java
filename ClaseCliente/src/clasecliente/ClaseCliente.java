package clasecliente;

import java.io.IOException;

public class ClaseCliente {

    public static void main(String[] args) throws IOException {

        int lista[] = {5, 3, 1, 0, 7};
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]);
        }

        System.out.println("");

        Cliente cl = new Cliente();
        
        System.out.println("");
        cl.pedirDatos(cl);
        
        cl.guardarDatos();
        
        cl.leerDatos();
    }
}
