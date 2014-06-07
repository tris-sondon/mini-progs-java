public class DayOfTheWeekSwitch
{
    public static void main(String[] args) 
    {
        // input from user
        int m, d, y;
        m = Integer.parseInt(args[0]);
        d = Integer.parseInt(args[1]);
        y = Integer.parseInt(args[2]);

        int y0, x, m0, d0;

        y0 = y - (14 - m)/12;
        x = y0 + y0/4 - y0/100 + y0/400;
        m0 = m + 12 * ((14 - m) / 12) - 2;
        d0 = (d + x + (31 * m0)/12) % 7;

        switch (d0)
        {    
            case 0: System.out.println("Sun"); break;
            case 1: System.out.println("Mon"); break;
            case 2: System.out.println("Tue"); break;
            case 3: System.out.println("Wed"); break;
            case 4: System.out.println("Thu"); break;
            case 5: System.out.println("Fri"); break;
            case 6: System.out.println("Sat"); break;
        }
    }    
}
