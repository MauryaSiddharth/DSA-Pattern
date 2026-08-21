// https://leetcode.com/problems/is-graph-bipartite/description/

import java.util.ArrayList;

// import graph.dfs;

public class bipartitegraph {
    public static void main(String[] args) {
        int [] [] graph ={
            {1,2,3},
            {0,2},
            {0,1,3},
            {0,2}
        };
        System.out.println(isBipartite(graph));
        
    }
       static int color = 0 |1;
    static boolean res = true;
      static  boolean isBipartite(int[][] graph) {       
        int node = graph.length;
        ArrayList<Integer>colors = new ArrayList<>();
        for(int i = 0;i < node;i++){
            colors.add(-1);
        }
       
        for(int i = 0; i <node ;i++){
            if(colors.get(i)==-1){
                dfs(graph , i , 0,colors);
              
            }
        }
        return res;

            
    }
 

    static void dfs(int [] [] graph,int node , int color,ArrayList<Integer> colors ){ 
           colors.set(node, color);
        for(int j = 0 ; j <graph[node].length;j++){
            int neigh = graph[node][j];
            if(colors.get(neigh)!=-1 && colors.get(neigh)==color){
                res =false;

            }
           
            else if(colors.get(neigh)==-1){
                dfs(graph,neigh,1-color,colors);
            }
            
        }


          return ;
    }
    
}
