import java.util.*;
public class ThreeSumClosest{
  public static void main(String[] args) {
       int [] nums = {-1,2,1,-4};
       int target= 1;
       System.out.println(threeSumClosest(nums, target));

  }
//    time complexity o (n^2) and space complexity o(1)    
        //   this is optimal approach
   static int threeSumClosest(int [] nums ,int target){
           Arrays.sort(nums);
        int maxDiff= Integer.MAX_VALUE;
        int result_sum=0;
    for(int i=0;i<nums.length-2;i++){
        int left =i+1;
        int right = nums.length-1;
           
        while(left<right){
            int sum = nums[i]+nums[left]+nums[right];
            int diff = Math.abs(sum-target);
             if(diff<maxDiff){
                maxDiff=diff;
                result_sum=sum;
             }
             if(sum==target){
                return sum;
             }
             else if (sum >target){
               right--;
             }
             else{
               left++;
             }
        }
      
    }
        return result_sum;
   }
}