package Java_labs_22_07;
import java.util.Scanner;

public class DivisibleBy5and11 
{

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5.");
        } else if (number % 7 == 0) {
            System.out.println(number + " is divisible by 7.");
        } else {
            System.out.println(number + " is neither divisible by 5 nor 7.");
        }

        scanner.close();
    }
}

	
