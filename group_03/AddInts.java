import java.util.Scanner;

public class AddInts 
{
    public static void main (String [] args)
    {
        int N = Integer.parseInt(args[0]);
        Scanner in = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < N; i++) 
        {
            int num = in.nextInt();
            sum += num;
        }
        System.out.println("Sum = " + sum);
    }
}
