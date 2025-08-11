package Java_labs_25_07;

public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(6, 5);
        Shape circ = new Circle(10);
        Shape tri = new Triangle(6, 5);

        System.out.println("Rectangle Area: " + rect.getArea());
        System.out.println("Circle Area: " + circ.getArea());
        System.out.println("Triangle Area: " + tri.getArea());
    }
}
