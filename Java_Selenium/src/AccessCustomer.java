import Customers.Customer;
public class AccessCustomer extends Customer {

    // Constructor
    public AccessCustomer(String name, int id, String dept) {
        super(name, id, dept);
    }

    public static void main(String[] args) {
        AccessCustomer cust = new AccessCustomer("Saswat", 751, "Retail Dep.");

        // Access protected members via public method
        cust.displayCustomerInfo();

        // Direct access to protected member in subclass
        System.out.println("Accessing protected name: " + cust.customerName);
    }
}
