public class CartesianToPolar
{
    public static void main(String[] args)
    {
        double x, y, theta, r, theta2;
        x = Double.parseDouble(args[0]);
        y = Double.parseDouble(args[1]);

        r = Math.sqrt(x*x + y*y);
        theta2 = Math.atan2(y, x); // angle between -PI, PI
        theta = Math.atan(y/x);

        System.out.println("r: " + r);
        System.out.println("theta: " + theta);
        System.out.println("theta (atan2): " + theta2);
    }    
}
