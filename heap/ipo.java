import java.util.*;

public class ipo {

    public static void main(String[] args) {
        int k = 2;
        int w = 0;
        int[] profits = {1, 2, 3};
        int[] capital = {0, 1, 1};

        System.out.println(findMaximizedCapital(k, w, profits, capital));
    }

    static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

        int n = profits.length;

        // Store {capital, profit}
        int[][] project = new int[n][2];

        for (int i = 0; i < n; i++) {
            project[i][0] = capital[i];
            project[i][1] = profits[i];
        }

        // Sort by required capital
        Arrays.sort(project, Comparator.comparingInt(a -> a[0]));

        // Max Heap for profits
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int idx = 0;

        while (k > 0) {

            while (idx < n && project[idx][0] <= w) {
                pq.offer(project[idx][1]);
                idx++;
            }

            if (pq.isEmpty()) {
                return w;
            }

            w += pq.poll();
            k--;
        }

        return w;
    }
}

// Overall: O(n log n)
// Space: O(n)