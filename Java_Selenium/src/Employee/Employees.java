package Employee;

public abstract class Employees {
	protected String name;
    protected int id;

    // Constructor
    public Employees(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Display method
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}