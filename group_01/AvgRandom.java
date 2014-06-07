public class AvgRandom 
{
    public static void main (String [] args)
    {
        int N = Integer.parseInt(args[0]);
        double r, sum = 0.0;
        for (int i = 0; i < N; i++) 
        {
            r = Math.random();
            sum += r;
            System.out.println(" i = " + i + ", r = " + r);
        }
        System.out.println("Average = " + sum / N);
    }
}
