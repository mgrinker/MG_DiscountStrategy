
package mg_discountstrategy;

/**
 *
 * @author Michael
 */
public class NoDiscount implements DiscountStrategy {
    private double discountRate;
    
    @Override
    public double getDiscountAmount(int qty, double unitCost) {
        return 0;
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
}
