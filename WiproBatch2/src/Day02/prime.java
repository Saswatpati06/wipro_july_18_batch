package Day02;

public class prime {
	
	public static boolean checkprime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int n=17, marks=70, day=2;
		//check prime
		String res=checkprime(n)?" is a Prime Number":" is not a prime Number";
		System.out.println(n+res);
		//check interger type
		if(n>0) System.out.println("Positive");
		else if(n<0) System.err.println("Negative");
		else System.out.println("Zero");
		//check even odd
		if(n%2==0) System.out.println("Number is Even");
		else System.out.println("Numbebr is Odd");
		//check grades
		String grade;
		if(marks>=90) grade="A";
		else if(marks>=75) grade="B";
		else if(marks>=60) grade="C";
		else if(marks>=40) grade="D";
		else grade="Fail";
		System.out.println(grade);
		//check day
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("Saturday");
			break;
		case 6:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid WeekDay");
		}
	}

}
