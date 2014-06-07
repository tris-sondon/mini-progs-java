// Simulation of a gambler that makes 1$ bets
//
// stake: Initial stake
// goal: amount of money that will stop the simulation
// T: number of trials
// bets: bet count
// wins: wins count
// cash: cash left

public class Gambler
{
    public static void main(String[] args)
    {
        int stake = Integer.parseInt(args[0]);    
        int goal = Integer.parseInt(args[1]);    
        int T = Integer.parseInt(args[2]);    
        int bets = 0;
        int wins = 0;

        for (int t = 0; t < T; t++)
        {
            int cash = stake;
            while (cash > 0 && cash < goal)
            {
                bets++;
                if (Math.random() < 0.5) 
                    cash++;
                else
                    cash--;
            }
            if (cash == goal) 
                wins++;
        }
        System.out.println(100 * wins / T + " % wins");
        System.out.println("Avg # bets: " + bets/T);

        // Theoretical results
        System.out.println("Theo: " + (double) stake / goal * 100 + " % wins");
        System.out.println("Theo: # bets: " + stake * (goal - stake));

    }
}
