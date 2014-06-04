public class RandomInt
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);    
        double r = Math.random(); // uniform rn 0 - 1
        int n = (int) (r * N);    // uniform rn 0 - N-1
        System.out.println(" r = " + r + ", r * N = " + (r*N));
        System.out.println(" n = " + n);
    }
}
