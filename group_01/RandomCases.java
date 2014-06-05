public class RandomCases
{
    public static void main(String[] args)
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        // random integer between x and y
        double rn = Math.random();
        int n = (int) ((y - x + 1) * rn) + x;
        System.out.println(n);

    }    
}

