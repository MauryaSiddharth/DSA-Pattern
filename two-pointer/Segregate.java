import java.util.Arrays;

public class Segregate {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        segregated(arr);
        System.out.println(Arrays.toString(arr)); 
    }

    static void segregated(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
          
            if (arr[low] == 1 && arr[high] == 0) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
          
            else if (arr[low] == 1) {
                low++;
            }
           
            else if (arr[high] == 0) {
                high--;
            }
        }
    }
}