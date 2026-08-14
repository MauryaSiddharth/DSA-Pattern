package graph;

import java.util.ArrayList;

public class adjacencylist {
    public static void main(String[] args){
        
        int vertices = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i<vertices;i++){
            graph.add(new ArrayList<>());
        }
        //    add edges
        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(0);
        graph.get(1).add(3);

        graph.get(2).add(0);
        graph.get(2).add(4);

        graph.get(3).add(1);
        graph.get(3).add(2);

        //  print graph
        for(int i =0 ;i < vertices;i++){
            System.out.print(i + "->");

            for(int node:graph.get(i)){
                System.out.print(node+" ");
            }
            System.out.println();
        }

    }
    
}

// For an undirected graph, add both directions:
// graph.get(0).add(1);
// graph.get(1).add(0);

//  for directed graph  
//    -> only addd the directed graph