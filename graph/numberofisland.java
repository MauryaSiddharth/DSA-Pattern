package graph;

public class numberofisland {

    static int[] x = {-1, 1, 0, 0};
    static int[] y = {0, 0, -1, 1};

    public static void main(String[] args) {

        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };

        System.out.println(numIslands(grid));
    }

    static int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];

        int res = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == '1' && !visited[i][j]) {
                    dfs(grid, n, m, i, j, visited);
                    res++;
                }
            }
        }

        return res;
    }

    static void dfs(char[][] grid, int n, int m, int i, int j, boolean[][] visited) {

        visited[i][j] = true;

        for (int k = 0; k < 4; k++) {

            int row = i + x[k];
            int col = j + y[k];

            if (valid(row, col, n, m)
                    && grid[row][col] == '1'
                    && !visited[row][col]) {

                dfs(grid, n, m, row, col, visited);
            }
        }
    }

    static boolean valid(int i, int j, int n, int m) {

        return i >= 0 && i < n && j >= 0 && j < m;
    }
}

// Time Complexity: O(n × m) because each cell is visited at most once.
// Space Complexity: O(n × m) for the visited array plus up to O(n × m) recursion stack in the worst case (if the entire grid is one large island).

// package graph;

// import java.util.List;

// public class numberofisland{
//     public static void main(String[] args) {
//         char [] [] grid ={
//             {'1','1','1','1','0'},
//             {'1','1','0','1','0'},
//             {'1','1','0','0','0'},
//             {'0','0','0','0','0'}
//         };
        
//     }
//      static int[] x = {-1, 1, 0, 0};
//     static int[] y = {0, 0, -1, 1};
//      static int numIslands(char[][] grid) {
//         int n = grid.length;
//         int m = grid[0].length;
//         int res = 0;
//         int i ,j;
//         List<List<Boolean>>visited = n;
//         for(int i = 0; i<n;i++){
//             List<Boolean>t = new Boolean(false);
//             visited[i]=true;
//         }
//         for(int i = 0;i<n;i++){
//             for(int j = 0;j<m;j++){
//                 if(grid[i][j]=='1' && visited[i][j]==0){
//                     dfs(grid, n, m, i, j, visited);
//                     res++;

//                 }
//             }
//         }
//         return res;
        
//     }
   

//     static void dfs(char[][] grid , int n , int m , int i , int j , List<List<Boolean>>visited){
//         visited[i][j]=1;
//         for(int k =0;k<4;k++){
//             int row = i+x[k];
//             int col = j+y[k];
//         }
//         if(valid(i, j, n, m)&& grid[row][col]=='1' && visited[row][col]==0){
//             dfs( grid, n, m, row, col,visited);

//         }
//         return;

//     }
//     static boolean valid(int i,int j,int n , int m ){
//         if(i<0||i>=n ||j<0||j>=m){
//             return false;
//         }
//         return true;

//     }
// }

// // Tc n*m
// // sc: n*m