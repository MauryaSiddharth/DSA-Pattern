import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// for simple testcases remove the duplicate logic 
  
public class Foursums {
    public static void main(String[] args) {
         int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(fourSum(nums, target));
    }

    static List<List<Integer>> fourSum(int[] nums, int target) {
      List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) return result;
        Arrays.sort(nums);

         for(int start=0;start<nums.length-3;start++){
               if (start > 0 && nums[start] == nums[start - 1]) continue;
            for(int end = start+1;end<nums.length-2;end++){
                    if (end > start + 1 && nums[end] == nums[end - 1]) continue;
                int left = end+1;
                int right = nums.length-1;

                while(left<right){
                    int sum = nums[left]+nums[right]+nums[start] + nums [end];

                    if(sum== target){
                        result.add(Arrays.asList(nums[left],nums[right],nums[start],nums[end]));
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    }

                    if(sum<target){
                        left++;
                    }

                    if(sum >target){
                        right--;
                    }
                }
                
            }

         }

return result;
    }
}
