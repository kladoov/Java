
package appsax;

import java.io.File;

/*@author alekk*/
public class AppSAX {

    public static void main(String[] args) {
        
        SAXAcess sax = new SAXAcess();
        File f = new File("App.xml");
        //sax.parsearXMLconLibrosSAXhandler(f);
        sax.parsearXMLconLibrosSAXhandler2(f);
        
        
        
        
        
    }
    
}
