package recursion;

public class basic {
  public static void main(String[] args) {
    System.out.println(sum(4));
    int [] arr = {7,8,5,6,9,0};
    int n = arr.length;
      System.out.println(max(arr, n));
  }    
  static int sum (int n){
    if(n==1){   // base condition 
        return 1; 
    }

    int ans = sum(n-1);
    return ans +n;
  }
  
    static int max (int [] arr,int n){
      
      if(n==1){  // base case
       return arr[0];
      }

      int last = arr[n-1];
      int ans = max(arr,n-1);  // main work 

      return Math.max(last,ans);

    }
  
}

//  recursion = which part we know + we move up or down
//  divide large problem in smaller smaller task