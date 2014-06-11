public class PrimeSieve
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        boolean isPrime[] = new boolean[N+1];
        
        // Initialize array
        for (int i = 2; i <= N/i; i++) 
        {
            isPrime[i] = true;    
        }

        for (int i = 2; i <= N; i++)
        {
            if (isPrime[i])
            {
                // mark all multiples of i as non prime
                for (int j = i; j <= N/i; j++) 
                {
                    isPrime[i*j] = false;    
                }
            }
        }

        int primes = 0;
        for (int i = 2; i <= N; i++) 
        {
            if (isPrime[i]) primes++;
        }

        System.out.println("Number of primes: " + primes);

    }
}
