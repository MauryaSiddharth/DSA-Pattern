package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    public static void main(String[] args) {
        int v =5;

        ArrayList<ArrayList<Integer>>graph = new ArrayList<>();

        for(int i = 0; i <v;i++){
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(2);
        graph.get(0).add(3);
        graph.get(0).add(1);

        graph.get(2).add(0);
        graph.get(2).add(4);

        graph.get(3).add(0);
        graph.get(1).add(0);

        graph.get(4).add(2);

        bfs(0, graph);
        
    }
    static void bfs(int start,ArrayList<ArrayList<Integer>>graph){
        boolean [] visited = new boolean[graph.size()];

        Queue<Integer> q = new LinkedList<>();

        //  start node ko queue me dalo ;
        q.add(start);
        visited[start]=true;

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node+" ");

            for(int neighbour:graph.get(node)){
                 if(!visited[neighbour]){
                    visited[neighbour]=true;
                    q.add(neighbour);
                 }
            }
            
        }
    }
}
