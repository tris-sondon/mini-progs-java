// This code calculates the square root of a number
// using Newton's Method, up to 15 decimal places.
// Refactoring of the initial code, now it does:
//      - If c is negative, returns NaN
//      - divided user interaction and sqrt calculations in functions
//      - Can take several numbers from command line, for easy testing.
//

import java.util.Locale;

public class SqrtByNewton 
{
    public static double sqrt(double c)
    {
        Locale.setDefault(Locale.US);

        if (c < 0) return Double.NaN;
        double epsilon = 1e-15;
        double t = c; // initial estimate

        while (Math.abs(t - c/t) > epsilon * t)
        {
            t = (c/t + t) / 2.0;    
        }
        return t;
    }


    public static void main(String[] args)
    {
        int N = args.length;
        double[] num = new double[N];
        for (int i = 0; i < N; i++) 
        {
            num[i] = Double.parseDouble(args[i]);
        }
        System.out.printf("%12s %12s\n", "N", "Sqrt(N)");
        for (int i = 0; i < N; i++) 
        {
            double s = sqrt(num[i]);
            System.out.printf("%12.5f %12.5f\n", num[i], s);
        }
    }
}
