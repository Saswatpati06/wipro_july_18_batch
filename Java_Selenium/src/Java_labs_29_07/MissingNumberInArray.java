package Java_labs_29_07;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };

		int sum1 = 0;

		for (int i = 0; i < arr.length; i++)
		{
			sum1 = sum1 + arr[i];
		}
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) 
		{
			sum2 = sum2 + i;
		}
		System.out.println("Missing number in Array: " + (sum2 - sum1));

		}

	}


