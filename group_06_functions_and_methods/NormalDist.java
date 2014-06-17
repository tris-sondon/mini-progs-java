public class NormalDist 
{
    public static double normd(double x)
    {
        return Math.exp(-x*x/2) / Math.sqrt(2*Math.PI);    
    }

    public static double Norm(double z)
    {
        // set tails to 0 and 1
        if (z < -8) return 0.0;
        if (z > 8) return 1.0;

        // Integrate density
        double sum = 0.0;
        double term = z;
        for (int i = 3; sum != sum + term; i += 2) 
        {
           sum += term;
           term = term * z * z / i;
        }
        return 0.5 + normd(z) * sum;
    }

    public static void main (String [] args)
    {
        double z = Double.parseDouble(args[0]);
        double mu = Double.parseDouble(args[1]);
        double sigma = Double.parseDouble(args[2]);

        System.out.printf("%10.5f \n", Norm((z - mu) / sigma));
    }
}
