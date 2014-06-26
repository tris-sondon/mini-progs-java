import java.util.Locale;
import java.util.Scanner;

public class ArrayIO 
{
    private static Scanner in = new Scanner(System.in);
 
    public static double[] readDouble1D()
    {
        int N = in.nextInt();
        double[] a = new double[N];
        for (int i = 0; i < N; i++)
        {
            a[i] = in.nextDouble();     
        }
        return a;
    }
    public static double[][] readDouble2D()
    {
        int N = in.nextInt();
        int M = in.nextInt();
        double[][] a = new double[N][M];

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++) 
            {
                a[i][j] = in.nextDouble();     
            }
        }
        return a;
    }
    public static void print(double[] a)
    {
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i] + "  ");    
        }
        System.out.println();
    }

    public static void print(double[][] a)
    {
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[0].length; j++) 
            {
                System.out.print(a[i][j] + "  ");    
            }
            System.out.println();
        }
    }

    public static void main (String [] args)
    {
        Locale.setDefault(Locale.US);
        /* print(readDouble1D()); */
        print(readDouble2D());
    }
}
