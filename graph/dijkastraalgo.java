package graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class dijkastraalgo {
    static class Pair{
        int val1;
        int val2;
        Pair(int val1,int val2){
            this.val1= val1;
            this.val2 =val2;
        }
    }
    public static void main(String[] args) {
        int V = 5;
        // [source, destination, weight]
        int[][] edges = {
            {0, 1, 4},
            {0, 2, 1},
            {2, 1, 2},
            {1, 3, 1},
            {2, 3, 5},
            {3, 4, 3}
        };
 int src = 0;
dijkastraalgo obj = new dijkastraalgo();

        ArrayList<Integer> result = obj.dijkstra(V, edges, src);

        System.out.println("Shortest distances from source " + src + ":");
        System.out.println(result);        
    }
    //  we have we given 3 value [src,dest,weight]
    public ArrayList<Integer> dijkstra(int V, int[][] edges, int src) {
        ArrayList<ArrayList<Pair>>a = new ArrayList<>();
        for(int i = 0 ; i <V;i++){
            a.add(new ArrayList<>());
        }

        for(int i = 0;i < edges.length;i++){
            int s = edges[i][0];
            int d = edges[i][1];
            int w = edges[i][2];
            a.get(s).add(new Pair(d,w));
            a.get(d).add(new Pair(s,w));
        }
PriorityQueue<Pair> minHeap = new PriorityQueue<>((x, y) -> x.val1 - y.val1);
     ArrayList<Integer> distance = new ArrayList<>();
           distance.add(0);
             for(int i = 1 ; i < V;i++){
                   distance.add(Integer.MAX_VALUE);
          }

         distance.set(src, 0);
         minHeap.add(new Pair(0,src));
        //   we storing in distance(wt)+node  in min heap

         while(!minHeap.isEmpty()){
            Pair p = minHeap.poll();
            int d = p.val1;  // d is distance
            int node = p.val2;

            if(d>distance.get(node)){  // purana value
                continue;
            }

            for(int j = 0; j <a.get(node).size();j++){
                int neigh = a.get(node).get(j).val1;
                int weight = a.get(node).get(j).val2;

                if(d+weight<distance.get(neigh)){
                    // distance.get(neigh)=d+weight;
                    distance.set(neigh, d+weight);
                    minHeap.add(new Pair(d+weight, neigh));
                }

            }

         }
      return distance;
        
    }
}
