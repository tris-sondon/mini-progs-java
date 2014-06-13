public class Pelota 
{
    public static void main (String [] args)
    {
        StdDraw.setXscale(-1, 1);
        StdDraw.setYscale(-1, 1);

        double rx = 0.480;
        double ry = 0.860;
        double vx = 0.015;
        double vy = 0.023;
        double radius = 0.05;

        while (true)
        {
            if (Math.abs(rx + vx) + radius > 1.0) vx = -vx;    
            if (Math.abs(ry + vy) + radius > 1.0) vy = -vy;    
            rx = rx + vx;
            ry = ry + vy;
            StdDraw.clear();
            StdDraw.filledCircle(rx, ry, radius);
            StdDraw.show(20);
        }
    }
}
