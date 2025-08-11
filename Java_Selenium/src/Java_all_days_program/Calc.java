package Java_all_days_program;

public class Calc {
	
	   
	    public int add(int a, int b) {
	        int result = a + b;
	        return result;
	    }

	    public static void main(String[] args) {
	        Calc calc = new Calc();
	        int sum = calc.add(10, 5); 
	        System.out.println("The sum is: " + sum);
	    }
	}



