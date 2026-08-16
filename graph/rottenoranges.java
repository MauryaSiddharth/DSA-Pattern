package graph;

import java.util.LinkedList;
import java.util.Queue;

public class rottenoranges {

    static int[] x = {-1, 1, 0, 0};
    static int[] y = {0, 0, -1, 1};

    static class Pair {  // to add a pairs in queue or stack
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {

        int[][] grid = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };

        System.out.println(rotten(grid));
    }

    static int rotten(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();

        int fresh = 0;
        int time = 0;

        // Step 1: Find all rotten oranges
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 2) {
                    q.add(new Pair(i, j));
                    grid[i][j]=-2; //visited 
                }

                else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        // Step 2: BFS
        while (!q.isEmpty() && fresh > 0) {

            int size = q.size();

            // One complete level = one minute
            time++;

            while (size-- > 0) {

                Pair p = q.poll();

                int r = p.first;
                int c = p.second;

                // Check 4 directions
                for (int k = 0; k < 4; k++) {

                    int row = r + x[k];
                    int col = c + y[k];

                    if (valid(m, n, row, col)
                            && grid[row][col] == 1) {

                        grid[row][col] = -2;

                        q.add(new Pair(row, col));

                        fresh--;
                    }
                }
            }
        }

        // Fresh orange still exists
        if (fresh > 0) {
            return -1;
        }

        return time;
    }

    static boolean valid(int m, int n, int i, int j) {

        if (i < 0 || i >= n || j < 0 || j >= m) {
            return false;
        }

        return true;
    }
}