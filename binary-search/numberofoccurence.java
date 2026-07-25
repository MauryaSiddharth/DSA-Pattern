
public class numberofoccurence {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,2,2,3};
        int target = 2;
        System.out.println(number(arr, target));

    }
    static int number(int [] arr, int target){
        int first = firstoccurence(arr, target);
        
     if (first == -1) {
        return 0; // target not found
     }
        int last = lastoccurence(arr, target);
        int count = last-first+1;
        return count;

    }
   static int firstoccurence(int []arr, int target){
        int low = 0 ;
         int high =arr.length-1;
        int result = -1;
        while(low <= high){
            int mid = (low+high)/2;
            
            if(arr[mid]<target){
                low = mid+1;

            }
            else if(arr[mid]>target){
                high=mid-1;

            }
            else{
                result = mid;
                high=mid-1;
            }
        }
       return result;
    }

    static int lastoccurence(int [] arr , int target){
        int low =0;
         int high = arr.length-1;
        int result = -1;

        while(low <= high ){
            int  mid = (low+high)/2;
            if(arr[mid]<target){
                low = mid+1;
               
            }
            else if(arr[mid]>target){
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
