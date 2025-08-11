package Java_labs_25_1_07;

public class Employee {
    
    private String name;
    private int id;
    private double salary;

  
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        setSalary(salary); 
    }

  
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary for ID " + id + ". Salary must be positive.");
            this.salary = 0; 
        }
    }

   
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

 
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name       : " + name);
        System.out.println("Salary     : " + salary);
       
    }

    
    public static void main(String[] args) {
       
        Employee emp1 = new Employee("Saswat", 123, 155000);
        Employee emp2 = new Employee("Liku", 345, -12500);   // Invalid salary
        Employee emp3 = new Employee("Likun", 678, 78600);

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}

