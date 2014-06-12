public class RandomNums 
{
    public static void main (String [] args)
    {
        int N = Integer.parseInt(args[0]);
        for (int i = 0; i < N; i++) 
        {
            double r = Math.random();
            System.out.println(r);
        }
    }
}
