public class RGBtoCMYK
{
    public static void main(String[] args)
    {
        // R, G, B numbers between 0 and 255
        // CMYK 0.0 to 1.0
        
        int r, g, b;
        r = Integer.parseInt(args[0]);
        g = Integer.parseInt(args[1]);
        b = Integer.parseInt(args[2]);

        if (r == 0 && g == 0 && b == 0) 
        {
            System.out.println("C = 0.0");
            System.out.println("M = 0.0");
            System.out.println("Y = 0.0");
            System.out.println("K = 1.0");
        } 
        else 
        {
            // this is the formula I was given, but it is not correct
            // TODO: check
            double w, c, m, y, k;
            w = Math.max(Math.max(r/255, g/255), b/255);
            System.out.println("Max = " + w);

            c = (w - (r/255)) / w;
            m = (w - (g/255)) / w;
            y = (w - (b/255)) / w;
            k = 1 - w;

            System.out.println("C = " + c);
            System.out.println("M = " + m);
            System.out.println("Y = " + y);
            System.out.println("K = " + k);
        }
    }    
}
