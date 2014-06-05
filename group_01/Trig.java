public class Trig
{
    public static void main(String[] args)
    {
            double theta = Double.parseDouble(args[0]);
            double d = Math.cos(theta) * Math.cos(theta) + Math.sin(theta) * Math.sin(theta);
            System.out.println(d);
    }
}
