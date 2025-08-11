package Java_all_days_program;

public class Multilevelchild2 extends Multilevelchild1{

       int topSpeed = 250;

	    public void showDetails() {
	        System.out.println("Top Speed is: " + topSpeed + " km/h");
	    }

	    public static void main(String[] args) {
	        // Creating object of lowest level child
	    	Multilevelchild2 obj = new Multilevelchild2();

	      
	        obj.start();

	       
	        obj.showModel();


	        obj.showDetails();
	    }

		
	}

