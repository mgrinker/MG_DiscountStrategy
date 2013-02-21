
package mg_discountstrategy;

/**
 *
 * @author mgrinker
 */
public class QuantityVariableRateDiscount implements DiscountStrategy {
    private double discountRate = 0.1;

    public QuantityVariableRateDiscount() {
    }
    
    public QuantityVariableRateDiscount(double rate) {
        discountRate = rate;
    }

    
    @Override
    public double getDiscountAmount(int qty, double unitCost) {
        
        return discountRate * qty * unitCost;
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
    public static void main(String[] args) {
        QuantityVariableRateDiscount vrd = new QuantityVariableRateDiscount();
        double discount = vrd.getDiscountAmount(5, 10);
        System.out.println("Discount Amount: " + discount);
    }
}

