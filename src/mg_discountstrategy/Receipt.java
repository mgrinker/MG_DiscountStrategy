
package mg_discountstrategy;

/**
 *
 * @author Michael
 */
public class Receipt {
    private Customer customer;
     private FakeDatabase db;   
    private LineItem[] lineItems;

    public Receipt(String custId) {
        db = new FakeDatabase();
        customer = db.findCustomer(custId);
        lineItems = new LineItem[0];
    }
    
    
    
    public void addLineItem(String prodId, int qty) {
        LineItem item = new LineItem(prodId, qty);
        addToArray(item);
    }
    
    private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    
    public double getTotalBeforeDiscount() {
        double grandTotal = 0.0;
        for(LineItem item : lineItems) {
            grandTotal += item.getOrigPriceSubtotal();
        }
        return grandTotal;
    }
    
}
