
package mg_discountstrategy;

/**
 *
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
