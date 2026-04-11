public class minsubarraylen{
    public static void main(String[] args) {
        int [] arr = {2,3,1,2,4,3};
        int target =7;
        System.out.println(minsubarray(arr, target));

    }
    static int minsubarray(int []arr, int target){
        int minLength =Integer.MAX_VALUE;
        int currentSum=0;

        int low = 0;
        int high =0;

        while (high<arr.length) {
         currentSum+=arr[high];
            high++;

            while(currentSum>=target){
                int currentWindowSize= high-low;

                minLength= Math.min(minLength, currentWindowSize);

                currentSum-=arr[low];
                low++;
            }
        }
        return minLength== Integer.MAX_VALUE?0:minLength;
        
    }
}