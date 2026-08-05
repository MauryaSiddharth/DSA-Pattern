public class r1{
    public static void main(String[] args){
        // System.out.println(sum(687));
        int [] arr = {7,4,9,10,11,5,6};
        int idx = 0;
        System.out.println(check(arr, idx));
// https://www.youtube.com/watch?v=T88t25Lv82c 

    }
    static int sum(int n){ // sum of number
        if(n==0){
            return 0;
        }
        int m = n%10;
        // int p = n/10;
        int ans = m+sum(n/10);
        return ans ;

    }

    // check if aray is sorted

    static boolean check(int [] arr,int idx){ 
         if(idx>= arr.length-1){
            return true;
         }    
        
        if(arr[idx]>arr[idx+1]){
                return false;
            }
 
         
      return  check(arr, idx+1);
    }

//     remove all occurence of string  21



}