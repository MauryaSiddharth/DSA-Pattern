import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class primsalgo{
    static class Pair{
        int a;  // weight 
        int b;   // node
        Pair(int a, int b){
            this.a = a; 
            this.b = b;
        }
    }
public static void main(String[] args) {
    int [][] edges={
        {0,1,3},
        {1,2,4},
        {2,0,2}
    };
    int n =edges.length;
    
    System.out.println(mst(n, edges));
}
static int mst (int n , int [][]edges){

  ArrayList<ArrayList<Pair>> a = new ArrayList<>();
  for(int i = 0; i < n ;i++){
    a.add(new ArrayList<>());
  }
   for(int i = 0; i <edges.length;i++){
    int s = edges[i][0];
    int d = edges[i][1];
    int wt = edges[i][2];

    a.get(s).add(new Pair(d, wt));
    a.get(d).add(new Pair(s, wt));
   
   }
    PriorityQueue<Pair> minHeap = new PriorityQueue<>((x,y)->Integer.compare(x.a,y.a));
    ArrayList<Integer> visited = new ArrayList<>(Collections.nCopies(n, 0));

    minHeap.add(new Pair(0, 0));
    int sum = 0;
    while(!minHeap.isEmpty()){
        Pair p = minHeap.poll();
        int w = p.a;
        int node = p.b;

        if(visited.get(node)==1){
            continue;
        }
        visited.set(node,1);
        sum=sum+w;
        for(int j = 0; j < a.get(node).size();j++){
            int neigh = a.get(node).get(j).a;
            int wt = a.get(node).get(j).b;
            if(visited.get(neigh)==0){
                minHeap.add(new Pair(wt, neigh));
            }

    }
    
}
return sum ;
}
}