
package temperaturas;

import java.util.Scanner;

public class Temperaturas {
   
    public static void cargarTemperaturas(String m[], double t[][]){
        Scanner tc=new Scanner(System.in);
        
        System.out.println("Carga de las temperaturas del año");
        //recorro la matriz por columnas, para que me pregunte las  dos temperaturas de cada mes
        for (int c=0;c<t[0].length;c++){
            System.out.println("Introduce la temperatura mínima y máxima de " + m[c]);
            //la fila 0 es para la temperatura mínima y la fila 1 es para la temperatura máxima
            for (int f=0;f<t.length;f++){
                t[f][c]=tc.nextDouble();
            }
        }  
    }
    
    public static void visualizarTemperaturas(String m[], double t[][]){
        System.out.println("Temperaturas del año");
        //recorro la matriz por columnas, para que me muestre los meses
        for (int c=0;c<t[0].length;c++){
            System.out.println("Temperatura mínima y máxima de " + m[c]);
            //la fila 0 es para la temperatura mínima y la fila 1 es para la temperatura máxima
            for (int f=0;f<t.length;f++){
                System.out.print(t[f][c] + "  ");
            }
            //salto de linea despues de visualizar las temperaturas de cada mes
            System.out.println();
        }  
    }
    
    public static int dimeMesMasFrio(double t[][]){
        double masfrio=t[0][0]; //supongo la temperatura más fria la del mes de enero
        int pos=0; // la posición del mes de enero es el de indice 0
        
        /*recorro toda la fila 0 de la matriz porque es donde tengo guardada la temperatura mínima y si encuentro 
        alguna temperatura menor la cambio y guardo la posicion */
        for (int c=0; c<t[0].length;c++){
            if (t[0][c]<masfrio){ // he encontrado una temperatura menor, por tanto la cambio y guardo la posición de ese mes
                masfrio=t[0][c];
                pos=c;
            }
        }
        return pos; //devuelvo la posición del mes con temperatura mínima más baja
    }
    
    public static String dimeMesMasCaluroso(String m[], double t[][]){
        double mascalor=t[0][0]; //supongo la temperatura más calor la del mes de enero
        int pos=0; // la posición del mes de enero es el de indice 0
        
        /*recorro toda la fila 1 de la matriz porque es donde tengo guardada la temperatura máxima y si encuentro 
        alguna temperatura mayor la cambio y guardo la posicion */
        for (int c=0; c<t[0].length;c++){
            if (t[1][c]> mascalor){ // he encontrado una temperatura mayor, por tanto la cambio y guardo la posición de ese mes
                mascalor=t[1][c];
                pos=c;
            }
        }
        return m[pos]; //devuelvo el nombre del mes con temperatura máxima mayor
    }
    
    public static void main(String[] args) {
       String meses[]={"enero","febrero", "marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
       double temperaturas[][]=new double[2][12];
       
       cargarTemperaturas(meses, temperaturas);
       visualizarTemperaturas(meses, temperaturas);
       int mesMasFrio=dimeMesMasFrio(temperaturas);
       System.out.println("El mes con temperatura mas baja es "+ meses[mesMasFrio]);
       System.out.println("El mes con temperatura mas alta es  "+ dimeMesMasCaluroso(meses, temperaturas));
            
    }
    
}
