package Package1;

public class Class1 {
	
	// private variable
	private static String employeeSalary = "5666787";
	
	//private method
	private void fetchsalary()
	{
		System.out.println("The employe salary is:"+employeeSalary);
	}
	
	//public method
	public void display()
	{
		System.out.println("Displaying the data");
	}
	
	
	//default variable
	int employeeId = 7787;
	
	//default method
	void fetchemployeeId()
	{
		System.out.println("The employee id is :" + employeeId);
	}
	String employeeName ="Saswat";
	
	protected void empName() {
		System.out.println("Emp name:" +employeeName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class1 obj = new Class1();
		obj.display();
		obj.fetchsalary();
		obj.fetchemployeeId();
		obj.empName();
	}

}
