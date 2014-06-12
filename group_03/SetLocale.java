import java.util.Locale;

public class SetLocale
{
    public static void main (String [] args)
    {
        // See what locale is java using
        System.out.println("Default locale:" + Locale.getDefault().toString());

        // Change it to US
        Locale.setDefault(Locale.US);

        // Verify it is working
        System.out.println("Default locale:" + Locale.getDefault().toString());
    }
}
