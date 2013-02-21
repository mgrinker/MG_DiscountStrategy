
package mg_discountstrategy;

/**
 *
 * @author mgrinker
 */
public class VariableRateDiscount {
    private double discountRate = 0.1;

    public VariableRateDiscount() {
    }
    
    public VariableRateDiscount(double rate) {
        discountRate = rate;
    }

    
    public double getDiscountAmount(int qty, double unitCost) {
        
        return discountRate * qty * unitCost;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
    public static void main(String[] args) {
        VariableRateDiscount vrd = new VariableRateDiscount();
        double discount = vrd.getDiscountAmount(5, 10);
        System.out.println("Discount Amount: " + discount);
    }
}

