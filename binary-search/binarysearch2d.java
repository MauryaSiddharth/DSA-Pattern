public class binarysearch2d {
    public static void main(String[] args) {
        int [] [] matrix = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }

    static boolean searchMatrix(int [][] matrix , int target){
        int low = 0;
        int high = matrix.length-1;
        int row = 0;
        int res =-1;

        while(low<=high){
            int mid = (low+high)/2;
             if(matrix[mid][0]<=target){
                row = mid;
                low= mid+1;
             }
             else{
                high=mid-1;
             }

        }

        int low2= 0;
        int high2=matrix[row].length-1;

        while(low2<=high2){
            int mid = (low2+high2)/2;

            if(matrix[row][mid]==target){
                return true;
            }

            if(matrix[row][mid]<=target){
                res=mid;
                low2=mid+1;
            }
            else{
                high2 = mid-1;
            }
        }

        if(res==-1){
            return false;
        }

        return true;


    }
     
    // static boolean searchMatrix(int [][] matrix ,int target){
    //     for(int i = 0;i <matrix.length;i++){
    //         for(int j=0; j <matrix[i].length ;j++){
    //             if(matrix[i][j]==target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    
    // }
    
}
