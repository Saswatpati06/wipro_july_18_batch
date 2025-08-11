package IOCharStreams;

import java.util.Scanner;

public class ReadingFromKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the first name");
		
		int a = scn.nextInt();
		
		System.out.println("Enter the second number");
		
		int b = scn.nextInt();
		
		System.out.println(""+ (a+b));
		scn.close();

	}

}
