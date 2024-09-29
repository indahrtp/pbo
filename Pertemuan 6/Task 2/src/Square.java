public class Square extends Rectangle {
    // Constructor with no arguments
    public Square() {
        super(1.0, 1.0); // Call Rectangle constructor with default size
    }

    // Constructor with side length
    public Square(double side) {
        super(side, side); // Call Rectangle constructor with equal width and length
    }

    // Constructor with side length, color, and filled status
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled); // Call Rectangle constructor with width, length, color, and filled
    }

    // Getter for side
    public double getSide() {
        return getWidth(); // Since width and length are equal
    }

    // Setter for side
    public void setSide(double side) {
        setWidth(side); // Set width and length to maintain square geometry
        setLength(side);
    }

    // Override toString method
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}