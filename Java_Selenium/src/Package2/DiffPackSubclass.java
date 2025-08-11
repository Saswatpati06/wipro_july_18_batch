package Package2;
import Package1.Class1;

public class DiffPackSubclass extends Class1 {
	
	public void create()
	{
		System.out.println("Reading in sub class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DiffPackSubclass obj = new DiffPackSubclass();
		
		obj.create();
		obj.display();
		obj.empName();

	}

}
