
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
    public LineItem[] getLineItems() {
        for(LineItem item : lineItems) {
            System.out.println(item.getProduct().getProdId());
            System.out.println(item.getProduct().getProdName());
            System.out.println(item.getProduct().getUnitCost());
            System.out.println(item.getQty());
            System.out.println(item.getProduct().getDiscountAmount(item.getQty()));
        }
        return lineItems;
    }
    
    public double getTotalBeforeDiscount() {
        double grandTotal = 0.0;
        for(LineItem item : lineItems) {
            grandTotal += item.getOrigPriceSubtotal();
        }
        return grandTotal;
    }
    
    public double getTotalDiscount() {
        double totalDiscount = 0;
        for(LineItem item : lineItems) {
            totalDiscount += item.getProduct().getDiscountAmount(item.getQty());
        }
        return totalDiscount;
    }
    
    public static void main(String[] args) {
        Receipt r = new Receipt("100");
        r.addLineItem("A101", 2);
        r.addLineItem("B205", 5);
        System.out.println(r.getLineItems());
        System.out.println(r.getTotalDiscount());
        System.out.println(r.getTotalBeforeDiscount());
    }
}
