public class IsPrime
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int i;
        for (i = 2; i <= N/i; i++) 
        {
            if (N % i == 0) break;
        }
        if (i > N/i) 
        {
            System.out.println(N + " is prime");
        }
        else 
        { 
            System.out.println(N + " is not prime");
        }
    }
}
