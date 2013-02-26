
package mg_discountstrategy;

/**
 *
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

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    
    
}
