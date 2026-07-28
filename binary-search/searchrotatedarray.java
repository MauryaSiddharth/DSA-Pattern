// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class searchrotatedarray {
    public static void main(String[] args) {
        int [] nums  ={4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }
    static int search(int[] nums, int target){
        int low =0 ;
        int high = nums.length-1;
        int res = -1;
        while (low<=high){
            int mid = (low+high)/2;

            if(nums[mid]==target){
                return mid;
            }
            if(nums[low]<=nums[mid]){
                if(target>=nums[low] && target<=nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }

            }
            else{
                if(target<=nums[high] && target>=nums[mid]){
                    low = mid+1;
                }
                else{
                    high = mid+1;
                }

            }

           
        }
return -1;
    }
}
