
package mg_discountstrategy;

/**
 * This is an interface that is used to define the various types
 * of discounts
 * @author mgrinker
 */
public interface DiscountStrategy {

    public abstract double getDiscountAmount(int qty, double unitCost);

    public abstract double getDiscountRate();

    public abstract void setDiscountRate(double discountRate);
    
}
