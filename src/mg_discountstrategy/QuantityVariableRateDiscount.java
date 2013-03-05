
package mg_discountstrategy;

/**
 * This class applies a minimum discount to the product if used.
 * There is a minimum qty needed for the discount to apply
 * @author mgrinker
 */
public class QuantityVariableRateDiscount implements DiscountStrategy {
    private double discountRate = 0.1;
    private int minQty = 5;

    public QuantityVariableRateDiscount() {
    }

    public QuantityVariableRateDiscount(double rate) {
        discountRate = rate;
    }

    public QuantityVariableRateDiscount(double rate, int minQty) {
        discountRate = rate;
        this.minQty = minQty;
    }

    
    @Override
    public final double getDiscountAmount(final int qty, final double unitCost) {
        // validation needed
        if(qty >= minQty){
        return discountRate * qty * unitCost;
        }
        else {
            return 0;
        }
        
    }

    @Override
    public final double getDiscountRate() {
        return discountRate;
    }

    @Override
    public final void setDiscountRate(double discountRate) {
        // validation needded
        this.discountRate = discountRate;
    }

    public final int getMinQty() {
        return minQty;
    }

    public final void setMinQty(final int minQty) {
        // validation needed
        this.minQty = minQty;
    }
    
//    public static void main(String[] args) {
//        QuantityVariableRateDiscount vrd = new QuantityVariableRateDiscount();
//        double discount = vrd.getDiscountAmount(5, 10);
//        System.out.println("Discount Amount: " + discount);
//    }
}

