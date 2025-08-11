package Collections;
import java.util.Collections;
import java.util.Vector;

public class Vectorsex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// growable array of objects.
		
		// zero based index
		
		//maintains the insertion order
		
		// stores duplicate elements
		
		//capacity increment
		
		//null values allowed
		
		// synchronize

		 Vector<String> vector = new Vector<>();
		  vector.add("Apple");
		  vector.add("Banana");
		  vector.add("Cherry");
		  vector.add("Date");
		  vector.add("Elderberry");

		        System.out.println("Original Vector: " + vector);

		        vector.add(2, "Blueberry");
		        System.out.println(vector);

		        //Accessing  element
		        System.out.println(vector.get(3));
		        
		        //updated
		        vector.set(1, "Blackberry");
		        System.out.println(vector);

		        //Remove element by index
		        vector.remove(4);
		        System.out.println(vector);

		        //Remove element by value
		        vector.remove("Date");
		        System.out.println(vector);

		        //Size and Capacity
		        System.out.println("Size: " + vector.size());
		        System.out.println("Capacity: " + vector.capacity());

		        //Check if contains
		        System.out.println("Contains 'Apple' " + vector.contains("Apple"));
		        System.out.println("Contains 'Guava' " + vector.contains("Guava"));

		        //Index of element
		        System.out.println("Index of 'Cherry': " + vector.indexOf("Cherry"));

		   
		        System.out.println("Is vector empty? " + vector.isEmpty());

		        //Sorting elements
		        Collections.sort(vector);
		        System.out.println(vector);
		        //reversing of element
		        Collections.reverse(vector);
		        System.out.println( vector);

		    }
		

	}


