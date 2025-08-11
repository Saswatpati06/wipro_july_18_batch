package Collections;

import java.util.*;

/*public class Student implements Comparable<Student>{
	
	// sort  a list for students by roll number (Asc Order)

		int rollNumber;
		String name;
		
		public Student (int rollNumber , String name)
		{
			this.rollNumber = rollNumber;
			this.name = name;
		}
		
		// Implement CompareTO method for natural ordering(by roll number)
	
		public int compareTo(Student s)
		{
			return this.rollNumber - s.rollNumber;
		}
		
		public String toString()
		{
			return  rollNumber + "_"  + name;
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			List<Student>students = new ArrayList<>();
			
			students.add(new Student (103, "Ravi"));
			students.add(new Student (101, "Amit"));
			students.add(new Student (102, "Zara"));
			
			Collections.sort(students);
			
			for (Student s :students)
			{
				System.out.println(s);
			}
			

	}

}*/

/*class Employee implements Comparable<Employee> {
  
    int empId;
    String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public String toString() {
        return empId + "_" + name;
    }
	public int compareTo(Employee o) {
		
		return 0;
	}
}

public class employees {
    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10, "Saswat"));
        employees.add(new Employee(5, "Pkd"));
        employees.add(new Employee(7, "Satya"));
        employees.add(new Employee(2, "Kavya"));

        Collections.sort(employees);
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}*/

public class Employees implements Comparable<Employees> {
	int empId;
	String Name;
	
	//Constructor of the class to pass the parameters
	public Employees(int empId, String Name) {
		
		this.empId=empId;
		this.Name=Name;
	}
	public int compareTo(Employees e) {
		
		 return this.Name.compareTo(e.Name);
	}
	
	
	public String toString() {
		return empId +" "+ Name;
	}
	
	
	//sort a list of Employeess by Alphabetical number (Ascending Order)

	public static void main(String[] args) {
		
		List<Employees> employeess=new ArrayList<>();
		
		employeess.add(new Employees(103,"Ravi"));
		employeess.add(new Employees(101,"Amit"));
		employeess.add(new Employees(102,"Zara"));
		
		Collections.sort(employeess);
		
		for(Employees e:employeess) {
			System.out.println(e);
		}

	}
}

