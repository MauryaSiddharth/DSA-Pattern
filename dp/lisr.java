// longest increase subsequence recursion
public class lisr{
    public static void main(String[] args) {
        int [] nums={4,1,2,5};
        System.out.println(length(nums));

    }
    static int  length(int [] nums){
        int n = nums.length;
        return fun(nums, 0, n, -1);
        

    }
    static int fun(int[] nums,int i ,int n,int prev){
        if(i==n){
            return 0;
        }
        if(prev==-1 || nums[i]>nums[prev]){
            int c1 = 1+fun(nums, i+1, n, i);
            int c2 = fun(nums, i+1, n, prev);
            return Math.max(c1,c2);
        }
           return fun(nums, i+1, n, prev);
    }
}