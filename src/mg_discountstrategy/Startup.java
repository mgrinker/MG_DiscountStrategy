
package mg_discountstrategy;

/**
 * This is the start up class that creates a new cash register object,
 * adds the items, and calls for the receipt.
 * @author mgrinker
 */
public class Startup {

   
    public static void main(String[] args) {

        
        CashRegister cr = new CashRegister();
        cr.startNewSale("300");
        cr.addItemToSale("A101", 4);
        cr.addItemToSale("C222", 2);
        cr.addItemToSale("B205", 5);
        cr.finalizeSale();
    }
}
