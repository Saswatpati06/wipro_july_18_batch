package Java_all_days_program;

public class ContinueStatement {
	    public static void main(String[] args) {
	        System.out.println("numbers from 1 to 10:");

	        // Loop through numbers from 1 to 10
	        for (int i = 1; i <= 10; i++) {
	            // If the number is even, skip the rest of the loop using continue
	            if (i == 5) {
	                continue;
	            }
	            // Print the odd number
	            System.out.println(i);
	        }
	    }
	}

