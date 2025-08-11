package Java_labs_23_07;

class Vehicle {
    public void drive() {
        System.out.println("Driving vehicle");
    }
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}

public class Vehicle1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
    }
}

