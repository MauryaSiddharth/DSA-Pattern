import java.util.PriorityQueue;

public class kthsmallest{
    public static void main(String[] args) {
        int [] arr = {10,5,4,3,48,6,2,33,53,10};
        int k = 4;
        System.out.println(kthSmallest(arr, k));
        
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

    }
   
}