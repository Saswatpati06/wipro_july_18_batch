package Java_all_days_program;


	class Addition {

	    
	    public int add(int a, int b) {
	        return a + b;
	    }

	    
	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }

        
	    public double add(double a, double b) {
	        return a + b;
	    }
	}

	public class MethodOverloading 
 {
	    public static void main(String[] args) {
	        Addition addition = new Addition();

	        System.out.println("Addition of 5 and 10: " + addition.add(5, 10));
	        System.out.println("Addition of 5, 10 and 15: " + addition.add(5, 10, 15));
	        System.out.println("Addition of 5.5 and 4.5: " + addition.add(5.5, 4.5));
	    }
	}

