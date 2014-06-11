public class SelfAvoidingRandomWalks 
{
    public static void main (String [] args)
    {
        // Size of the lattice NxN
        int N = Integer.parseInt(args[0]);

        // Number of simulations
        int T = Integer.parseInt(args[0]);

        // How many simulations end up in dead ends
        int deadEnds = 0;

        for (int t = 0; t < T; t++) 
        {
            // keeps track of visited intersections
            boolean[][] visited = new boolean[N][N];

            // Set starting point to the center of the lattice
            int x = N/2;
            int y = N/2;

            while (x > 0 && x < N-1 && y > 0 && y < N-1)
            {
                visited[x][y] = true;

                // if we visited all possible intersections, 
                // we found a dead end, jump out of the while loop
                if (visited[x-1][y] && visited[x+1][y] &&
                    visited[x][y-1] && visited[x][y+1])
                {
                    deadEnds++;
                    break;
                }

                // next move
                double r = Math.random();
                if (r < 0.25) 
                {
                    if (!visited[x+1][y]) x++;     
                }
                else if (r < 0.50) 
                {
                    if (!visited[x-1][y]) x--;     
                }
                else if (r < 0.75) 
                {
                    if (!visited[x][y+1]) y++;     
                }
                else // r < 1.00 
                {
                    if (!visited[x][y-1]) y--;     
                }
            }
        }
        System.out.println(100 * deadEnds / T + " % dead ends");
    }
}
