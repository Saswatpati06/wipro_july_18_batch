package Java_all_days_program;

public class Sustringeg2 {
	
	    public static void main(String[] args) {
	        // Strings
	        String s1 = "Core Java";
	        System.out.println("s1: " + s1);

	        char[] ch = { 'S', 'e', 'l', 'e', 'n', 'i', 'u', 'm' };
	        String s2 = new String(ch);
	        System.out.println("s2 (from char array): " + s2);

	        String s3 = new String("Selenium");
	        System.out.println("s3 (using new keyword): " + s3);

	        // String Methods

	        // Equals
	        System.out.println("s1.equals(s2): " + s1.equals(s2)); // false
	        System.out.println("s1.equalsIgnoreCase(s2): " + s1.equalsIgnoreCase(s2)); // false

	        // Concatenation
	        System.out.println("s1.concat(s2): " + s1.concat(s2)); // Core JavaSelenium

	        // Contains
	        System.out.println("s1.contains(\"Java\"): " + s1.contains("Java")); // true
	        System.out.println("s2.contains(\"nium\"): " + s2.contains("nium")); // true

	        // Substring
	        System.out.println("s1.substring(5): " + s1.substring(5)); // Java
	        System.out.println("s2.substring(0, 4): " + s2.substring(0, 4)); // Sele

	        // Replace
	        System.out.println("s1.replace(\"Java\", \"Python\"): " + s1.replace("Java", "Python")); // Core Python
	        System.out.println("s2.replaceAll(\"Selenium\", \"Automation\"): " + s2.replaceAll("Selenium", "Automation"));

	        // isEmpty
	        System.out.println("s1.isEmpty(): " + s1.isEmpty()); // false

	        // endsWith
	        System.out.println("s2.endsWith(\"um\"): " + s2.endsWith("um")); // true

	        // join
	        String str3 = String.join(" - ", "Tool", "Selenium");
	        System.out.println("String.join: " + str3); // Tool - Selenium

	        // Lexicographical comparison using split
	        String text = "Java is awesome";
	        String[] result = text.split("");

	        System.out.println("Lexical split:");
	        for (String str : result) {
	            System.out.print(str + ",");
	        }
	    }
	}


