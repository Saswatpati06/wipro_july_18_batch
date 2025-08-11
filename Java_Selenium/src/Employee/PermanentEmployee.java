package Employee;

public class PermanentEmployee extends Employees {
    private double monthlySalary;

    public PermanentEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }
}