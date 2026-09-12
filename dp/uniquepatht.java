//   unique path tabulation 

import java.util.ArrayList;

public class uniquepatht {
    public static void main(String[] args) {
         int m = 3;
        int n = 7;

        System.out.println(uniquepath(m,n));
    }
    static int uniquepath(int m,int n){
         ArrayList<ArrayList<Integer>> dp = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            ArrayList<Integer> t = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                t.add(-1);
            }

            dp.add(t);
        }

        return fun(m, n, 0, 0, dp);
    }
   static int fun(int m ,int n ,int i , int j,ArrayList<ArrayList<Integer>>dp){

       dp.get(m-1).set(n-1,1);

    for (int k = 0; k < n - 1; k++) {
         dp.get(m - 1).set(k, 1); 
        }

        for (int l = 0; l < m - 1; l++) {
             dp.get(l).set(n - 1, 1);
             }

    for(int x=m-2;x>=0;x--){
        for(int y=n-2;y>=0;y--){
            dp.get(x).set(y,dp.get(x+1).get(y)+dp.get(x).get(y+1));
        }
    }

    return dp.get(0).get(0);//jo value pass hogi recursion me (means aap jaha pe khade  the..)

    }
}
