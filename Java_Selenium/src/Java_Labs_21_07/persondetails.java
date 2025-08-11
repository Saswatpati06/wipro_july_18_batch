package Java_Labs_21_07;

public class persondetails {

	    // Method to print name, age, and city
	    public void printDetails(String name, int age, String city) {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("City: " + city);
	    }

	    public static void main(String[] args) {
	        // Create an object of PersonDetails
	        persondetails person = new persondetails();

	        // Call the method with sample data
	        person.printDetails("John", 22, "Delhi");
	    }
	}

