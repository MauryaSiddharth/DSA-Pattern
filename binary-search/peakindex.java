// https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class peakindex {
    public static void main(String[] args) {
        // int [] arr = {0,2,5,1,0};
        // int [] arr = {0,1,0};
        // int [] arr = {0,10,5,2};
        int [] arr ={3,5,3,2,0};
        // System.out.println(peakIndex(arr));
        System.out.println(peakIndex2(arr));
    }

    static int peakIndex2(int [] arr){
      int low = 1; 
      int high = arr.length-2;
       while(low <= high){
        int mid = (low+high)/2;

        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
            return mid;
        }

        if(arr[mid]<arr[mid-1]){
            high=mid-1;
        }

        else{
            low=mid+1;
        }

       }
       return -1;
      
    }
 
    
}

//         //     brute force
//    static int peakIndex(int [] arr){
//         int max = 0;
//         int index= 0;
//         for(int i =0; i <arr.length-1;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//                 index=i;
//             }
//         }
//         return index;

//     }