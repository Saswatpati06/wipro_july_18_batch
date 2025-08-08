package labsessions.Day2307;

class Vehicle{
	public void drive() {
		System.out.println("vehicle drives");
	}
}

class car extends Vehicle{
	public void drive() {
		System.out.println("Car drives");
	}
}

public class drive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj = new car();
		obj.drive();
	}

}
