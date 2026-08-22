

import java.util.ArrayList;
import java.util.Collections;

public class cycleundirected {
    static boolean cycle= false;
    public static void main(String[] args) {
        int  V = 4;
        
    int[][] edges = {
        {0, 1},
        {1, 2},
        {2, 3},
        {3, 0}
    };

    boolean ans = isCycle(V, edges);
    System.out.println(ans);
        
    }
     static boolean isCycle(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> a= new ArrayList<>();
        for(int i = 0; i <V ; i++){
            a.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.length;i++){
            int src = edges[i][0];
            int des= edges[i][1];
            a.get(src).add(des);
            a.get(des).add(src);
        }

         ArrayList<Boolean> visited = new ArrayList<>(
                Collections.nCopies(V, false)
        );
        for(int i = 0; i<V;i++){
            if(!visited.get(i)){
                dfs(a,V,i,-1,visited);

            }
            

        }  
        return cycle;

        
    }
    static void dfs(ArrayList<ArrayList<Integer>>a, int V , int node, int parent, ArrayList<Boolean>visited){
       visited.set(node, true);
        for(int j = 0; j<a.get(node).size();j++){
            int neigh = a.get(node).get(j);
            if(visited.get(neigh) && neigh!= parent){
                cycle = true;
            }

            if(!visited.get(neigh)){
                dfs(a,V ,neigh,node,visited);
            }
       
        }
    }
    
}
