public class StdGaussian
{
    public static void main(String[] args)
    {
        // Box-Muller formula: w = sin( 2 PI v) (-2 ln u)^(1/2)
        double u, v, w;
        u = Math.random();
        v = Math.random();
        w = Math.sin(2 * Math.PI * v) * Math.sqrt(-2 * Math.log(u));
        System.out.println("w: " + w);
    }    
}
