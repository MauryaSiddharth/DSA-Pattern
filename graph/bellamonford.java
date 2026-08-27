package graph;

import java.util.ArrayList;

public class bellamonford {
    public static void main(String[] args) {
        int V= 5;
        int [][] edges={
            {1,3,2},
            {4,3,-1},
            {2,4,1},
            {1,2,1},
            {0,1,5},
        };
        int src = 0;
        System.out.println(bellamanFord(V, edges, src));
        
    }
 static ArrayList<Integer> bellamanFord(int V, int [][]edges, int src){
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> res2 = new ArrayList<>();

        for(int i = 0; i < 1; i++){
            res2.add(-1);
        }

        for(int i = 0; i < V; i++){
            res.add((int) 1e8);
        }

        res.set(src, 0);

        // V - 1 times relaxation
        for(int i = 0; i < V - 1; i++){
            for(int j = 0; j < edges.length; j++){
                int s = edges[j][0];
                int d = edges[j][1];
                int wt = edges[j][2];

                if(res.get(s) != (int)(1e8) &&  res.get(s) + wt<res.get(d) ){

                    res.set(d, res.get(s) + wt);
                }
            }
        }

        // One extra pass to check negative cycle
        for(int j = 0; j < edges.length; j++){
            int s = edges[j][0];
            int d = edges[j][1];
            int wt = edges[j][2];

            if(res.get(s) != (int)(1e8) &&  res.get(s) + wt<res.get(d)){

                return res2;
            }
        }

        return res;
    }
}
