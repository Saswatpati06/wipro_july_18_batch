package Java_all_days_program;

public class StaticVariable {

		// TODO Auto-generated method stub
		public static String studentName = "Jaya";
		
		public  String college = "SOA University";
		
		public static int studid = 787;
		
		public static void main(String[] args)
		{
			System.out.println(studentName);
			System.out.println(studid);
			
			StaticVariable sv = new StaticVariable();
			System.out.println(sv.college);
			
			
		}

}
