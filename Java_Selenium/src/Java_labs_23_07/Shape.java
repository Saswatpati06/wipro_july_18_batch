package Java_labs_23_07;


	class Shape1 {
	    public double getArea() {
	        return 0.0;
	    }
	}

	class Rectangle extends Shape1 {
	    double length;
	    double width;

	    Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    @Override
	    public double getArea() {
	        return length * width;
	    }
	}

	public class Shape {
	    public static void main(String[] args) {
	        Rectangle rect = new Rectangle(5.0, 3.0);
	        System.out.println("Area of rectangle: " + rect.getArea());
	    }
	}


