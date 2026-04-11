import java.util.*;
public class TripletSmallerSum {
     public static void main(String[] args) {
         int [] arr = {-2,0,1,3};
         int target=2;   
         System.out.println(triplet(arr, target));
     }
     //  time complexity o(n^2) and space : o(1)
     static int triplet (int [] arr, int target){
          Arrays.sort(arr);
             int ans =0;
          for(int i=0; i< arr.length-2;i++ ){
               int left = i+1;
               int right = arr.length-1;
              

               while(left<right){
                    int sum = arr[i]+arr[left]+arr[right];
                    if(sum>=target){
                         right--;
                    }
                    else{
                    ans =ans +(right-left);
                         left++;
                    }
               }
               
          }
         return ans;
     }
}
