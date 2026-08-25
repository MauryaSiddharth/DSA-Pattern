package graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class networkdelay {
    static class Pair{
        int val1;
        int val2;
        Pair(int val1,int val2){
            this.val1= val1;
            this.val2 =val2;
        }
    }
    public static void main(String[] args) {
         int [][] times ={
            {2,1,1},
            {2,3,1},
            {3,4,1}
         };
         int n = 4;
         int k = 2;
         System.out.println(networkDelayTime(times, n, k));
    }

    static ArrayList<Integer>dijk(int[][] times, int n , int k){
        ArrayList<ArrayList<Pair>>a = new ArrayList<>();
         for(int i = 0 ; i<=n;i++){
            a.add(new ArrayList<>());
        }

        for(int i = 0; i < times.length;i++){
            int s = times[i][0];
            int d = times[i][1];
            int w = times[i][2];

            a.get(s).add(new Pair(d, w));
        }

        PriorityQueue<Pair> minHeap = new PriorityQueue<>((x,y)->Integer.compare(x.val1, y.val1));
        ArrayList<Integer>distance = new ArrayList<>();
       
        for(int i = 0; i <=n ;i++){
            distance.add( Integer.MAX_VALUE);
        }
          distance.set(k, 0);
          minHeap.add(new Pair(0,k));

          while (!minHeap.isEmpty()) {
            Pair p = minHeap.poll();
            int d = p.val1;
            int node= p.val2;
             if(d>distance.get(node)){  // purana value
                continue;
            }

          for(int j = 0; j <a.get(node).size();j++){
            int neigh = a.get(node).get(j).val1;
            int weight = a.get(node).get(j).val2;

            if(d+weight<distance.get(neigh)){
                distance.set(neigh, d+weight);
                minHeap.add(new Pair( d+weight,neigh));
            }

          }
            
          }
          return distance;
        
    }
     static int networkDelayTime(int[][] times, int n, int k) {

        ArrayList<Integer> ans = dijk(times, n, k);
         int max = Integer.MIN_VALUE;

         for(int i = 1; i < ans.size();i++){
            if(ans.get(i)>max){
                max=ans.get(i);
            }
            if(ans.get(i)==Integer.MAX_VALUE){
            return -1;
          }

         }

          
       return max;
        
    }
    
}
