import java.util.ArrayList;

public class knapsack{
    public static void main(String[] args){
        int W = 8;
        int [] val ={5,2,4};
        int [] wt = {4,5,3};
        System.out.println(knapsack(W, val, wt));

    }
    static int knapsack(int W, int val[], int wt[]) {
        int n = val.length;
        //  recursive solution
        // int ans = fun(W, val, wt, n, 0); 
        // return ans;

        //  dp solution 
        ArrayList<ArrayList<Integer>>dp = new ArrayList<>(n);
        dp.clear();
        for(int i = 0; i < n; i++){
            ArrayList<Integer>t = new ArrayList<>(W);
            for(int j = 0; j <=W;j++){
                 t.add(-1);    
            }
            dp.add(t);
        }
         return fun(W, val, wt, n, 0, dp);
        
    }
            //   dp solution 
    static int fun(int W, int val[],int wt[],int n , int i,ArrayList<ArrayList<Integer>>dp ){
        if(i==n){
            return 0;
        }
        if(dp.get(i).get(W)!=-1){
            return dp.get(i).get(W);
        }
        if(wt[i]>W){
            int ans =  fun(W,val,wt,n,i+1,dp);
            dp.get(i).set(W,ans);
            return ans;
        }

        int yes = val[i]+fun(W-wt[i],val,wt,n,i+1,dp);
        int no = fun(W, val, wt, n, i+1,dp);

           int ans2 = Math.max(yes,no);
         dp.get(i).set(W,ans2);
           return ans2;

    }

    //         Recursive solution
    // static int fun(int W, int val[],int wt[],int n , int i ){
    //     if(i==n){
    //         return 0;
    //     }
    //     if(wt[i]>W){
    //         return fun(W,val,wt,n,i+1);
    //     }

    //     int yes = val[i]+fun(W-wt[i],val,wt,n,i+1);
    //     int no = fun(W, val, wt, n, i+1);


    //     return Math.max(yes,no);


    // }
}