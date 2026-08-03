import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class ipo2 {
    public static void main(String[] args) {
        int k = 2;
        int w = 0;
        int[] profits = {1, 2, 3};
        int[] capital = {0, 1, 1};
        System.out.println(findMaximizedCapital(k, w, profits, capital));
    }
     static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<int[] > minC = new PriorityQueue<>((a,b)-> a[0]-b[0]); //0 because we comparing capital 
        PriorityQueue<Integer> maxP = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < profits.length;i++){
            minC.offer(new int [] {capital[i], profits[i]});

        }

        while(k-->0){
            while(!minC.isEmpty() && minC.peek()[0]<=w){
                maxP.add(minC.poll()[1]);
            }

            if(maxP.isEmpty()){
                break;
            }

            w+=maxP.poll();
        }
return w;

}
}


// TC : O(n*logn)+o(k*logn)
// SC : O(n)