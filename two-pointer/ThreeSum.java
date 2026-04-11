// https://leetcode.com/problems/3sum/description/
import java.util.*;
public class ThreeSum {
    public static void main(String[] args) {
        int [] arr = {-1,0,1,2,-1,-4};
              System.out.println(threeSum(arr));
            
      
        
    }  
    //  using hashset  (Better approach)  not optimal one
    // time complexity : o(n^2)
    // spacee complexity : o(n^2)
    
    public static List<List<Integer>>threeSum (int[] arr){
        if(arr== null || arr.length<3) return new ArrayList<>();
           Arrays.sort(arr);
             Set<List<Integer>> result = new HashSet<>();
              
             for(int i =0;i<arr.length-2;i++){
                  int left = i+1;
                int right = arr.length-1;

                  while(left<right){
                int sum = arr[i]+arr[left]+arr[right];

                if(sum==0){
                    result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                }

               else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
               
             }


             }
                 return new ArrayList<>(result);

    }

      
}
                            //    optimal way to use  is using two pointer
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // skip duplicate i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // skip duplicate left
                    while (left < right && nums[left] == nums[left - 1]) left++;

                    // skip duplicate right
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }

                else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}