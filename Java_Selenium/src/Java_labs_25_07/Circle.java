package Java_labs_25_07;

public class Circle implements Shape {
    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
}
