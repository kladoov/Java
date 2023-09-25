package xmldom;

import java.io.File;

/*@author alekk*/
public class XmlDOM {

    public static void main(String[] args) {
        AccesoDOM ad = new AccesoDOM();
        File f = new File("Libros.xml");
        ad.abriXMLaDOM(f);

        System.out.println("");
        ad.insertarLibroEnDOM("Caperucita", "Aleksandr", "2003");

        System.out.println("");
        //ad.deleteNode("Caperucita");

        System.out.println("");
        ad.recorreDOMyMuestra();
        
        System.out.println("");
        ad.guardarDOMcomoArchivo("AyendiDeLaVara");
    }
}
