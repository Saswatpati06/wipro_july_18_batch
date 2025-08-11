package Collections;


/*public class Employee {
	
	int id;
	String name;
	
 Employee(int id,String name) {
		
		this.id=id;
		this.name=name;
	}
 
 public String toString() {
	 return id+"_"+name;
	 
 }

}*/



class Employee {
    int empId;
    String name;
    double salary;


    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return empId + "_" + name + "_" + salary;
    }
}
