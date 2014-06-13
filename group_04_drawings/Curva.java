public class Curva 
{
    public static void main (String [] args)
    {
        int N = Integer.parseInt(args[0]);
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N);
        for (int i = 0; i <= N; i++) 
        {
            StdDraw.line(0, N-i, i, 0);    
        }
        for (int i = 0; i <= N; i++) 
        {
            StdDraw.line(i, N, N, N-i);    
        }
    }
}
