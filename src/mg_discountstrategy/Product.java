
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
    
    public double getDiscountAmount(int qty) {
        return discount.getDiscountAmount(qty, unitCost);
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    
    public static void main(String[] args) {
        Product product = new Product("A101", "Hat", 15.00, new QuantityVariableRateDiscount());
        System.out.println("Discount Amount: " + product.getDiscountAmount(3));
        
    }
    
}
