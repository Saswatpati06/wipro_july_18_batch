import Company.Employee;
public class AccessEmployee extends Employee {

    // Constructor
    public AccessEmployee(String name, int id, String dept) {
        super(name, id, dept);
    }

    public static void main(String[] args) {
        AccessEmployee emp = new AccessEmployee("Saswat Pati", 204101, "Trainee");

        // Access protected members via subclass
        emp.displayInfo();

        // Direct access to protected member
        System.out.println("Accessing protected name: " + emp.employeeName);
    }
}
