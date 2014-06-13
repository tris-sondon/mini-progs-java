import java.util.Scanner;
import java.util.Locale;

public class Plot 
{
    public static void main (String [] args)
    {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        double x0 = in.nextDouble();
        double y0 = in.nextDouble();
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();

        StdDraw.setXscale(x0, x1);
        StdDraw.setYscale(y0, y1);

        while (in.hasNext())
        {
            double x = in.nextDouble();
            double y = in.nextDouble();
            StdDraw.point(x, y);
        }
    }
}
