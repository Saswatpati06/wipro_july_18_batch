package Java_labs_23_07;

public class SearchElement 
{
	    public static void main(String[] args) {
	        int[] num = {10, 20, 30, 40, 50}; 
	        int key = 20; 

	        boolean found = false;
	        for (int i = 0; i < num.length; i++) {
	            if (num[i] == key) {
	                System.out.println("Element found at index " + i);
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Element not found in the array.");
	        }
	    }
	}

