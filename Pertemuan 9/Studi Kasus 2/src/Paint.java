public class Paint {
    private double coverage; //number of square feet per gallon

    public Paint (double coverage)
    {
        this.coverage = coverage;
    }

    public double amount (Shape shape)
    {
        double area = shape.area();
        double amountNeeded = area / coverage;
        System.out.println ("The amount of paint needed for " + shape + " is: " + amountNeeded + " gallons.");
        return amountNeeded;
    }
}
