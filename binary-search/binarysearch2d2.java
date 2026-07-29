public class binarysearch2d2 {
    public static void main(String[] args) {
        int [] [] matrix = {
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,24},
            {18,21,23,26,30},
        };
        int target =5;
        System.out.println(searchMatrix(matrix, target));
        //  time complexity : O (n+m)
    }
    static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m =matrix[0].length;

        int row = n-1;
        int col = 0;

        while (row>=0 && col <m) {
            if(matrix[row][col]==target){
                return true;
            }

            if(matrix[row][col]> target){
                row--;
            }

            else{
                col++;
                
            }
            
        }

        return false;
        
    }
}
