// longest common subsequence

public class lcs {
    public static void main(String[] args) {
        String text1= "abcde";
        String text2 = "ace";
        System.out.println(longestCommonSubsequence(text1, text2));
    }
    static int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m =  text2.length();

        return  fun(text1, text2, n, m, 0, 0);
        
    }
    static int fun (String text1 , String text2 , int n , int m , int i , int j){
        if(i==n || j==m ){
            return 0;
        }
        if(text1.charAt(i)==text2.charAt(j)){
            return 1+ fun(text1, text2, n, m, i+1, j+1);
        }
        int c1 = fun(text1, text2, n, m, i, j+1);
        int c2 = fun(text1, text2, n, m, i+1, j);

        return  Math.max(c1,c2);
    }
}
