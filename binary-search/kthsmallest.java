public class kthsmallest {
    public static void main(String[] args) {
        // https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/
        // revise this 
        int [] [] matrix ={
            {1,5,9},
            {10,11,13},
            {12,13,15}
        };
        int k =8;
        System.out.println(kthSmallest(matrix, k));
    }
    static int kthSmallest(int[][] matrix, int k) {
        int n= matrix.length;
        int m = matrix[0].length;
        int low = matrix[0][0];
        int high = matrix[n-1][m-1];
        int res = -1;

        while(low<=high){
           int mid = (low+high)/2;
           
           int ans = countk(matrix, n, m, mid);

           if(ans<k){
            low = mid+1;
           }
           else{
            res=mid;
            high= mid-1;
           }
        }
        return res;

        
    }
    static int countk(int [][] matrix ,int n , int m, int mid){
       int row = n-1;
       int col  =0;
       int count =0;
       while(row >=0 && col <m){
        if(matrix[row][col]<=mid){
            count = count+row+1;
            col++;
        }
        else{
            row--;
        }

       }
       return count;
    }
    
}
