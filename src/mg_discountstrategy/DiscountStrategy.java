
package mg_discountstrategy;

/**
 *
 * @author mgrinker
 */
public interface DiscountStrategy {

    public abstract double getDiscountAmount(int qty, double unitCost);

    public abstract double getDiscountRate();

    public abstract void setDiscountRate(double discountRate);
    
}
