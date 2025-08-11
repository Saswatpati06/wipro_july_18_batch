package Java_all_days_program;

public class GC {
	// null reference 
	
	// reassigining the reference
	
	// object is out of scope
	
	public void finalize() {
		System.out.println("Object garbage collected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GC obj = new GC();
		
		// BY NULLING THE REFERENCE
		
		obj = null;
		
		// BY ASSIGNING A REFERENCE TO ANOTHER OBJECT
		
		GC obj1 = new GC();
		
		GC obj2= new GC();
		
		obj1 = obj2;
		 
		System.gc();
		Runtime.getRuntime().gc();	

	}

}
