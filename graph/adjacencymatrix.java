package graph;
public class adjacencymatrix {

    static class Graph {
        private int[][] matrix;
        private int vertices;

        Graph(int vertices) {
            this.vertices = vertices;
            matrix = new int[vertices][vertices];
        }

        // Add edge
        void addedges(int src, int dest) {
            matrix[src][dest] = 1;
            matrix[dest][src] = 1;
        }

        // Remove edge
        void removeedges(int src, int dest) {
            matrix[src][dest] = 0;
            matrix[dest][src] = 0;
        }

        // Check if edge exists
        boolean hasEdge(int u, int v) {
            return matrix[u][v] == 1;
        }

        // Print matrix
        void printmatrix() {
            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < vertices; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        Graph graph = new Graph(5);

        graph.addedges(0, 1);
        graph.addedges(0, 2);
        graph.addedges(1, 3);
        graph.addedges(2, 4);

        graph.printmatrix();

        System.out.println("Edge 0-2: " + graph.hasEdge(0, 2));

        graph.removeedges(0, 2);

        System.out.println("After removing edge 0-2:");
        graph.printmatrix();

        System.out.println("Edge 0-2: " + graph.hasEdge(0, 2));
    }
}