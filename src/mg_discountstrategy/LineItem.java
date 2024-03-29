
package mg_discountstrategy;

/**
 * This lineItem class get passed the prodId and qty.  It looks up the product
 * in the fake database.  It also calculates the total cost of an item
 * before discount
 * @author Michael
 */
public class LineItem {
    private Product product;
    private int qty;
    private FakeDatabase db;

    public LineItem(String prodId, int qty) {
         db = new FakeDatabase();
        this.product = db.findProduct(prodId);
        this.qty = qty;
    }
   
   public final double getOrigPriceSubtotal() {
       return product.getUnitCost() * qty;
   }

    public final Product getProduct() {
        return product;
    }

    public final void setProduct(final Product product) {
        //validation needed
        this.product = product;
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(final int qty) {
        this.qty = qty;
    }
   
  
//    public static void main(String[] args) {
//        LineItem item = new LineItem("B205", 2);
//        System.out.println("sub" + item.getOrigPriceSubtotal());     
//    }
    
}
