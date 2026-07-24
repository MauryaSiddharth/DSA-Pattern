// https://www.geeksforgeeks.org/problems/ceil-in-a-sorted-array/1

public class ceil {
    public static void main(String[] args) {
        int [] arr = {1, 2, 8, 10, 11, 12, 19};
        int x  = 25;
        System.out.println(findceil(arr, x));
        
    }
    static int findceil(int [] arr , int x){
        int low =0 ; 
        int high= arr.length-1;
        int result = -1;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]<x){
                low = mid+1;

            }
            else{
                result=mid;
                high = mid-1;
            }

        }
        return result;
    }
}
