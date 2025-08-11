package Customers;

public class Customer 
{
	// Protected data members
    protected String customerName;
    protected int customerId;
    protected String customerDepartment;

    // Constructor
    public Customer(String name, int id, String dept) {
        this.customerName = name;
        this.customerId = id;
        this.customerDepartment = dept;
    }

    // Public method to display details
    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Department: " + customerDepartment);
    }
}
