
package mg_discountstrategy;
import java.text.DecimalFormat;
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
    
    // Create DecimalFormat object
    DecimalFormat dollar = new DecimalFormat("#,##0.00");
    private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    
    public void outputReceipt() {
        System.out.println(customer.getCustId());
        System.out.println(customer.getCustomerName());
        for(LineItem item : lineItems) {
            System.out.print(item.getProduct().getProdId() + "\t");
            System.out.print(item.getProduct().getProdName() + "\t");
            System.out.print(item.getProduct().getUnitCost() + "\t");
            System.out.print(item.getQty() + "\t");
            System.out.print("$" + dollar.format(item.getProduct().getDiscountAmount(item.getQty())) + "\t");
            System.out.println("$" + dollar.format(item.getOrigPriceSubtotal()));
            System.out.println("");
            
        }
            System.out.println("$" + dollar.format(getTotalBeforeDiscount()));
            System.out.println("$" + dollar.format(getTotalDiscount()));
            System.out.println("$" + dollar.format(getFinalTotal()));
        
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
    
    public double getFinalTotal() {
        double finalTotal = 0;
        finalTotal = getTotalBeforeDiscount() - getTotalDiscount();
        return finalTotal;
    }
    
    public static void main(String[] args) {
        Receipt r = new Receipt("100");
        r.addLineItem("A101", 2);
        r.addLineItem("B205", 5);
        System.out.println(r.customer.getCustId());
        System.out.println(r.customer.getCustomerName());
        r.outputReceipt();
        
    }
}
