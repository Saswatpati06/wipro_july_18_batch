package Package1;


public class SamePackageSubclass extends Class1 {
	
	public void read()
	{
		System.out.println("Reading in sub class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SamePackageSubclass obj = new SamePackageSubclass();
		
		obj.display(); // inherited
		obj.read(); // own method
		obj.fetchemployeeId();
		obj.empName();
	}

}
