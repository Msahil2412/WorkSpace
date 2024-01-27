package DS_Algo_JAVA.Questions;

import java.util.Scanner;

public class TillingProblem_2 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int ways = countWaysToTile(n, m);
            System.out.println(ways);
        }
    }

    public static int countWaysToTile(int n, int m) {
        if (n < m) {
            return 1; // The floor is smaller than the tile, no way to tile it.
        }

        if (n == m) {
            return 2; // There are two ways to tile: either horizontally or vertically.
        }

        // Recursively find the number of ways by considering two cases: placing the tile horizontally and vertically.
        return countWaysToTile(n - 1, m) + countWaysToTile(n - m, m);
    }
}

