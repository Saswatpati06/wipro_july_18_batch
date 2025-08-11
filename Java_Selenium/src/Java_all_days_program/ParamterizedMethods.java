package Java_all_days_program;

public class ParamterizedMethods {
	// normal method with hard coded data
	public void add() {
		int a =7;
		int b = 8;
		int c = a + b;
		System.out.println(c);
	}
        // methods with parameters
		public void add(int a, int b)
		{
			int c = a + b;
			System.out.println(c);
		}
			
		
	
		
		public static void main(String[] args)
		{
			ParamterizedMethods  lv = new ParamterizedMethods();
			 
			lv.add(7,8);
			lv.add(9,5);
			lv.add(-1,-2);
		}

	}
