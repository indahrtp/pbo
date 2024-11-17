import java.text. DecimalFormat;

public class PaintThings
{
    public static void main (String[] args)
    {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);

        Rectangle deck = new Rectangle(20, 35);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);

        double deckPaint = paint.amount(deck);
        double bigBallPaint = paint.amount(bigBall);
        double tankPaint = paint.amount(tank);

        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println ("\nNumber of paint needed...");
        System.out.println ("Deck : " + fmt.format (deckPaint));
        System.out.println ("Big Ball : " + fmt.format (bigBallPaint));
        System.out.println ("Tank : " + fmt.format (tankPaint));
    }
}
