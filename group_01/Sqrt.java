// This code calculates the square root of a number
// using Newton's Method, up to 15 decimal places.

public class Sqrt
{
    public static void main(String[] args)
    {
        double c = Double.parseDouble(args[0]);
        double epsilon = 1e-15;
        double t = c; // initial estimate

        while (Math.abs(t - c/t) > epsilon * t)
        {
            t = (c/t + t) / 2.0;    
        }
        System.out.println(t);
    }
}
