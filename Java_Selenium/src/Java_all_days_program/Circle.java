package Java_all_days_program;

public class Circle {
	    
	    public void calculateArea(double r) {
	        double area = 3.14 * r * r;
	        System.out.println("The area :"+ area);
	    }
	    public static void main(String[] args) {
	        
	        Circle myCircle = new Circle();
	        double r = 7;
	        myCircle.calculateArea(r);
	    }
	}


