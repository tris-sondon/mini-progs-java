import java.util.Scanner;

public class RangeFilter 
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        int lo = Integer.parseInt(args[0]);
        int hi = Integer.parseInt(args[1]);

        while (in.hasNext())
        {
            int t = in.nextInt();
            if (t >= lo && t <= hi)
            {
                System.out.print(t + " ");    
            }
        }
        System.out.println();
    }
}
