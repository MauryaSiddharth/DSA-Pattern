import java.util.ArrayList;

public class partitionequalsum{
    public static void main(String[] args) {
        int [] nums ={1,5,11,5};
        // System.out.println(canPartition(nums));
        System.out.println(dpm(nums));
        
    }
    //  recursive way 
     static  boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum =0;
        for(int i = 0; i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        int s1 = sum/2;

          return fun( nums,s1,0,n);
        
    }
    static boolean fun(int[] nums, int s1,int i , int n){
        if(s1==0){
            return true;
        }
        if(i>=n){
            return false;
        }

        boolean c1 = fun(nums,s1-nums[i],i+1,n);
        boolean c2 = fun(nums, s1, i+1, n);

        return c1||c2;
    }

    
                            //   dp memoization way 
    // dp[i][s1]
    // -1 = not calculated
    //  0 = false
    //  1 = true
    static boolean dpm(int [] nums){
        int n = nums.length;
         int sum =0;
        for(int i = 0; i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        int s1 = sum/2;
        ArrayList<ArrayList<Integer>> dp = new ArrayList<>(n+1);
        for(int i = 0; i <=n ;i++){
            ArrayList<Integer>t = new ArrayList<>(s1+1);
            for(int j =0;j<=s1;j++){
                t.add(-1);
            }
            dp.add(t);
        }

        return fun2(nums, s1 , 0 , n,dp);

    }
    static boolean fun2(int [] nums,int s1,int i , int n ,ArrayList<ArrayList<Integer>>dp){
        if(s1==0){
            return true;
        }
        if(i>=n){
            return false;
        }
        if(dp.get(i).get(s1)!=-1){
            return dp.get(i).get(s1)==1;
        }
        boolean c1;
        boolean c2;
        if(nums[i]>s1){
            c1 = false;
            c2 = fun2(nums, s1, i+1, n, dp);
        }else{
             c1 = fun2(nums, s1-nums[i], i+1, n, dp);
             c2 = fun2(nums, s1, i+1, n, dp);

        }
        boolean ans = c1||c2;
        dp.get(i).set(s1,ans?1:0);
        return ans;

    }
 }