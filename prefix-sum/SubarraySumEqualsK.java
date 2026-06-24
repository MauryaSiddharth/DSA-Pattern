import java.util.HashMap;
// https://www.perplexity.ai/search/5379e206-68a2-4bac-96b1-6bec3bd32728 

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int k = 2;

        System.out.println(subarraySum(arr, k));
    }

    static int subarraySum(int[] arr, int k) {
        int sum = 0;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            int needed = sum - k;

            if (map.containsKey(needed)) {
                count += map.get(needed);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}