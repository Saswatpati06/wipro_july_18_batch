package Java_Labs_21_07;
import java.util.Scanner;
public class WhileLoop {
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	     
	        System.out.print("Enter a number N: ");
	        int N = scanner.nextInt();
	        
	        
	        int sum = 0;
	        int i = 1;
	        
	        
	        while (i <= N) {
	            sum += i;  
	            i++;       
	        }
	        
	        // Print the result
	        System.out.println("Sum of first " + N + " natural numbers is: " + sum);
	        
	        // Close the scanner
	        scanner.close();
	    }
	}


