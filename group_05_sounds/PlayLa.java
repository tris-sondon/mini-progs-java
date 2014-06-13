public class PlayLa 
{
    public static void main (String [] args)
    {
        int sampling = 44100;
        int freq = 440;  // La 
        double duration = 10.0; // seconds
        int N = (int) (sampling * duration);
        double[] f = new double[N+1];
        for (int i = 0; i <= N; i++) 
        {
            f[i] = Math.sin(2 * Math.PI * i * freq / sampling);
        }
        StdAudio.play(f);
    }
}
