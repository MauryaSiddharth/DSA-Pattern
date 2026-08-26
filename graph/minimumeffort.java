// https://leetcode.com/problems/path-with-minimum-effort/

import java.util.ArrayList;
import java.util.PriorityQueue;

public class minimumeffort{
    //  we can do via dp also
    static class tuple{
        int distance;
        int row ;
        int col;
        tuple(int distance, int row, int col){
          this.distance=distance;
          this.row = row;
          this.col = col;
        }
    }
    public static void main(String[] args) {
        int [] [] heights={
            {1,2,3},
            {3,8,4},
            {5,3,5},
        };
        System.out.println(fun(heights));
        
    }
    static int fun(int [][] heights){
        int n = heights.length;
        int m = heights[0].length;
        int[][] dist = new int[n][m];
        PriorityQueue<tuple> pq = new PriorityQueue<>((x,y)->x.distance-y.distance);
        for(int i= 0; i < n ;i++){
            for(int j = 0; j < m ;j++){
                dist[i][j]=(int)(1e9); //dist[i][j] = (int)(1e9); initializes the distance between two nodes in a graph to a very large number representing infinity.
            }
        }
        dist[0][0]= 0;
        pq.add(new tuple(0, 0, 0));
        int dr[]= {-1,0,1,0};
        int dc[] = {0,1,0,-1};
        
        while(pq.size()!=0){
            tuple it = pq.poll();
            int diff = it.distance;
            int row = it.row;
            int col = it.col;

            if(row==n-1 && col==m-1) return diff;

            for(int i = 0; i <4;i++){
                int newr = row+dr[i];
                int newc= col+dc[i];

                if(newr>=0 && newc>=0 && newr<n && newc<m){
                    int newEffort = Math.max(Math.abs(heights[row][col]-heights[newr][newc]),diff);

                    if(newEffort<dist[newr][newc]){
                        dist[newr][newc]= newEffort;
                        pq.add(new tuple(newEffort,newr,newc ));
                    }
                }
            }
        }
        
        return 0;
                        
    }
}