
package mg_discountstrategy;

/**
 * This is the main class that delegates the work down to the other classes
 * through the receipt class
 * @author Michael
 */
public class CashRegister {
    private Receipt receipt;
    
    /**
     * This method starts the new sale by passing in the customerId and 
     * starting the receipt
     * @param custId
     */
    public final void startNewSale(String custId) {
        receipt = new Receipt(custId);
    }
    
    /**
     * This method takes the prodId and qty that is entered and passes the info
     * to the receipt class to create a new line item
     * @param prodId
     * @param qty 
     */
    public final void addItemToSale(String prodId, int qty) {
        receipt.addLineItem(prodId, qty);        
    }
    
    /**
     * This method calls on the receipt class to finalize and output the receipt
     */
    public final void finalizeSale() {
        receipt.outputReceipt();
    }
    
    
    
//    public static void main(String[] args) {
//        CashRegister cr = new CashRegister();
//        cr.startNewSale("200");
//        cr.addItemToSale("A101", 5);
//        cr.finalizeSale();
//    }
}


    