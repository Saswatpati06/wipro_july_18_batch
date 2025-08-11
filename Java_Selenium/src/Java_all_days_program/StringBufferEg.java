package Java_all_days_program;

public class StringBufferEg {

	    public static void main(String[] args) {
	        // Creating a StringBuffer
	        StringBuffer sb = new StringBuffer("hello");
	        System.out.println("Original: " + sb);

	        // append
	        sb.append(" world");
	        System.out.println("After append: " + sb);

	        // insert
	        sb.insert(6, "beautiful ");
	        System.out.println("After insert: " + sb);

	        // delete
	        sb.delete(6, 16);  // removes "beautiful "
	        System.out.println("After delete: " + sb);

	        // reverse
	        sb.reverse();
	        System.out.println("After reverse: " + sb);

	        // reverse back to original for further operations
	        sb.reverse();

	        // replace
	        sb.replace(6, 11, "Java");
	        System.out.println("After replace: " + sb);

	        // substring
	        String sub = sb.substring(6, 10);
	        System.out.println("Substring (6 to 10): " + sub);

	        // charAt
	        char ch = sb.charAt(1);
	        System.out.println("Character at index 1: " + ch);

	        // indexOf
	        int index = sb.indexOf("Java");
	        System.out.println("Index of 'Java': " + index);

	        // length
	        int len = sb.length();
	        System.out.println("Length of StringBuffer: " + len);

	        // isEmpty (using length)
	        boolean isEmpty = sb.length() == 0;
	        System.out.println("Is empty? " + isEmpty);

	        // repeat (manually repeating the StringBuffer content 3 times)
	        StringBuffer repeated = new StringBuffer();
	        for (int i = 0; i < 3; i++) {
	            repeated.append(sb);
	        }
	        System.out.println("Repeated 3 times: " + repeated);
	    }
	


	}


