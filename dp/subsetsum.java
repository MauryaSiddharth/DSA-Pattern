import java.util.ArrayList;

public class subsetsum {
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;

        System.out.println(isSubsetSum(arr, sum));
    }

    static boolean isSubsetSum(int[] arr, int sum) {
        int n = arr.length;
      
        // return fun(arr, sum, n);
        ArrayList<ArrayList<Integer>> dp = new ArrayList<>(n + 1);

        for (int i = 0; i <= n; i++) {
            ArrayList<Integer> t = new ArrayList<>(sum + 1);

            for (int j = 0; j <= sum; j++) {
                t.add(-1);
            }

            dp.add(t);
        }

        return dp(arr, sum, 0, n, dp);
    }

    // Recursion way
    static boolean fun(int[] arr, int sum, int i) {
        if (sum == 0) {
            return true;
        }

        if (i == arr.length) {
            return false;
        }

        if (arr[i] > sum) {
            return fun(arr, sum, i + 1);
        }

        boolean y = fun(arr, sum - arr[i], i + 1);
        boolean k = fun(arr, sum, i + 1);

        return y || k;
    }

    // DP way  (memoization)
    static boolean dp(int[] arr, int sum, int i, int n,
                      ArrayList<ArrayList<Integer>> dp) {

        if (sum == 0) {
            return true;
        }

        if (i == n) {
            return false;
        }

        if (dp.get(i).get(sum) != -1) {
            return dp.get(i).get(sum) == 1;
        }

        boolean result;

        if (arr[i] > sum) {
            result = dp(arr, sum, i + 1, n, dp);
        } else {
            boolean c1 = dp(arr, sum - arr[i], i + 1, n, dp);
            boolean c2 = dp(arr, sum, i + 1, n, dp);

            result = c1 || c2;
        }

        dp.get(i).set(sum, result ? 1 : 0);

        return result;
    }
    
}
