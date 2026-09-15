import java.util.ArrayList;
        //   similar to stock 3 
public class stock4 {
    public static void main(String[] args) {
        int [] prices = {3,2,6,5,0,3};
        int k = 2;
        System.out.println(maxProfit(prices, k));
        
    }
        static  int maxProfit(int[] prices,int k) {
         int n = prices.length;
         int l = k*2;
         ArrayList<ArrayList<Integer>>dp = new ArrayList<>(n+1);
         for(int i = 0; i<= n ; i++){
            ArrayList<Integer>t = new ArrayList<>(k+1);
            for(int j = 0;j<=l;j++){
                t.add(-1);

            }
            dp.add(t);
         }
         return  fun(prices, n, 0, l,dp);
    }
     static int fun(int [] prices, int n , int i , int l,ArrayList<ArrayList<Integer>>dp){
        if(i==n){
            return 0;
        }
        if(l==0){
            return 0;
        }
        if(dp.get(i).get(l)!=-1){
            return dp.get(i).get(l);

        }
        int ans ;
        if(l%2==0){
            int c1 = fun(prices, n, i+1, l-1, dp)-prices[i];
            int c2 = fun(prices, n, i+1, l, dp);
             ans = Math.max(c1,c2);
 
        }
        else{
            int c1 = fun(prices, n, i+1, l-1, dp)+prices[i];
            int c2 = fun(prices, n, i+1, l, dp);
             ans = Math.max(c1,c2);
            
        }
        dp.get(i).set(l,ans);
        return ans;

     }
    
}
