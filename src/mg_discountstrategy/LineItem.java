
package mg_discountstrategy;

/**
 *
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
   
   public double getOrigPriceSubtotal() {
       return product.getUnitCost() * qty;
   }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
   
  
    public static void main(String[] args) {
        LineItem item = new LineItem("B205", 2);
        System.out.println("sub" + item.getOrigPriceSubtotal());     
    }
    
}
