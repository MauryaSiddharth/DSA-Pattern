import java.util.ArrayList;

public class uniquepathm {

    public static void main(String[] args) {
        int m = 3;
        int n = 7;

        System.out.println(uniquepath(m, n));
    }

    static int uniquepath(int m, int n) {

        ArrayList<ArrayList<Integer>> dp = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            ArrayList<Integer> t = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                t.add(-1);
            }

            dp.add(t);
        }

        return fun(m, n, 0, 0, dp);
    }

    static int fun(int m, int n, int i, int j,
                   ArrayList<ArrayList<Integer>> dp) {

        // Outside the grid
        if (i >= m || j >= n) {
            return 0;
        }

        // Reached destination
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        // Already calculated
        if (dp.get(i).get(j) != -1) {
            return dp.get(i).get(j);
        }

        int down = fun(m,n, i + 1, j, dp);
        int right = fun(m, n, i, j + 1, dp);
        int ans = down+right;

        dp.get(i).set(j,ans);

        return ans;
    }
}