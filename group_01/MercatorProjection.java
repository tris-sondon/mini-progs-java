public class MercatorProjection
{
    public static void main(String[] args) 
    {
        // input from user
        double lat, lon, lon0;
        lon0 = Double.parseDouble(args[0]);
        lon = Double.parseDouble(args[1]);
        lat = Double.parseDouble(args[2]);

        double x, y;

        x = lon - lon0;
        y = 0.5 * Math.log((1 + Math.sin(lat)) / (1 - Math.sin(lat)));

        System.out.println(" x = " + x + ", y = " + y);
        
    }    
}
