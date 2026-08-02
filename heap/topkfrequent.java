import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Pair {
    int first;   // frequency
    int second;  // element

    Pair(int f, int s) {
        first = f;
        second = s;
    }
}

public class topkfrequent {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] ans = topKFrequent(nums, k);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }

    static int[] topKFrequent(int[] nums, int k) {

        // Count frequencies
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Min-heap based on frequency
        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(a.first, b.first));

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {

            int element = entry.getKey();
            int frequency = entry.getValue();

            Pair curr = new Pair(frequency, element);

            if (pq.size() < k) {
                pq.add(curr);
            } else if (curr.first > pq.peek().first) {
                pq.poll();
                pq.offer(curr);
            }
        }

        int[] res = new int[k];
        int idx = k - 1;

        while (!pq.isEmpty()) {
            res[idx--] = pq.poll().second;
        }

        return res;
    }
}

// complexity : nlogk
//  in heap item stored in formatof [ freq, chaarcter]