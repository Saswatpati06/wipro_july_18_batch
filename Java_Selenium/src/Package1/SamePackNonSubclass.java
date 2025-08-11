package Package1;

public class SamePackNonSubclass  {
	
	public void write()
	{
		System.out.println("Writing in sub class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class1 obj = new Class1();
		SamePackNonSubclass obj1 =new SamePackNonSubclass();
		
		obj1.write(); // own method
		obj.display();  // inherited
		obj.fetchemployeeId();
		obj.empName();
	}

}
