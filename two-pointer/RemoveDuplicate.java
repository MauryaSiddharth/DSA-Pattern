// https://leetcode.com/problems/remove-duplicates-from-sorted-array/ 

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
         int [] nums= {1,1,1,2,2,3,4};
            System.out.println((duplicate(nums)));
        }

    public static int duplicate(int [] nums){
        int i=0;
        int j=1;
        int unique=1;
         int length=nums.length;
         while(j<length){
        if(nums[j]==nums[i]){
            j++;
        }
        else{
            nums[i+1]=nums[j];
            i++;
            j++;
            unique++;
            
        }

         }
    return unique;
    }
}
  
