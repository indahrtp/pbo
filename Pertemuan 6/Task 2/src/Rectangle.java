public class Rectangle extends Shape {
    private double width = 1.0;  // Default width
    private double length = 1.0; // Default length

    // No-arg constructor
    public Rectangle() {
        super(); // Call Shape's no-arg constructor
    }

    // Constructor with width and length
    public Rectangle(double width, double length) {
        super(); // Call Shape's no-arg constructor
        this.width = width;
        this.length = length;
    }

    // Constructor with width, length, color, and filled status
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled); // Call Shape's constructor with parameters
        this.width = width;
        this.length = length;
    }

    // Getter and setter for width and length
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Calculate area
    public double getArea() {
        return width * length;
    }

    // Calculate perimeter
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Override toString method
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}