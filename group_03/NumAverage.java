import java.util.Scanner;
import java.util.Locale;

public class NumAverage 
{
    public static void main (String [] args)
    {
        // Change Locale to avoid inconsitencies in doubles formatting
        Locale.setDefault(Locale.US);

        double sum = 0;
        int count = 0;

        Scanner in = new Scanner(System.in);

        while (in.hasNext())
        {
            double num = in.nextDouble();
            sum += num;
            count++;
        }
        double average = sum / count;
        System.out.println("Average of " + count + " numbers = " + average);

    }
}
