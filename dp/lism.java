//  longest increasing subsequence memoization(dp)

import java.util.ArrayList;

public class lism {
    public static void main(String[] args) {
        int [] nums={4,1,2,5};
        System.out.println(length(nums));
        
    }
    static int length(int[] nums){
       int n = nums.length;
       ArrayList<ArrayList<Integer>>dp = new ArrayList<>(n);
       for(int i = 0; i<n;i++){
        ArrayList<Integer>t = new ArrayList<>();
        for(int j = 0;j<=n;j++){
            t.add(-1);
        }
        dp.add(t);
       }
        return fun(nums,0,n,-1,dp);
    }
    static int fun(int[] nums, int i , int n , int prev,ArrayList<ArrayList<Integer>>dp){
        if(i==n){
            return 0;
        }
        // prev = -1 is stored at column 0
        // prev = 0  is stored at column 1
        // prev = 1  is stored at column 2
        int col = prev+1;
        if(dp.get(i).get(col)!=-1){
            return dp.get(i).get(col);
        }
        int ans =0;
        if(prev==-1|| nums[i]>nums[prev]){
            int c1 = 1+ fun(nums, i+1, n, i, dp);
            int c2 = fun(nums,i+1,n,prev,dp);
           ans = Math.max(c1,c2);
            dp.get(i).set(col,ans);
           return ans;

        }
             
        ans =  fun(nums, i+1, n, prev, dp);
        dp.get(i).set(col,ans);
        return ans;


    }
}
