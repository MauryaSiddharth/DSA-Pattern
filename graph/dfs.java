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