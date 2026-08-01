import java.util.Collections;
import java.util.PriorityQueue;

public class kthsmallest{
    public static void main(String[] args) {
        int [] arr = {10,5,4,3,48,6,2,33,53,10};
        int k = 4;
        // System.out.println(kthSmallest(arr, k));
        System.out.println(kthSmallest2(arr, k));
    }

    //  brute force : sort the array and return k-1 index element
    static int kthSmallest(int [] arr ,int k){
        int ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i <arr.length;i++){
            pq.add(arr[i]);
        }

         for(int i = 0 ; i < k-1; i++){
            pq.poll();
         }

         ans = pq.peek();
          return ans;
        //   O(nlogn+klogn) complexity

    }

    //  optimized approach using max heap 
    static int kthSmallest2(int [] arr, int k){
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < k; i++){
            max.add(arr[i]);
        }

        for(int i = k ; i <arr.length;i++){
            if(arr[i]>=max.peek()){
                continue;
            }
            else{
                max.poll();
                max.add(arr[i]);
            }
        }
        return max.peek();
       
    }
   
}