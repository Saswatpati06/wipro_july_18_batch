package Java_all_days_program;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// code where the application logic is residing
		try {
           

            int a = 100;
            int b = 100 / 0; // Throws ArithmeticException
            int c = a / b;
            System.out.println(c);

        } catch (ArithmeticException ae) {
            System.out.println("Caught ArithmeticException: " + ae);
        }  catch (Exception e) {
            System.out.println("Caught general Exception: " + e);
        }

}
}
