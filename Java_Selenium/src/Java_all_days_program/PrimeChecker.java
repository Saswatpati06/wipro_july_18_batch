package Java_all_days_program;

 public class PrimeChecker 
{
	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false; 
	        }

	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }

	        return true; 
	    }

	    public static void main(String[] args) {
	        int num = 41; 
	        if (isPrime(num)) 
	        {
	            System.out.println(num + " is a prime number.");
	        } else {
	            System.out.println(num + " is NOT a prime number.");
	        }
	    }
}


