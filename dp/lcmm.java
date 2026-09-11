// longest common  subsequence memoization 

import java.util.ArrayList;

public class lcmm {
    public static void main(String[] args) {
         String text1= "abcde";
        String text2 = "ace";
        System.out.println(longestCommonSubsequence(text1, text2));
        
    }
     static int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m =  text2.length();
       ArrayList<ArrayList<Integer>>dp = new ArrayList<>();
       for(int i = 0; i<n;i++){
        ArrayList<Integer>t = new ArrayList<>();
        for(int j = 0;j<m;j++){
            t.add(-1);
        }
        dp.add(t);
       }
        
       return fun(text1,text2,n,m,0,0,dp);
        
    }
    static int fun(String text1,String text2 ,int n, int m , int i , int j , ArrayList<ArrayList<Integer>>dp){
        if(i == n || j ==m){
            return 0;
        }
        if(dp.get(i).get(j)!=-1){
            int ans = dp.get(i).get(j);
            return ans;
        }

        if(text1.charAt(i)==text2.charAt(j)){
            int ans = 1+fun(text1, text2, n, m, i+1, j+1, dp);
            dp.get(i).set(j,ans);
            return ans;
        }
        int c1 = fun(text1, text2, n, m, i+1, j, dp);
        int c2 = fun(text1, text2, n, m, i, j+1, dp);

        int ans = Math.max(c1,c2);
        dp.get(i).set(j,ans);
        return ans;

    }
}
