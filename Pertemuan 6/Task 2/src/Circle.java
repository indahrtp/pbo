public class Circle extends Shape {
    private double radius = 1.0; // Default radius

    // No-arg constructor
    public Circle() {
        super(); // Call Shape's no-arg constructor
    }

    // Constructor with radius
    public Circle(double radius) {
        super(); // Call Shape's no-arg constructor
        this.radius = radius;
    }

    // Constructor with radius, color, and filled status
    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // Call Shape's constructor with parameters
        this.radius = radius;
    }

    // Getter and setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Calculate perimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override toString method
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
