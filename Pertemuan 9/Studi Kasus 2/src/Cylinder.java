public class Cylinder extends Shape {
    private double radius;
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {

        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public String toString() {

        return shapeName + " with radius " + radius + " and height " + height;
    }
}
