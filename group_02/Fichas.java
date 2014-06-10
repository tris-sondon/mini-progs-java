public class Fichas 
{
    public static void main (String [] args)
    {
        // Generate values randomly until each one of
        // 1-N is found (0 - N-1 indexes)
        int N = Integer.parseInt(args[0]);
        boolean[] found = new boolean[N];
        // fcount: counter of number of trials
        // vcount: counts number of values found
        int fcount = 0, vcount = 0;

        while (vcount < N) 
        {
            int v = (int) (Math.random() * N);
            fcount++;
            if (!found[v])
            {
                vcount++;
                found[v] = true;
            }
        }
        System.out.println(fcount);
    }
}
