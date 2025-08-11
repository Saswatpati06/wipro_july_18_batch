package Java_all_days_program;
final class FinalClass {
	    
	   
	    final int finalValue = 10;
	    public final void display() {
	        System.out.println("Final value is: " + finalValue);
	    }
	
	 /*class SubClass extends FinalClass { 
	        // Attempt to override display method will also fail
	        public void display() {
	            System.out.println("Overridden value");
	        }
	    }*/
	 
	public class Main {
	    public static void main(String[] args) {
	        FinalClass obj = new FinalClass();
	        obj.display();
	    }
	}
	}	



/*public class FinalEg {
    public static final int a = 100;
    //a=200;
    public final void finalMethod() {
        System.out.println("This is a final method");
    }

    public static final class FinalClass{
    	
        public void show() {
            System.out.println("Inside final class");
        }
    }
    //class Final2 extends FInalClass{
    	
    //}

    public static void main(String[] args) {
        System.out.println(a);

        FinalEg demo = new FinalEg();
        demo.finalMethod();

        FinalClass fc = new FinalClass();
        fc.show();
    }
}*/