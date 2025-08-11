package Java_labs_24_07;


	// Base class
	class Payment {
	    public void pay() {
	        System.out.println("Processing generic payment...");
	    }
	}

	// Child class for Credit Card
	class Creditcard extends Payment {
	   
	    public void pay() {
	        System.out.println("Processing payment using Credit Card...");
	    }
	}

	// Child class for UPI
	class UPI extends Payment {
	    @Override
	    public void pay() {
	        System.out.println("Processing payment using UPI...");
	    }
	}

	// Child class for Netbanking
	class Netbanking extends Payment {
	    //Override
	    public void pay() {
	        System.out.println("Processing payment using Netbanking...");
	    }
	}

	// main class 
	public class PaymentTest {
	    public static void main(String[] args) {
	        Payment payment1 = new Creditcard();
	        Payment payment2 = new UPI();
	        Payment payment3 = new Netbanking();

	        payment1.pay(); 
	        payment2.pay(); 
	        payment3.pay(); 
	    }
	}

