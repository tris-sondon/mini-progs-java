public class InvertArray 
{
    public static void main (String [] args)
    {
        int N = Integer.parseInt(args[0]);
        int[] a;
        a = new int[N];
        for (int i = 0; i < N; i++) 
        {
            a[i] = i*i*i;    
        }

        // Print original array
        for (int i = 0; i < N; i++) 
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < N/2; i++) 
        {
            int aux = a[i];
            a[i] = a[N-i-1];
            a[N-i-1] = aux;
        }

        // Print reversed array
        for (int i = 0; i < N; i++) 
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
