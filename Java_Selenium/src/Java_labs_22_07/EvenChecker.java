package Java_labs_22_07;
import java.util.Scanner;
public class EvenChecker 
{
	    
	    public static boolean isEven(int number) {
	        return number % 2 == 0;
	    }

	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();

	        if (isEven(num)) {
	            System.out.println(num + " is even.");
	        } else {
	            System.out.println(num + " is odd.");
	        }

	        scanner.close();
	    }
	}


