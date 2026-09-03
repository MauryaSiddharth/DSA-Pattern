import java.util.ArrayList;

public class houserober{
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        System.out.println(rober(nums));
    }
    static int rober(int [] nums){
        int n = nums.length;
        ArrayList<ArrayList<Integer>>dp = new ArrayList<>(n);
        for(int i= 0; i < n ;i++) {
            ArrayList<Integer>t = new ArrayList<>(2);
             t.add(-1);
             t.add(-1);
             dp.add(t);
        }
        return fun(nums,0 , 1,dp);

    }
    static int  fun(int [] nums,int i , int free , ArrayList<ArrayList<Integer>>dp){
        if(i==nums.length){
            return 0;
        }
        if(dp.get(i).get(free)!=-1){
            return dp.get(i).get(free);
        }
        if(free==0){
            int ans = fun(nums,i+1,1,dp);
            dp.get(i).set(free,ans);
            return ans;
        }

        int c1 = nums[i]+fun(nums,i+1,0,dp);
        int c2 = fun(nums,i+1,1,dp);

        int ans = Math.max(c1,c2);
        dp.get(i).set(free,ans);

        return ans;
    }
}