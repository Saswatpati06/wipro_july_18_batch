package Collections;
import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a1 = new ArrayList<String>();
		
		//insertion of data
		
		a1.add("Ravi");
		a1.add("John");
		a1.add("Tina");
		a1.add("Peter");
		a1.add("Sanjay");
		a1.add("Rima");
		a1.add(null);
		
		System.out.println(a1);
		System.out.println(a1.get(2));
		System.out.println(a1.indexOf("Peter"));
		System.out.println(a1.isEmpty());
		System.out.println(a1.remove(4));
		System.out.println(a1);
		System.out.println(a1.set(4, "King"));
		System.out.println(a1);
		System.out.println(a1.size());
		
		

	}

}
