public class maxsubarraygfg{
    public static void main(String[] args) {
        //    maximum sum of subarray size k;
        int [] arr = {100,200,300,400};
        int k = 2;
        System.out.println(maxSubarraySum(arr, k));
       
    }
    //  time complexity ;o(n)  space:o(1)
    static int  maxSubarraySum(int [] arr,int k){
        int low =0;
        int high = k-1;    // k-1 because index start from 0;
        int sum =0;
        int  maxsum =0;
        for(int i = low ; i <=high;i++){
            sum= sum+arr[i];
        }
        
        while(high < arr.length){
            maxsum= Math.max(sum,maxsum);
            low++;
            high++;
             if(high==arr.length){
                break;
            }
            sum = sum-arr[low-1];   // if high is last index
           
            sum = sum+arr[high];
        }
  return maxsum;

    }
}