import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5};
        
        int target= 7;
       System.out.println(Arrays.toString(indices(arr,target)));
    }

    public static int[] indices(int[] arr, int target){
        int i =0;
        int j=arr.length-1;
            
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum==target){
            return new int []{i,j};
            }

            if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int []{};
    }
}

// two pointer in this work only when array is sorted so we have to sort it first