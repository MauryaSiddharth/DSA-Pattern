public class r1{
    public static void main(String[] args){
        // System.out.println(sum(687));
        int [] arr = {7,4,9,10,11,5,6};
        int idx = 0;
        // System.out.println(check(arr, idx));
        String s = "apple";
        char ch = 'p';
        int index = 0;
        System.out.println(remove(s, ch, index));

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

//     remove all occurence of string  

  static String remove(String s, char ch , int index) {
    
    if(index == s.length()){
        return "";
    }

   char current = s.charAt(index);

   if(current==ch){
    return remove(s, ch, index+1);
   }

   return current+remove(s, ch, index+1);

  }



}