public class TestShape {
    public static void main(String[] args) {
        // Testing Shape class
        Shape shape = new Shape("blue", false);
        System.out.println(shape.toString());

        // Testing Circle class
        Circle circle = new Circle(5.0, "yellow", true);
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Testing Rectangle class
        Rectangle rectangle = new Rectangle(4.0, 6.0, "green", true); // Correct constructor
        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Testing Square class
        Square square = new Square(3.0, "red", true);
        System.out.println(square.toString());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}