package Java_all_days_program;

public class InterfaceChild implements interface1 {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying in child class");
		
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("Reading in child class");
		
	}
	
	public static void main (String[] args)
	{
		InterfaceChild obj = new InterfaceChild();
		obj.display();
		interface1.write();
		obj.read();
		System.out.println(employeename);
		System.out.println(employeeId);
	}
	
}
