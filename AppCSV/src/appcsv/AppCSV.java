
package appcsv;

/*@author alekk*/
public class AppCSV {

    public static void main(String[] args) {
        
        Fruteria frt = new Fruteria();
        frt.viewFruteria();
        
        System.out.println("-----------------------------");
        frt.readNombreFruta();
        
        System.out.println("-----------------------------");
        frt.sumStockFrutas();
        
        System.out.println("-----------------------------");
        frt.whitoutStock();
        
        System.out.println("-----------------------------");
        frt.searchFruta("manzana");
        
        System.out.println("------------------------------");
        frt.incrementPriceperKg();
        
    }
    
}
