import java.util.ArrayList;

public class stock1 {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
     static  int maxProfit(int[] prices) {
         int n = prices.length;
         return  fun(prices, n, 0, 2);
    }
    static int fun(int [] prices, int n , int i , int k){
       
        if(i==n) return  0;
        if(k==0) return  0;

        
        if(k==2){ //buy
          int c1 = fun(prices, n, i+1, k-1)-prices[i];
          int c2 = fun(prices , n , i+1,k);
        
          return Math.max(c1,c2);
        }
        else{ // sell
            int c1= fun(prices, n, i+1, k-1)+prices[i];
            int c2 = fun(prices, n, i+1, k);
           
            return Math.max(c1,c2);

        }




    }
}
