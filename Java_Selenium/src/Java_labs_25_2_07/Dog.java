package Java_labs_25_2_07;

public class Dog implements Animal {
	    @Override
	    public void bark() {
	        System.out.println("Dog is barking");
	    }

	    public static void main(String[] args) {
	        Dog myDog = new Dog();
	        myDog.bark();
	    }
	}

