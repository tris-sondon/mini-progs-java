import java.util.Scanner;
import java.util.Locale;

public class PlayTune 
{
    public static void main (String [] args)
    {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int sampling = 44100;

        while (in.hasNext())
        {
            int pitch = in.nextInt();
            double duration = in.nextDouble();
            double freq = 440 * Math.pow(2, pitch / 12.0);
            int N = (int) (sampling * duration);
            double[] f = new double[N+1];
            for (int i = 0; i <= N; i++) 
            {
                f[i] = Math.sin(2 * Math.PI * i * freq / sampling);
            }
            StdAudio.play(f);
        }
    }
}
