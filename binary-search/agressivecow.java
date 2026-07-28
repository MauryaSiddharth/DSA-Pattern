import java.util.Arrays;

public class agressivecow {
    public static void main(String[] args) {
        int [] arr ={1,2,4,8,9};
        int k = 3;
        System.out.println(agressiveCows(arr, k));
    }
    static int agressiveCows(int [] arr, int k){
               Arrays.sort(arr);
        int low = 1;
        int n = arr.length;
       int high = arr[n - 1] - arr[0];
        int res = -1;
        while(low<=high){
            int mid =( low+high)/2;
            if(fun(arr, k, mid)){
                res=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
      return res;

    }
  static boolean fun(int[] arr, int k, int mid) {
    int cows = 1;
    int prevPos = arr[0];

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] - prevPos >= mid) {
            cows++;
            prevPos = arr[i];

            if (cows >= k) {
                return true;
            }
        }
    }

    return false;
}
    
}
