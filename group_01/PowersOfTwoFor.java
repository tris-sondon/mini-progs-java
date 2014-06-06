public class PowersOfTwoFor
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);

        // Check for overflow
        if (N > 30) 
        { 
            System.out.println("This program can only print powers up to 30");
        }
        else
        {   
            System.out.println( "i    v ");    
            int v = 1;
            for (int i = 0; i <= N; i++) 
            {
                System.out.println( i + "    " + v);    
                v = v * 2;
            }
        }
    }    
}
