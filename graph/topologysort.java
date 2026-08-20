import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class topologysort{
    public static void main(String[] args) {
        int v = 4;
        int [][] edges = {
            {3,0},
            {1,0},
            {2,0}
        };
        System.out.println( topoSort(v, edges));
        
    }
    static ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
      ArrayList<Integer>indegree = new ArrayList<>();
      
        ArrayList<Integer> res = new ArrayList<>();
      for(int i = 0; i <V ; i++){
            a.add(new ArrayList<>());
            indegree.add(0);
        }

        for(int i = 0;i<edges.length;i++){
            int src = edges[i][0];
            int des = edges[i][1];
            a.get(src).add(des); 
           indegree.set(des, indegree.get(des)+1);
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i <V;i++){
            if(indegree.get(i)==0){
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int node = q.poll();
            res.add(node);

            for(int j = 0; j<a.get(node).size();j++){
                int neigh = a.get(node).get(j);
                indegree.set(neigh, indegree.get(neigh) - 1);
                 if(indegree.get(neigh)==0){
                q.add(neigh);
            }
            }
           
            
        }
        return res;
        
    }
}