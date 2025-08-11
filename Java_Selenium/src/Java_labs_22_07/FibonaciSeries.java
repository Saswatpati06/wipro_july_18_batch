package Java_labs_22_07;
import java.util.Scanner;

public class FibonaciSeries 
{
	    public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the number of terms in Fibonacci series: ");
	        int n = scanner.nextInt();

	      
	        int a = 0, b = 1;

	        System.out.print("Fibonacci Series up to " + n + " terms: ");

	       
	        for (int i = 1; i <= n; i++) {
	            System.out.print(a + " ");  

	            
	            int c = a + b;
	            a = b;
	            b = c;

	        }
	        scanner.close();
	    }
	}


