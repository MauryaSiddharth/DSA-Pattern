import java.util.Arrays;
//  we have to find two occurence first and last 
//  left side  mein first occurence
// right side me last occurence 
public class firstandlast {
    public static void main(String[] args) {
        int [] nums ={5,7,7,8,8,9};
        int target = 80;
        System.out.println(Arrays.toString(searchRange(nums, target)));
       
        
    }
   static int[] searchRange(int[] nums, int target) {
    int first = firstoccurence(nums, target);
    int last = lastoccurence(nums, target);

    return new int[]{first,last};
      


         
    }
    static int firstoccurence(int []nums, int target){
        int low = 0 ;
         int high =nums.length-1;
        int result = -1;
        while(low <= high){
            int mid = (low+high)/2;
            
            if(nums[mid]<target){
                low = mid+1;

            }
            else if(nums[mid]>target){
                high=mid-1;

            }
            else{
                result = mid;
                high=mid-1;
            }
        }
       return result;
    }

    static int lastoccurence(int [] nums , int target){
        int low =0;
         int high = nums.length-1;
        int result = -1;

        while(low <= high ){
            int  mid = (low+high)/2;
            if(nums[mid]<target){
                low = mid+1;
               
            }
            else if(nums[mid]>target){
                high = mid-1;
            }

            else{
                result = mid;
                low = mid+1;
            }
 
        }
        return result;
    }
}
