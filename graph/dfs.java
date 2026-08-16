package graph;

import java.util.ArrayList;
import java.util.Collections;

public class dfs {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = 5;
        for(int i = 0; i < n ;i++){
            adj.add(new ArrayList<>());
        }
     adj.get(0).add(1);
adj.get(0).add(2);

adj.get(1).add(3);

adj.get(2).add(4);
System.out.println(dfss(adj));

    }

    static ArrayList<Integer> dfss(ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> res = new ArrayList<>();

        int n = adj.size();

        ArrayList<Boolean> visited = new ArrayList<>(
                Collections.nCopies(n, false)
        );

        dfs(adj, 0, res, visited);

        return res;
    }

    static void dfs(
            ArrayList<ArrayList<Integer>> adj,
            int node,
            ArrayList<Integer> res,
            ArrayList<Boolean> visited) {

        res.add(node);
        visited.set(node, true);

        // loop over neighbours
        for (int i = 0; i < adj.get(node).size(); i++) {

            int neighbour = adj.get(node).get(i);

            if (!visited.get(neighbour)) {
                dfs(adj, neighbour, res, visited);
            }
        }
    }
}

// 
// import java.util.*;

// public class Main {

//     static void dfs(int node, boolean[] visited, List<List<Integer>> graph) {

//         // Mark current node as visited
//         visited[node] = true;

//         // Print it
//         System.out.print(node + " ");

//         // Visit all its neighbors
//         for (int neighbor : graph.get(node)) {
//             if (!visited[neighbor]) {
//                 dfs(neighbor, visited, graph);
//             }
//         }
//     }

//     public static void main(String[] args) {

//         int n = 5;

//         List<List<Integer>> graph = new ArrayList<>();

//         for (int i = 0; i < n; i++) {
//             graph.add(new ArrayList<>());
//         }

//         // Edges
//         graph.get(0).add(1);
//         graph.get(0).add(2);
//         graph.get(1).add(3);
//         graph.get(1).add(4);

//         boolean[] visited = new boolean[n];

//         dfs(0, visited, graph);
//     }
// }