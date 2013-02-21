
package mg_discountstrategy;

/**
 *
 * @author mgrinker
 */
public interface DiscountStrategy {

    double getDiscountAmount(int qty, double unitCost);

    double getDiscountRate();

    void setDiscountRate(double discountRate);
    
}
