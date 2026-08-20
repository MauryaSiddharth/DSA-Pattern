package graph;

import java.util.ArrayList;

public class cycledirected {

    static boolean cycle = false;

    public static void main(String[] args) {

        int n = 5;

        ArrayList<ArrayList<Integer>> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(new ArrayList<>());
        }

        // 0 -> 1
        a.get(0).add(1);

        // 1 -> 2
        a.get(1).add(2);

        // 2 -> 3
        a.get(2).add(3);

        // 3 -> 4
        a.get(3).add(4);

        // 4 -> 1
        // This creates a cycle: 1 -> 2 -> 3 -> 4 -> 1
        a.get(4).add(1);

        ArrayList<Boolean> path = new ArrayList<>();
        ArrayList<Boolean> vis = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            path.add(false);
            vis.add(false);
        }

        for (int i = 0; i < n; i++) {
            if (!vis.get(i)) {
                dfs(a, i, path, vis);
            }
        }

        if (cycle) {
            System.out.println("Cycle exists");
        } else {
            System.out.println("Cycle does not exist");
        }
    }

    static void dfs(ArrayList<ArrayList<Integer>> a, int node,
                    ArrayList<Boolean> path, ArrayList<Boolean> vis) {

        vis.set(node, true);
        path.set(node, true);

        for (int j = 0; j < a.get(node).size(); j++) {

            int neigh = a.get(node).get(j);

            if (vis.get(neigh) && path.get(neigh)) {
                cycle = true;
                return;
            }

            if (!vis.get(neigh)) {
                dfs(a, neigh, path, vis);
            }
        }

        path.set(node, false);
    }
}