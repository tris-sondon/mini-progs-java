import java.util.Locale;
import java.util.Scanner;

public class PlayTuneHarmonics 
{
    public static double[] sum(double[] a, double[] b,
                               double awt, double bwt)
    {
        double[] c = new double[a.length];
        for (int i = 0; i < a.length; i++)
        {
            c[i] = a[i] * awt + b[i] * bwt;    
        }
        return c;
    }

    public static double[] tone(double freq, double duration)
    {
        int sampling = 44100;
        int N = (int) (sampling * duration);
        double[] f = new double[N+1];
        for (int i = 0; i <= N; i++)
        {
            f[i] = Math.sin(2 * Math.PI * i * freq / sampling);
        }      
        return f;
    }

    public static double[] note(int pitch, double t)
    {
        double freq = 440 * Math.pow(2, pitch / 12.0);    
        double[] a = tone(freq, t);
        double[] hi = tone(2*freq, t);
        double[] lo = tone(freq/2, t);
        double[] h = sum(hi, lo, 0.5, 0.5);
        return sum(a, h, 0.5, 0.5);
    }

    public static void main (String [] args)
    {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        while (in.hasNext())
        {
            int pitch = in.nextInt();
            double duration = in.nextDouble();
            double[] a = note(pitch, duration);
            System.out.println(pitch + "  " + duration);
            StdAudio.play(a);
        }
    }
}
