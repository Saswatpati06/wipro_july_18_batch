package Java_labs_23_07;


	class Employee {
	    public void work() {
	        System.out.println("Employee is working");
	    }

	    public double getSalary() {
	        return 50000.0;
	    }
	}

	class HRManager extends Employee {
	    @Override
	    public void work() {
	        System.out.println("HR Manager is managing employees");
	    }

	    public void addEmployee() {
	        System.out.println("Adding a new employee");
	    }
	}

	public class EmployeeWork {
	    public static void main(String[] args) {
	        HRManager hr = new HRManager();
	        hr.work();
	        System.out.println("Salary: " + hr.getSalary());
	        hr.addEmployee();
	    }
	}


