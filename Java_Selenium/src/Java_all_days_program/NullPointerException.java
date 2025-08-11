package Java_all_days_program;

public class NullPointerException {

	public static void main(String[] args) {
		try {	
			
			String s1 = null;
			System.out.println(s1.length());

		} catch(Exception e) {
			
			//print the trace of the exception
			System.out.println(e);
		}
		
		finally {
			
			// closing of the browsers
			// closing of the db connection
			// scanner classes closing
			//api connection closing
			System.out.println("This is a mandated code");
		}


	}

}
