// https://www.geeksforgeeks.org/problems/perfect-sum-problem5633/1

import java.util.ArrayList;

public class countsubset {
    public static void main(String[] args) {
        int [] arr = {5,2,3,10,6,8};
        int target = 10;
        // System.out.println(perfectSum(arr, target));
        
    }
    static int perfectSum(int[] arr, int target) {
        int n = arr.length;
        // return fun(arr, target, 0, n);
        ArrayList<ArrayList<Integer>>dp = new ArrayList<>(n+1);
        for(int i = 0; i <=n ;i++){
            ArrayList<Integer>t = new ArrayList<>(target+1);
            for(int j = 0; j<=target;j++){
                t.add(-1);
            }
            dp.add(t);
        }
            
        return fun2(arr, target, 0,n, dp);
        
    }
                 // recursion way  
    static int fun(int [] arr, int target, int i , int n ){
        if(target==0){
            return 1;
        }
         if(i>=n){
            return 0;
        }
       
        int c1 =fun(arr, target-arr[i], i+1, n);
        int c2 = fun(arr, target, i+1, n);

        return c1+c2;
    }

                //  memoization
          
         static int fun2(int []arr, int target,int i ,int n, ArrayList<ArrayList<Integer>>dp){
            if(target==0){
                return 1;
            }
            if(i>=n){
                return 0;

            }

            if(dp.get(i).get(target)!=-1){
                return dp.get(i).get(target);
            }

              int max = 0;

           if (arr[i] > target) {
              dp.get(i).set(target, fun2(arr, target, i + 1, n, dp));
              return dp.get(i).get(target);
           }

            else{
                int c1 = fun2(arr, target-arr[i], i+1, n, dp);
                int c2 = fun2(arr,target,i+1,n,dp);
                 max = c1+c2;
            }
      
            dp.get(i).set(target, max);
            
             return max;

             
        
        }

        // tabulation way 

       
}
