package labsessions.Day2507;

public class Dog implements Animal{
	@Override
	public void bark() {
		System.out.println("Dog is barking");
	}

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.bark();
	}

}
