public class ex1_3_16 
{
    public static void main (String [] args)
    {
        long N = Long.parseLong(args[0]);
        if (N >= 0) 
        {
            double sum = 0;
            for (long i = 1; i <= N; i++) 
            {
                sum += 1.0 / (i*i);
            }
            System.out.println("Sum = " + sum + " Pi = " + Math.sqrt(6 * sum));
        }
    }
}
