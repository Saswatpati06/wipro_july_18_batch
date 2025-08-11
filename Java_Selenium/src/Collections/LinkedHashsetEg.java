package Collections;

import java.util.LinkedHashSet;

public class LinkedHashsetEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// no duplicates are allowed
		
		// insertion order
		
		// only one null is allowed
		
		// not synchronized
		
		// slightly slower than hash set(order main)
		
		LinkedHashSet<String> st = new LinkedHashSet<>();

        st.add("Orange");
        st.add("Banana");
        st.add("Grapes");
        st.add("null"); 
        st.add("Apple");
        st.add("Pine apple");
        st.add("null"); 
        st.add(null); 

        
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println(st.remove("Grapes")); 
        System.out.println(st);
        System.out.println(st.add("Lichi"));
        System.out.println(st);
        System.out.println(st.size());
    }

	}


