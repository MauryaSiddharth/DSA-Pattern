import java.util.ArrayList;

public class tabulationknap {

    public static void main(String[] args) {
        int W = 8;
        int[] val = {5, 2, 4};
        int[] wt = {4, 5, 3};

        System.out.println(tabulationknapsack(W, val, wt));
    }

    static int tabulationknapsack(int W, int[] val, int[] wt) {
        int n = val.length;

        ArrayList<ArrayList<Integer>> dp = new ArrayList<>(n + 1);

        // Create (n+1) rows, each having (W+1) elements initialized to 0
        for (int i = 0; i <= n; i++) {
            ArrayList<Integer> t = new ArrayList<>(W + 1);

            for (int j = 0; j <= W; j++) {
                t.add(0);
            }

            dp.add(t);
        }

        // Bottom row is already initialized to 0

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= W; j++) {

                if (j < wt[i]) {
                    dp.get(i).set(j, dp.get(i + 1).get(j));
                } else {
                    dp.get(i).set(
                        j,
                        Math.max(
                            val[i] + dp.get(i + 1).get(j - wt[i]),
                            dp.get(i + 1).get(j)
                        )
                    );
                }
            }
        }

        return dp.get(0).get(W);
    }
}
