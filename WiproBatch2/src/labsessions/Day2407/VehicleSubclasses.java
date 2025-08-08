package labsessions.Day2407;

abstract class Vehicle{
	abstract void move();
}

class car extends Vehicle{
	@Override
	void move() {
		System.out.println("car is moving on four wheels");
	}
}

class bike extends Vehicle{
	@Override
	void move() {
		System.out.println("Bike is moving on two wheels");
	}
}

class bus extends Vehicle{
	@Override
	void move() {
		System.out.println("Bus is moving on six wheels");
	}
}

public class VehicleSubclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car obj1 = new car();
		bike obj2 = new bike();
		bus obj3 = new bus();
		obj1.move();
		obj2.move();
		obj3.move();
	}

}
