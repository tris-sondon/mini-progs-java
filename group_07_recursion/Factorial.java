import java.util.Scanner;

public class Factorial 
{
    public static long factorial(int N)
    {
        if (N == 1 || N == 0) 
        {
            return 1;    
        }
        return N * factorial(N-1);
    }

    public static void main (String [] args)
    {
        int N = 0;
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        if (N >= 0) 
        {
            System.out.println("Factorial of: " + N + " = " + factorial(N));
        }
        else
        {
            System.out.println("Factorial is defined for non negative integers");    
        }
    }
}
