
package mg_discountstrategy;

/**
 *
 * @author Michael
 */
public class CashRegister {
    private Receipt receipt;
    
    public void startNewSale(String custId) {
        receipt = new Receipt(custId);
    }
    
    public void addItemToSale(String prodId, int qty) {
        receipt.addLineItem(prodId, qty);        
    }
    
    public void finalizeSale() {
        receipt.outputReceipt();
    }
    
    
    
    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
        cr.startNewSale("200");
        cr.addItemToSale("A101", 5);
        cr.finalizeSale();
    }
}


    