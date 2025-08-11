package Java_all_days_program;

public class Circle1 implements CircleShape{
	
	public Void radius() {
		// TODO Auto-generated method stub
		System.out.println("Radius 5 units");
		return null;
	}
	public void draw()
	{
		System.out.println("Drawing Circle");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 c = new Circle1();
		
		c.draw();
		c.radius();
		

	}


}
