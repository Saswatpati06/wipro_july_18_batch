package Collections;

import java.util.Set;
import java.util.TreeSet;

public class Setseg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//contains no duplicate elements.
		
		//  no  null values
		
		//not synchronized
		
		//data is displayed in ascending order
		
		//
		
		/*Set<String> st = new TreeSet<String>();
		
		st.add("Orange");
		st.add("Banana");
		st.add("Grapes");
		st.add("Apple");
		st.add("Pine apple");
		st.add("null");
		System.out.println(st);
		System.out.println(st.isEmpty());
		System.out.println(st.remove("Grapes"));
		System.out.println(st);
		System.out.println(st.add("Lichi"));
		System.out.println(st);
		System.out.println(st.size());*/
		
		TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(20);
        numbers.add(70);
        numbers.add(10);
        numbers.add(40);
      
        System.out.println(numbers);
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.remove(20));
        System.out.println(numbers);
        System.out.println(numbers.add(60));
        System.out.println(numbers);
        System.out.println(numbers.size());

	}

}
