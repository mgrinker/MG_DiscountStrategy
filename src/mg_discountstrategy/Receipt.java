
package mg_discountstrategy;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Michael
 */
public class Receipt {
    private Customer customer;
    private FakeDatabase db;   
    private LineItem[] lineItems;
    private Date receiptDate;

    public Receipt(String custId) {
        db = new FakeDatabase();
        customer = db.findCustomer(custId);
        lineItems = new LineItem[0];
    }
    
    
    
    public final void addLineItem(final String prodId, final int qty) {
        LineItem item = new LineItem(prodId, qty);
        addToArray(item);
    }
    
    // Create DecimalFormat object
    DecimalFormat dollar = new DecimalFormat("#,##0.00");
    
    public String getReceiptDate() {
        receiptDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm a");
        return sdf.format(receiptDate);
    }
    
    private void addToArray(final LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    
    public final void outputReceipt() {
        System.out.println("Customer ID: " + customer.getCustId());
        System.out.println("Customer name: " + customer.getCustomerName());
        System.out.println("Date: " + getReceiptDate());
        System.out.println("");
        System.out.println("ID\t" + "Name\t\t\t" + "Cost\t" + "Qty\t" + "Discount\t"
                + "Total");
        System.out.println("---------------------------------------------------"
                + "---------------------");
        for(LineItem item : lineItems) {
            System.out.print(item.getProduct().getProdId() + "\t");
            System.out.print(item.getProduct().getProdName() + "\t\t");
            System.out.print("$" + item.getProduct().getUnitCost() + "\t");
            System.out.print(item.getQty() + "\t");
            System.out.print("$" + 
                    dollar.format(item.getProduct()
                    .getDiscountAmount(item.getQty())) + "\t\t");
            System.out.println("$" + dollar.format(item.getOrigPriceSubtotal()));
            System.out.println("");  
        }
            System.out.println("Subtotal $" + dollar.format(getTotalBeforeDiscount()));
            System.out.println("You save $" + dollar.format(getTotalDiscount()));
            System.out.println("Total Due $" + dollar.format(getFinalTotal()));
        
    }
    
    public final double getTotalBeforeDiscount() {
        double grandTotal = 0.0;
        for(LineItem item : lineItems) {
            grandTotal += item.getOrigPriceSubtotal();
        }
        return grandTotal;
    }
    
    public final double getTotalDiscount() {
        double totalDiscount = 0;
        for(LineItem item : lineItems) {
            totalDiscount += item.getProduct().getDiscountAmount(item.getQty());
        }
        return totalDiscount;
    }
    
    public final double getFinalTotal() {
        double finalTotal = 0;
        finalTotal = getTotalBeforeDiscount() - getTotalDiscount();
        return finalTotal;
    }
    
//    public static void main(String[] args) {
//        Receipt r = new Receipt("100");
//        r.addLineItem("A101", 2);
//        r.addLineItem("B205", 5);
//        System.out.println(r.customer.getCustId());
//        System.out.println(r.customer.getCustomerName());
//        r.outputReceipt();
//        
//    }
}
