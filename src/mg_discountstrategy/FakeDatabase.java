
package mg_discountstrategy;

/**
 *
 * @author Michael
 */
public class FakeDatabase {
    private Customer[] customers = {
	        new Customer("100", "John Smith"),
	        new Customer("200", "Sally Jones"),
	        new Customer("300", "Bob Clementi")
	    };

        // Notice we assign a default discount strategy component object to each product
	    Product[] products = {
	        new Product("A101", "Baseball Hat", 19.95, new VariableRateDiscount(0.15)),
	        new Product("B205", "Men's Dress Shirt", 35.50, new QuantityVariableRateDiscount(.10,5)),
	        new Product("C222", "Women's Socks", 9.50, new NoDiscount())
	    };
}
