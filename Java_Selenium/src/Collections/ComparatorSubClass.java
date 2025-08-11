package Collections;

import java.util.*;

/* public class ComparatorSubClass implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
    	
    	return e1.name.compareTo(e2.name);
    }
	public static void main(String[] args) {
		
		List<Employee> employees=new ArrayList<>();		
		
		employees.add(new Employee(103,"Ravi"));
		employees.add(new Employee(101,"Amit"));
		employees.add(new Employee(102,"Zara"));
		employees.add(new Employee(102,"Zara"));
		employees.add(new Employee(103,"Ravi"));
		employees.add(new Employee(104,"john"));
		
		Collections.sort(employees,new ComparatorSubClass());
		
		for(Employee e: employees) {
			System.out.println(e);
		}

	} 

}*/

public class ComparatorSubClass implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
     
        return Double.compare(e2.salary, e1.salary);
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(103, "Ravi", 54000.75));
        employees.add(new Employee(101, "Amit", 75000.00));
        employees.add(new Employee(102, "Zara", 67000.25));
        employees.add(new Employee(104, "John", 47000.20));
        employees.add(new Employee(105, "Anu", 86000.50));

        Collections.sort(employees, new ComparatorSubClass());

        System.out.println("Employees sorted by salary (descending):");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
