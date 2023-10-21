package appdom;

import java.io.File;
import java.util.Scanner;

/*@author alekk*/
public class AppDOM {

    public static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {

        File f = new File("App.xml");
        CommandsDOM dom = new CommandsDOM(f);
        System.out.println("");

        String nombre, asig1, asig2, asig3;
        double horas;

        try {
            int opt = 0;
            while (opt != 9) {
                System.out.println("-----------------------------");
                System.out.println("INTERACCION CON EL ARBOL DOM");
                System.out.println("1. MOSTRAR ARBOL DOM.");
                System.out.println("2. INSERTA PROPIAMENTE UNA NUEVA CLASE EN EL ARBOL DOM.");
                System.out.println("3. ELIMINA UN NODO SABIENDO EL NOMBRE DEL ATRIBUTO <clase nombre=...>");
                System.out.println("4. CALCULA LA MEDIA DE HORAS DE TODOS LAS CLASES.");
                System.out.println("5. CAMBIA EL NOMRE DE LA asignatura1.");
                System.out.println("6. MUESTRA EL CURSO CON EL MENOR NUMERO DE HORAS.");
                System.out.println("7. BUSCAR asignatura2.");
                System.out.println("8. GENERA NUEVO ARCHIVO .xml.");
                System.out.println("9. SALIR.");
                opt = tc.nextInt();

                switch (opt) {
                    case 1:
                        dom.muestraDOM();
                        break;
                    case 2:
                        System.out.print("- NOMBRE DE LA CLASE: ");
                        nombre = tc.next();
                        System.out.print("- ASIGNATURA1: ");
                        asig1 = tc.next();
                        System.out.print("- ASIGANTURA2: ");
                        asig2 = tc.next();
                        System.out.print("- ASIGNATURA3: ");
                        asig3 = tc.next();
                        System.out.println("ojo* si es decimal escribe la ,");
                        System.out.print("- HORAS: ");
                        horas = tc.nextDouble();
                        dom.insertaPelicula(asig1, asig2, asig3, horas, nombre);
                        break;
                    case 3:
                        dom.eliminaNodo();
                        break;
                    case 4:
                        dom.mediaHorasAsignaturas();
                        break;
                    case 5:
                        dom.cambiarNombreAsignatura("Entorno de desarrollo", "nueva");
                        break;
                    case 6:
                        dom.numeroMenorHoras();
                        break;
                    case 7:
                        System.out.print("BUSCAR: ");
                        String buscar = tc.next();
                        dom.buscadorAsignatura2(buscar);
                        break;
                    case 8:
                        dom.crearNuevoArchivo("AppCopia");
                        break;
                    case 9:
                        System.out.println("Thanks for using this AppDOM, have a nice day!!!");
                        break;
                }

            }
        } catch (Exception e) {
            e.getMessage();
        }

    }
}
