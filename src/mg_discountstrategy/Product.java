
package mg_discountstrategy;

/**
 *
 * @author mgrinker
 */
public class Product {
    private String prodId;
    private String prodName;
    private double unitCost;
    private DiscountStrategy discount;

    public Product() {
    }

    public Product(String prodId, String prodName, double unitCost, 
            DiscountStrategy discount) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.unitCost = unitCost;
        this.discount = discount;
    }
    
    public final double getDiscountAmount(int qty) {
        return discount.getDiscountAmount(qty, unitCost);
    }

    public final String getProdId() {
        return prodId;
    }

    public final void setProdId(final String prodId) {
        this.prodId = prodId;
    }

    public final String getProdName() {
        return prodName;
    }

    public final void setProdName(final String prodName) {
        this.prodName = prodName;
    }

    public final double getUnitCost() {
        return unitCost;
    }

    public final void setUnitCost(final double unitCost) {
        this.unitCost = unitCost;
    }

    public final DiscountStrategy getDiscount() {
        return discount;
    }

    public final void setDiscount(final DiscountStrategy discount) {
        this.discount = discount;
    }
    
//    public static void main(String[] args) {
//        Product product = new Product("A101", "Hat", 15.00, new QuantityVariableRateDiscount());
//        System.out.println("Discount Amount: " + product.getDiscountAmount(3));
//        
//    }
    
}
