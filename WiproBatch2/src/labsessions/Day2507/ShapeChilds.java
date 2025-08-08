package labsessions.Day2507;

class circle implements Shape{
	@Override
	public void getArea(double radius, double pi) {
		double area = pi*radius*radius;
		System.out.println("The area of the Circle is :"+area);
	}
}

class rectangle implements Shape{
	@Override
	public void getArea(double length, double width) {
		double area = length*width;
		System.out.println("The area of the Rectangle is :"+area);
	}
}

class triangle implements Shape{
	@Override
	public void getArea(double height, double base) {
		double area = height*base/2;
		System.out.println("The area of the Triangle is :"+area);
	}
}

public class ShapeChilds {
	public static void main(String[] args) {
		circle obj1 = new circle();
		rectangle obj2 = new rectangle();
		triangle obj3 = new triangle();
		obj1.getArea(12,3.14);
		obj2.getArea(10, 20);
		obj3.getArea(15.2,23.1);
	}

}
