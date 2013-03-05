
package mg_discountstrategy;

/**
 * This class applies a 0 discount to the product
 * @author Michael
 */
public class NoDiscount implements DiscountStrategy {
    private double discountRate;
    
    @Override
    public final double getDiscountAmount(int qty, double unitCost) {
        return 0;
    }

    @Override
    public final double getDiscountRate() {
        return discountRate;
    }

    @Override
    public final void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
}
