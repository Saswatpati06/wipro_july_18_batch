package Java_labs_25_07;

public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
