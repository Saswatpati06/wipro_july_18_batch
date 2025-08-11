package Java_labs_23_07;

class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.makeSound();
    }
}


