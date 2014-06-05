public class Dice
{
    public static void main(String[] args)
    {
        int die1 = (int) (6 * Math.random()) + 1;
        int die2 = (int) (6 * Math.random()) + 1;
        System.out.println("die 1: " + die1 + ", die 2: " + die2);
        System.out.println("Sum: " + (die1 + die2));
    }    
}

