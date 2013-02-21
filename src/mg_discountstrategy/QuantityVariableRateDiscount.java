
package mg_discountstrategy;

/**
 *
 * @author mgrinker
 */
public class QuantityVariableRateDiscount implements DiscountStrategy {
    private double discountRate = 0.1;
    private int minQty;

    public QuantityVariableRateDiscount() {
    }
    
    public QuantityVariableRateDiscount(double rate, int minQty) {
        discountRate = rate;
        this.minQty = minQty;
    }

    
    @Override
    public double getDiscountAmount(int qty, double unitCost) {
        if(qty >= minQty){
        return discountRate * qty * unitCost;
        }
        else {
            return 0;
        }
        
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

