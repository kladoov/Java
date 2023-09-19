package clientesbanco;

public class ClientesBanco {

    public static void main(String[] args) {
        Banco bn = new Banco();

        //muestra todo el .csv
        bn.verClientes();

        //extrae los nombres de los clientes
        System.out.println("");
        bn.leerClientes();

        //suma todos los sueldos
        System.out.println("");
        bn.sumaDinero();

        //muestra el nombre y salario de los clientes sin seguro
        //ademas guarda en un .txt
        System.out.println("");
        System.out.println("-----CLIENTES SIN SEGURO-----");
        bn.clientesSinSeguro();
        
        //crea .txt de clientes que tienen mas de 30.000 
        System.out.println("");
        System.out.println("-----CLIENTES VIP +=30.0000-----");
        bn.clientesVIP();
        
        //busca un nombre que pidas por teclado en el .csv
        System.out.println("");
        bn.buscaNombre();
        
        //calcula los intereses de un 1% y los guarda en un .csv nuevo
        System.out.println("");
        bn.clientesActual();
        
    }

}
