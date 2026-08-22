
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class shortestpath {
    static class pair{
        int src;
        int val;
        pair(int src,int val){
            this.src = src;
            this.val=val;

        }
    }
    public static void main(String[] args) {
        int [][] edges = {
            {0,1},
            {0,3},
            {1,2},
            {3,4},
            {4,5},
            {2,6},
            {5,6},
            {6,7},
            {6,8},
            {7,8}

        };
        int V = 9;
        int src = 0;

        System.out.println(fun(edges, V, src));
        
    }

    static ArrayList<Integer>fun(int [][]edges,int n, int src){
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        
        for(int i = 0; i < n;i++){
            a.add(new ArrayList<>());
        }
        for(int i =0; i<edges.length;i++){
            int s = edges[i][0];
            int d = edges[i][1];

            a.get(s).add(d);
            a.get(d).add(s);       
        }

        ArrayList<Integer>res = new ArrayList<>(Collections.nCopies(n,-1));
        ArrayList<Integer> visited = new ArrayList<>(Collections.nCopies(n, 0));
        Queue<pair> q = new LinkedList<>();
         q.add(new pair(src, 0));
         visited.add(src, 1);
         while(!q.isEmpty()){
          pair p = q.poll();
            int node = p.src;
            int distance= p.val;
            res.set(node, distance);
             for(int j = 0 ; j < a.get(node).size();j++){
            int neigh = a.get(node).get(j);

            if(visited.get(neigh)==0){
                q.add(new pair(neigh, distance+1));
                visited.set(neigh ,1);
            }
         }
         }
        
  return res;
    }
}
