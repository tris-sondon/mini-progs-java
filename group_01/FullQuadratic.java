public class FullQuadratic 
{
    public static void main (String [] args)
    {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double d = b*b - 4*a*c;

        if (d < 0) 
        {
            System.out.println("This equation has no real roots");    
        }
        else
        {
            System.out.println("Roots of the equation:");    
            System.out.println("x1 = " + ((-b + Math.sqrt(d)) / (2 * a)));    
            System.out.println("x1 = " + ((-b - Math.sqrt(d)) / (2 * a)));    
        }
    }
}
