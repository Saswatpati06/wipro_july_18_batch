package Java_labs_23_07;

public class SumOfArray 
{
	    public static void main(String[] args) {
	        int[] numbers = {5, 10, 15, 20, 25}; 
	        int sum = 0;

	        for (int i = 0; i < numbers.length; i++) {
	            sum = sum + numbers[i];
	        }
	        
	        System.out.println("Sum of array elements: " + sum);
	    }
	}


