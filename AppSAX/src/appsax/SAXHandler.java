package appsax;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.*;

/*@author alekk*/
public class SAXHandler extends DefaultHandler {

    int contadorClase;

    public SAXHandler() {
        contadorClase = 0;
    }

    public void startDocument() {
        System.out.println("======LISTADO DE CLASES=======");
    }

    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        if (qName.equals("clase")) {
            contadorClase++;
            System.out.print("Nombre: " + atts.getValue(atts.getQName(0)));//
        } else if (qName.equals("asignatura1")) {
            System.out.print("\n" + "Asignatura1: ");
        } else if (qName.equals("asignatura2")) {
            System.out.print("\n" + "Asignatura2: ");
        } else if (qName.equals("asignatura3")) {
            System.out.print("\n" + "Asignatura3: ");
        } else if (qName.equals("horasCurso")) {
            System.out.print("\n" + "Horas del curso: ");
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("clase")) {
            System.out.println("\n---------------------------------");
        }
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        String car = new String(ch, start, length);
        car = car.replaceAll("\t", "");//quita todos los tabuladores
        car = car.replaceAll("\n", "");//quita todos los saltos de linea
        System.out.print(car);
    }

    public void endDocument() {
        System.out.println("HAY UN TOTAL DE " + contadorClase + " CLASES.");
    }

}
