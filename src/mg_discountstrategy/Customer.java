
package mg_discountstrategy;

/**
 * This is the customer class where you can set and get the 
 * custId an custName
 * @author Michael
 */
public class Customer {
    private String custId;
    private String customerName;

    public Customer() {
    }

    public Customer(String customerId, String customerName) {
        this.custId = customerId;
        this.customerName = customerName;
    }

    public final String getCustId() {
        return custId;
    }

    public final void setCustId(final String custId) {
        // validation needed
        this.custId = custId;
    }

    public final String getCustomerName() {
        return customerName;
    }

    public final void setCustomerName(final String customerName) {
        this.customerName = customerName;
    }  
}
