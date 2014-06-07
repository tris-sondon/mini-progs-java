// Simulation of a gambler that makes 1$ bets
//
// stake: Initial stake
// goal: amount of money that will stop the simulation
// T: number of trials
// bets: bet count
// wins: wins count
// cash: cash left
//
// This version takes also the max number of bets that
// the gambler will make.

public class Gambler2
{
    public static void main(String[] args)
    {
        int stake = Integer.parseInt(args[0]);    
        int goal = Integer.parseInt(args[1]);    
        int T = Integer.parseInt(args[2]);    
        int bets_limit = Integer.parseInt(args[3]);    
        int bets = 0;
        int bets_ant = 0;
        int wins = 0;
        int total_cash = 0;

        System.out.println("trial" + " " + "cash" + " " + "total_cash     bets in trial");
        for (int t = 0; t < T; t++)
        {
            int cash = stake;
            bets_ant = bets;
            for (int betnum = 1; betnum < bets_limit; betnum++) 
            {
                if (cash > 0 && cash < goal)
                {
                    bets++;
                    if (Math.random() < 0.5) 
                        cash++;
                    else
                        cash--;
                }
            }
            if (cash == goal) 
                wins++;
            total_cash += cash;
        
            System.out.println(t + "     " + cash + "       " + total_cash + "       " + (bets - bets_ant));
        }
        System.out.println();
        System.out.println(100 * wins / T + " % wins");
        System.out.println("Avg # bets: " + bets/T);
        System.out.println("Avg cash: " + total_cash/T);
        System.out.println("Total bets: " + bets);
        System.out.println("Initial total cash: " + stake * T + "  Total cash left: " + total_cash);
        System.out.println();

        // Theoretical results
        System.out.println("Theo: " + (double) stake / goal * 100 + " % wins");
        System.out.println("Theo: # bets: " + stake * (goal - stake));

    }
}
