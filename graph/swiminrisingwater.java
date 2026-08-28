import java.util.LinkedList;
import java.util.Queue;

public class swiminrisingwater {

    static class Pair {
        int val1;
        int val2;

        Pair(int val1, int val2) {
            this.val1 = val1;
            this.val2 = val2;
        }
    }

    public static void main(String[] args) {

        int[][] grid = {
            {0, 2},
            {1, 3}
        };

        System.out.println(swimInWater(grid));
    }

    static int swimInWater(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int low = grid[0][0];
        int high = grid[0][0];

        // Find maximum value in grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                high = Math.max(high, grid[i][j]);
            }
        }

        // Binary search on time
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (bfs(grid, n, m, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    static boolean bfs(int[][] grid, int n, int m, int mid) {

        int[] x = {1, -1, 0, 0};
        int[] y = {0, 0, 1, -1};

        Queue<Pair> q = new LinkedList<>();

        int[][] visited = new int[n][m];

        // Starting cell must also be reachable
        if (grid[0][0] > mid) {
            return false;
        }

        q.add(new Pair(0, 0));
        visited[0][0] = 1;

        while (!q.isEmpty()) {

            Pair p = q.poll();

            int row = p.val1;
            int col = p.val2;

            if (row == n - 1 && col == m - 1) {
                return true;
            }

            for (int k = 0; k < 4; k++) {

                int r = row + x[k];
                int c = col + y[k];

                if (valid(r, c, n, m)
                        && visited[r][c] == 0
                        && grid[r][c] <= mid) {

                    q.add(new Pair(r, c));
                    visited[r][c] = 1;
                }
            }
        }

        return false;
    }

    static boolean valid(int r, int c, int n, int m) {
        return r >= 0 && r < n && c >= 0 && c < m;
    }
}
