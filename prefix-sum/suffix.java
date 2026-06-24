import java.util.ArrayList;

public class suffix {
    public static void main(String[] args) {
        int[] arr = {10, 6, 3, 2, 1};

        ArrayList<Integer> sufSum = suffixSum(arr);

        for (int i = 0; i < sufSum.size(); i++) {
            System.out.print(sufSum.get(i) + " ");
        }
    }

    static ArrayList<Integer> suffixSum(int[] arr) {
        int n = arr.length;

        ArrayList<Integer> sufSum = new ArrayList<>();

        sufSum.add(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            sufSum.add(sufSum.get(sufSum.size() - 1) + arr[i]);
        }

        return sufSum;
    }
}