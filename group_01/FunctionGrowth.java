public class FunctionGrowth 
{
    public static void main (String [] args)
    {
        int N = Integer.parseInt(args[0]);
        double CONV = Math.log(2);
        
        System.out.println("\tn\tlog(n)\tnlog(n)\tn^2\tn^3\t2^n");

        for (int i = 1; i <= N; i++) 
        {
            System.out.print("\t" + i);
            System.out.printf("\t%.2f", Math.log(i)/CONV); 
            System.out.printf("\t%.2f", i*Math.log(i)/CONV); 
            System.out.print("\t" + i*i);
            System.out.print("\t" + i*i*i);
            System.out.print("\t" + Math.pow(2,i)); 
            System.out.printf("\n"); 
        }
    }
}
