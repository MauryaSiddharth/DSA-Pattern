// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

import java.util.Arrays;

public class minimumrotatedarray {
    public static void main(String[] args) {
        // int [] nums = {3,4,5,1,2};
        int [] nums= {11,13,14,15};
        // System.out.println(findMin(nums));
        System.out.println(findMin2(nums));

        
    }
    //   BRUTE FORCE

    //  static int findMin(int[] nums) {
    //     Arrays.sort(nums);
    //     return nums[0];  
    // }
    
    static int findMin2(int [] nums){
        int low = 0; int high = nums.length-1;
        int result = 0;
        while(low<=high){
            int mid = (low+high)/2;

            if(nums[mid]>nums[nums.length-1]){
                low = mid+1;
            }
            else{
                result = nums[mid];
                high = mid-1;
            }
        }
        return result;
    }
}
