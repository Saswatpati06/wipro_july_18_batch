package Java_Labs_21_07;
import java.util.Scanner;

public class Max {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Take three numbers as input
	        System.out.print("Enter first number: ");
	        int a = input.nextInt();

	        System.out.print("Enter second number: ");
	        int b = input.nextInt();

	        System.out.print("Enter third number: ");
	        int c = input.nextInt();

	        int max;

	        if (a >= b && a >= c) {
	            max = a;
	        } else if (b >= a && b >= c) {
	            max = b;
	        } else {
	            max = c;
	        }

	        System.out.println("The maximum number is: " + max);

	        input.close();
	    }
	}
