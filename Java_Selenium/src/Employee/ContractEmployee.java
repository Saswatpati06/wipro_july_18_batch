package Employee;

public class ContractEmployee extends Employees {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

   
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
