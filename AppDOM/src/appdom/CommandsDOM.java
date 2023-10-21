package appdom;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.util.Scanner;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*@author alekk*/
public class CommandsDOM {

    Document doc;

    public CommandsDOM(File f) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setIgnoringComments(true);
            factory.setIgnoringElementContentWhitespace(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            doc = builder.parse(f);
            System.out.println("-----DOM CREADO LLAMADO " + f + "------");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    //recorre el arbol DOM de forma estatica
    public void muestraDOM() {
        String[] datos = new String[5];
        Node n1;
        Node root = doc.getFirstChild();
        NodeList nl1 = root.getChildNodes();
        for (int i = 0; i < nl1.getLength(); i++) {
            n1 = nl1.item(i);
            if (n1.getNodeType() == Node.ELEMENT_NODE) {
                Node n2;
                int contador = 1;
                datos[0] = n1.getAttributes().item(0).getNodeValue();
                NodeList nl2 = n1.getChildNodes();

                for (int j = 0; j < nl2.getLength(); j++) {
                    n2 = nl2.item(j);
                    if (n2.getNodeType() == Node.ELEMENT_NODE) {
                        datos[contador] = n2.getTextContent();
                        contador++;
                    }
                }
                System.out.println(datos[0] + " - " + datos[1] + " - " + datos[2] + " - " + datos[3] + " - " + datos[4]);
            }
        }
    }

    //inserta una nueva clase en el árbol. Devuelve 0 si funciona, -1 si hay algún error    
    public void insertaPelicula(String asig1, String asig2, String asig3, double horas, String nombre) {
        try {
            //CREA ASIGNATURA1
            Node nAsignatura1 = doc.createElement("asigantura1");//crea etiquetas <asignatura1>...</asignatura1>
            Node nAsignatura1_text = doc.createTextNode(asig1);//crea el nodo texto para la etiqueta <asignatura1>
            //añade el contenido de asignatura1 a las etiquetas <asigantura1>asigantura1</asigantura1>
            nAsignatura1.appendChild(nAsignatura1_text);

            //CREA Asignatura2
            Node nAsignatura2 = doc.createElement("asignatura2");
            Node nAsignatura2_text = doc.createTextNode(asig2);
            nAsignatura2.appendChild(nAsignatura2_text);

            //CREA Asignatura3
            Node nAsignatura3 = doc.createElement("asignatura3");
            Node nAsignatura3_text = doc.createTextNode(asig3);
            nAsignatura3.appendChild(nAsignatura3_text);

            //CREA HORAS
            Node nHoras = doc.createElement("horas");
            Node nHoras_text = doc.createTextNode(horas + "");
            nHoras.appendChild(nHoras_text);

            //CREA clase, con atributo y nodos Asignatura1, Asignatura2, Asignatura3 y horas 
            Node nClase = doc.createElement("clase");
            ((Element) nClase).setAttribute("nombre", nombre);
            nClase.appendChild(nAsignatura1);
            nClase.appendChild(nAsignatura2);
            nClase.appendChild(nAsignatura3);
            nClase.appendChild(nHoras);

            Node raiz = doc.getFirstChild();
            raiz.appendChild(nClase);
        } catch (DOMException e) {
            e.getMessage();
        }
    }

    //ELIMINA UN NODO SABIENDO el atributo DE LA clase
    public void eliminaNodo() {
        try {
        Scanner tc = new Scanner(System.in);
        System.out.print("¿QUE CLASE QUIERES BORRAR? TELL ME:");
        String clase = tc.nextLine();
        boolean claseEncontrada = false;

            Node nClase;
            NodeList nlClase = doc.getElementsByTagName("clase");

            for (int i = 0; i < nlClase.getLength(); i++) {
                nClase = nlClase.item(i);
                Element eNombre = (Element) nClase;
                String snombre = eNombre.getAttribute("nombre");
                if (snombre.equalsIgnoreCase(clase)) {
                    nClase.getParentNode().removeChild(nClase);
                    claseEncontrada = true;
                }
            }

            if (claseEncontrada) {
                System.out.println("HAS ELIMINADO EL NODO <clase> POR EL ATRIBUTO " + clase);
            } else {
                System.out.println("NO EXISTE ESE NOMBRE " + clase);
            }

        } catch (DOMException e) {
            e.printStackTrace();
        }
    }

    //GENERA UN NUEVO .xml CON LOS DATOS ACTUALIZADOS EN EL MISMO DIRECTORIO
    public void crearNuevoArchivo(String nuevoArchivo) {
        try {
            Source src = new DOMSource(doc); // Definimos el origen
            StreamResult rst = new StreamResult(new File(nuevoArchivo)); // Definimos el resultado
            // Declaramos el Transformer que tiene el método .transform() que necesitamos.
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            // Opción para indentar el archivo
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            transformer.transform(src, (javax.xml.transform.Result) rst);
            System.out.println("ARCHIVO NUEVO CON LOS DATOS ACTUALIZADOS HASTA EL MOMENTO - " + nuevoArchivo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //suma todas las horas, calcula la media y elimina el caracter 'H' 
    public void mediaHorasAsignaturas() {
        Node nHora;
        NodeList nlHoras = doc.getElementsByTagName("horasCurso");
        double suma = 0, media = 0;
        
        for(int i = 0; i < nlHoras.getLength(); i++) {
            nHora = nlHoras.item(i);
            String sHoras = nHora.getTextContent().replace("H", "");
            double dHoras = Double.parseDouble(sHoras);
            suma = suma + dHoras;
            media = suma / nlHoras.getLength();
            System.out.println(dHoras);
        }
        System.out.printf("\nLA MEDIA ES H%.1f" , media);
        System.out.println("");
    }
    
    
    //cambia el nombre de la asignatura1 por otro que quieras
    public void cambiarNombreAsignatura(String asig, String nuevaAsig) {
        Node nAsig1;
        NodeList nlAsig = doc.getElementsByTagName("asignatura1");
        boolean asigEncontrada = false;
        
        for (int i = 0; i < nlAsig.getLength(); i++) {
            nAsig1 = nlAsig.item(i);
            System.out.println(nAsig1.getTextContent());
            
            if (nAsig1.getTextContent().equalsIgnoreCase(asig)) {
                asigEncontrada = true;
                nAsig1.setTextContent(nuevaAsig);
            }
        }
        if (asigEncontrada) {
            System.out.println("SE HA CAMBIADO " + asig + " POR " +  nuevaAsig + ".");
        } else {
            System.out.println("NO SE HA ENCONTRADO LA ASIGNATURA " + asig + ".");
        }
    }
    
    //muestra la clase con el menor numero de horas, devuelve 1 si todo es correcto
    public int numeroMenorHoras() {
        Node nHoras;
        NodeList nlHoras = doc.getElementsByTagName("horasCurso");
        int horasMenor = Integer.MAX_VALUE;
        
        String nombre = "";
        
        for (int i = 0; i < nlHoras.getLength(); i++) {
            nHoras = nlHoras.item(i);
            int iHoras = Integer.parseInt(nHoras.getTextContent().replace("H", ""));
            
            Node parentNode = nHoras.getParentNode();
            
            if (iHoras < horasMenor) {
                horasMenor = iHoras;
                //saca el elemento
                nombre = ((Element) parentNode).getAttribute("nombre");
                System.out.println("EL CURSO " + nombre + " TIENE " + horasMenor);
                return 1;
            }
            
        }
        return 0;
    }
    
    //muestra el nombre del curso, el numero de horas y la asignatura2
    //por ejemplo escribir una e, muestra todo el contenido de Entorno de desarrollo
    public void buscadorAsignatura2(String buscar) {
        Node nHoras = null;
        NodeList nlHoras = doc.getElementsByTagName("horasCurso");
        Node nAsig2 = null;
        NodeList nlAsig2 = doc.getElementsByTagName("asignatura2");
        String nombre = "";
        boolean encontrado = false;
        
        for (int i = 0; i < nlHoras.getLength(); i++) {
            nHoras = nlHoras.item(i);
            nAsig2 = nlAsig2.item(i);
            String sAsig2 = nAsig2.getTextContent();
            Node parentNode = nAsig2.getParentNode();
            nombre = ((Element)parentNode).getAttribute("nombre");
            
            if (sAsig2.toLowerCase().contains(buscar.toLowerCase())) {
                encontrado = true;
                System.out.println("EL RESULTADO DE - " + buscar + " - ES :");
                System.out.println(nombre + " - " + nAsig2.getTextContent() + " - " + nHoras.getTextContent());
            }
        }
        if(encontrado) {
        } else {
            System.out.println("NO SE HA REALIZADO LA BUSQUEDA CON " + buscar);
        }
    }
    

}
