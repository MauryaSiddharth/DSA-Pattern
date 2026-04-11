public class minwindow {
    // same as minimum subarraylen.java code

    public static void main(String[] args) {
        int [] nums = {2,3,1,2,4,3};
        int target =7;
        System.out.println(minsize(nums, target));
    }
    static int minsize(int [] nums ,int target){
          int low =0;
          int sum =0;
          int minLength = Integer.MAX_VALUE;  // AGAR MINIMUM VALUE DENE HAI TOH HAME MAX VALUE LENA HOGA

          for(int high =0;high < nums.length ;high++){
            sum = sum +nums[high];

            while(sum>=target){
                int length = high-low+1;
                minLength=Math.min(length,minLength);

                sum=sum-nums[low];
                low++;
            }

          }
          return minLength== Integer.MAX_VALUE?0:minLength;

    }
    
}
