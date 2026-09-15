import java.util.ArrayList;

public class stock3 {
    public static void main(String[] args) {
        int [] prices = {3,3,5,0,0,3,1,4};
        System.out.println( maxProfit(prices));
    }
     static  int maxProfit(int[] prices) {
         int n = prices.length;
         int k = 4;
         ArrayList<ArrayList<Integer>>dp = new ArrayList<>(n+1);
         for(int i = 0; i<= n ; i++){
            ArrayList<Integer>t = new ArrayList<>(k+1);
            for(int j = 0;j<=k;j++){
                t.add(-1);

            }
            dp.add(t);
         }
         return  fun(prices, n, 0, k,dp);
    }
     static int fun(int [] prices, int n , int i , int k,ArrayList<ArrayList<Integer>>dp){
        if(i==n){
            return 0;
        }
        if(k==0){
            return 0;
        }
        if(dp.get(i).get(k)!=-1){
            return dp.get(i).get(k);

        }
        int ans ;
        if(k%2==0){
            int c1 = fun(prices, n, i+1, k-1, dp)-prices[i];
            int c2 = fun(prices, n, i+1, k, dp);
             ans = Math.max(c1,c2);
 
        }
        else{
            int c1 = fun(prices, n, i+1, k-1, dp)+prices[i];
            int c2 = fun(prices, n, i+1, k, dp);
             ans = Math.max(c1,c2);
            
        }
        dp.get(i).set(k,ans);
        return ans;

     }
}

