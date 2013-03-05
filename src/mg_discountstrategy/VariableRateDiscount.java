
package mg_discountstrategy;

/**
 * This class applies a variable rate discount to the product if used
 * @author mgrinker
 */
public class VariableRateDiscount implements DiscountStrategy {
    private double discountRate = 0.1;

    public VariableRateDiscount() {
    }
    
    public VariableRateDiscount(double rate) {
        discountRate = rate;
    }

    
    @Override
    public final double getDiscountAmount(int qty, double unitCost) {
        // validation needed
        return discountRate * qty * unitCost;
    }

    @Override
    public final double getDiscountRate() {
        return discountRate;
    }

    @Override
    public final void setDiscountRate(double discountRate) {
        //validation needed
        this.discountRate = discountRate;
    }
    
//    public static void main(String[] args) {
//        VariableRateDiscount vrd = new VariableRateDiscount();
//        double discount = vrd.getDiscountAmount(5, 10);
//        System.out.println("Discount Amount: " + discount);
//    }
}

