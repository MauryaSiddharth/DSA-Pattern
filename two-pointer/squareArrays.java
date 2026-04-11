import java.util.Arrays;

public class squareArrays{
    // https://leetcode.com/problems/squares-of-a-sorted-array/description/  

    public static void main(String[] args) {
        // self
        int [] nums = {-4,-1,0,3,10};
System.out.println( Arrays.toString(sortedArrays(nums))); 
   }

    static  int [] sortedArrays(int [] nums){
        int [] result = new int [nums.length];
         
        for(int i=0;i< nums.length;i++){
            nums[i]= nums[i]*nums[i];
        }

        int head=0;
        int tail = nums.length-1;

        for (int pos=nums.length-1 ; pos>=0;pos--){
            if(nums[head]>nums[tail]){
                result[pos]= nums[head];
                head++;
            }
            else{
                result[pos]= nums[tail];
                tail--;
            }
            
        }
        return result;
    }
}