package Company;

public class Employee 
{
	// Protected data members
    protected String employeeName;
    protected int employeeId;
    protected String employeeDepartment;

    // Constructor
    public Employee(String name, int id, String department) {
        this.employeeName = name;
        this.employeeId = id;
        this.employeeDepartment = department;
    }

    // Public method to display details
    public void displayInfo() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Department: " + employeeDepartment);
    }
}
