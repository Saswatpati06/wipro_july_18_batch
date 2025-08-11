package Java_labs_25_07;

public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
