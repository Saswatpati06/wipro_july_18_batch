package Java_labs_29_07;

public class WithoutUsingLoop
{
	public static void main(String[] args) 
	{
		printnum(1);

	}

	public static void printnum(int num)
	{
		if (num <= 100)
		{
			System.out.println(num);
			num++;
			printnum(num);

		}

	}

}

