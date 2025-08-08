package labsessions.Day04;

abstract class Employee {
	abstract void calculateSalary();
	public String EmployeeName;
	public final int EmployeeId;
	Employee(String name,int id){
		this.EmployeeName = name;
		this.EmployeeId = id;
	}
}
