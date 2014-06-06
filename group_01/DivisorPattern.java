public class DivisorPattern
{
    public static void main(String[] args) 
    {
        int N = Integer.parseInt(args[0]);
        for (int i = 1; i <= N; i++) 
        {
            if (i < 10) 
                System.out.print(" " + i + " ");
            else // (10 <= i < 100) 
                System.out.print(i + " ");
        }
        System.out.println("");
        for (int i = 1; i <= N; i++) 
        {
            for (int j = 1; j <= N; j++) 
            {
                if ((i % j == 0) || (j % i == 0))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }    
            System.out.println(" " + i );
        }
    }    
}
