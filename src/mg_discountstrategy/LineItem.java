
package mg_discountstrategy;

/**
 *
 * @author Michael
 */
public class LineItem {
    private Product product;
    private Receipt receipt;
    private int qty;

    public LineItem() {
    }

    public LineItem(Product product, int qty) {
        this.product = product;
        this.qty = qty;
    }
    
    
    
   public void addItemToSale(String prodId, int qty) {
		FakeDatabase db =  new FakeDatabase();
        Product product = db.findProduct(prodId);
        
		// if found, add the lineItem to the receipt
		// but it's the receipt's job to do this!
        if(product != null) {
            receipt.addLineItem(product, qty);
        }  
    }
   
   public double getOrigPriceSubtotal() {
       return product.getUnitCost() * qty;
   }
   
}
