//  longest common subsequence tabualtion 

import java.util.ArrayList;

public class lcmt {
    public static void main(String[] args) {
        String text1= "abcde";
        String text2 = "ace";
        System.out.println(longestCommonSubsequence(text1, text2));
    }
    static int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m =  text2.length();
       ArrayList<ArrayList<Integer>>dp = new ArrayList<>(n+1);
       for(int i = 0; i<=n;i++){
        ArrayList<Integer>t = new ArrayList<>(m+1);
        for(int j = 0;j<=m;j++){
            t.add(-1);
        }
        dp.add(t);
       }
        
       return fun(text1,text2,n,m,0,0,dp);
        
    }
    static int fun(String text1 , String text2 , int n , int m, int i , int j ,ArrayList<ArrayList<Integer>>dp){
        for(int k = 0;k<=n;k++){
            dp.get(k).set(m,0);
        }    
        for(int l =0;l<=m;l++ ){
            dp.get(n).set(l,0);
        }
       for(int x =n-1;x>=0;x--){
        for(int y=m-1;y>=0;y--){
               if(text1.charAt(x)==text2.charAt(y)){
            dp.get(x).set(y,1+dp.get(x+1).get(y+1));
        }
        else{
            int c1 = dp.get(x).get(y+1);
            int c2= dp.get(x+1).get(y);
            dp.get(x).set(y,Math.max(c1,c2));
        }
        }
       }
       return dp.get(0).get(0);
    }
    
}




AI ROADMAP