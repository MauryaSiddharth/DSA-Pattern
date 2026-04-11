// https://leetcode.com/problems/max-consecutive-ones-iii/description/ 
public class maxconsecutiveone {
    public static void main(String[] args) {
        int [] nums  = {1,1,1,0,0,0,1,1,1,1,0};
        int k =2;
        System.out.println(longestOnes(nums,k));
        
    }

     static int longestOnes(int [] nums , int k ){
         int low =0;
         int maxWindow =0;
         int zeroCount =0;
         for (int high =0; high < nums.length;high++){
            if (nums[high]==0){
                zeroCount++;
            }

             while(zeroCount>k){
                if(nums[low]==0){
                    zeroCount--;
                }
                low++;
                
                
             }
            maxWindow= Math.max(maxWindow, high-low+1);
         }
         return maxWindow;
     }
}
