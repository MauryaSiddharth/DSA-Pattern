public class findduplicatenumber {
    // https://leetcode.com/problems/find-the-duplicate-number/description/ 
    
    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};
        // System.out.println(duplicate(nums));      brute force
        System.out.println(optimized(nums));
    }
            //   brute force
    static int duplicate(int [] nums){
        for(int i =0;i<nums.length ;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
    

    //  optimized way by fast and slow pointer

    static int optimized(int [] nums){
        int slow = 0;
        int fast =0;
         while (true) {
            slow=nums[slow];
            fast=nums[fast];
            fast = nums[fast];

            if(slow==fast){
                System.out.println("cycle detected");

                slow=0;

                while(slow!=fast){
                    slow=nums[slow];
                    fast= nums[fast];


                }
                return slow;
            }
            
         }
       
    }
}
