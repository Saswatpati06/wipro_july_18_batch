package Collections;

import java.util.HashSet;

public class HashSetEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// no duplicate elements allowed
		
		// no guaranteed order
		
		//multiple nulls are allowed but it gives only onceSet
		
		// not synchronized
		
		//  operations are faster than the list interface

		  HashSet<String> st = new HashSet<>();

		        st.add("Orange");
		        st.add("Banana");
		        st.add("Grapes");
		        st.add("Apple");
		        st.add("Pine apple");
		        st.add("null");  
		        st.add("Pine apple");
		      
		        System.out.println(st);
		        System.out.println(st.isEmpty()); 
		        System.out.println(st.remove("Grapes"));
		        System.out.println(st);
		        System.out.println(st.add("Lichi"));
		        System.out.println(st);
		        System.out.println(st.size());
		    }
		


	}


