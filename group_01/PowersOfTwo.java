public class PowersOfTwo
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
            int v = 1;
            int i = 0;

            System.out.println( "i    v ");    

            while (i <= N) 
            {
                System.out.println( i + "    " + v);    
                v = v * 2;
                i = i + 1;
            }
        }
    }    
}
