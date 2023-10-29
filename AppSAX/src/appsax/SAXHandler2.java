package appsax;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.*;

/*@author alekk*/
public class SAXHandler2 extends DefaultHandler {

    boolean encontrado;
    String etiqueta;

    public SAXHandler2() {
        encontrado = false;
        etiqueta = "";
    }

    public void startDocument() {
        System.out.println("======CLASE FILTRADA=======");
    }

    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        if (qName.equals("clase")) {
            etiqueta = "clase";
            String clase = atts.getValue(0);
            encontrado = "2DAM".equalsIgnoreCase(clase);
        } else if (qName.equals("asignatura1")) {
            etiqueta = "asignatura1";
        } else if (qName.equals("asignatura2")) {
            etiqueta = "asignatura2";
        } else if (qName.equals("asignatura3")) {
            etiqueta = "asignatura3";
        } else if (qName.equals("horasCurso")) {
            etiqueta = "horasCurso";
        }
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        String car = new String(ch, start, length);
        car = car.replaceAll("\t", "");//quita todos los tabuladores
        car = car.replaceAll("\n", "");//quita todos los saltos de linea

        if (etiqueta.equals("clase") && encontrado) {
            System.out.println(car);
        } else if (etiqueta.equals("asignatura1") && encontrado) {
            System.out.println(car);
        } else if (etiqueta.equals("horasCurso") && encontrado) {
            System.out.println(car);
        }
    }

    public void endDocument() {
    }

}
