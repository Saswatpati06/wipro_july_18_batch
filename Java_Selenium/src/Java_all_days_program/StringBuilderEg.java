package Java_all_days_program;

public class StringBuilderEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Creating a StringBuilder
		        StringBuilder sb = new StringBuilder("hello");
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
		        System.out.println("Length of StringBuilder: " + len);

		        // isEmpty (StringBuilder does not have isEmpty(), use length == 0)
		        boolean isEmpty = sb.length() == 0;
		        System.out.println("Is empty? " + isEmpty);

		        // repeat manually (repeat 3 times)
		        StringBuilder repeated = new StringBuilder();
		        for (int i = 0; i < 3; i++) {
		            repeated.append(sb);
		        }
		        System.out.println("Repeated 3 times: " + repeated);
		    }
		

	}


