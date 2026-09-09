import java.util.ArrayList;

public class targetsum {
    public static void main(String[] args) {
        int [] nums={1,1,1,1,1};
        int target = 3;
        System.out.println(findTargetSumWays(nums, target)); 
        
    }
     static int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum =0;
        for(int i = 0;i<n;i++){
            sum+=nums[i];
        }
       
         if(Math.abs(target)>sum){
            return 0;
        }
        if((sum+target)%2!=0){
            return 0;
        }

         int total = (sum+target)/2;
       

        ArrayList<ArrayList<Integer>>dp = new ArrayList<>(n+1);
        for(int i = 0;i<=n;i++){
            ArrayList<Integer>t = new ArrayList<>();
            for(int j = 0;j<=total;j++){
                t.add(-1);
            }
            dp.add(t);

        }


        return fun(nums,total,0,n,dp );
        
    }
    static int fun(int[] nums,int total, int i , int n ,ArrayList<ArrayList<Integer>>dp){
          if(i>=n){
            if(total==0){
                return 1;
            }
            return 0;
          }

         if(dp.get(i).get(total)!=-1){
            return dp.get(i).get(total);
         }
         
         int max = 0;
         
         if(nums[i]>total){
           int c2 = fun(nums, total, i+1, n, dp);
           dp.get(i).set(total,c2);
           return c2;
         }
         else{
            int c1 = fun(nums, total-nums[i], i+1, n, dp);
            int c2 = fun(nums, total, i+1, n, dp);
            max=c1+c2;
         }
               dp.get(i).set(total,max);
         return max;
    }

    
}
// TC:O(n*total);