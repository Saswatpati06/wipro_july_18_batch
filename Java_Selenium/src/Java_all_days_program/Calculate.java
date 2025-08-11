package Java_all_days_program;

public class Calculate {

	    public void add(int a, int b) {
	        System.out.println("Addition: " + (a + b));
	    }

	    public void subtract(int a, int b) {
	        System.out.println("Subtraction: " + (a - b));
	    }

	   
	    public void multiply(int a, int b) {
	        System.out.println("Multiplication: " + (a * b));
	    }

	    
	    public void divide(int a, int b) {
	        
	            System.out.println("Division: " + (a / b));
	       
	         
	    }

	    public static void main(String[] args) {
	      
	        Calculate calc = new Calculate();
	       
	        calc.add(5, 13);
	        calc.subtract(5, 2);
	        calc.multiply(7, 3);
	        calc.divide(9, 3);
	    }
	}