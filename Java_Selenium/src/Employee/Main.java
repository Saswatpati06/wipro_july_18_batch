package Employee;

public class Main {
    public static void main(String[] args) {
        
        Employees permanent = new PermanentEmployee("Saswat Pati", 204101, 50000);
        permanent.displayDetails();
        System.out.println("Monthly Salary: " + permanent.calculateSalary());

        System.out.println();

        
        Employees contract = new ContractEmployee("Liku", 102, 800, 20);
        contract.displayDetails();
        System.out.println("Calculated Salary: " + contract.calculateSalary());
    }
}
