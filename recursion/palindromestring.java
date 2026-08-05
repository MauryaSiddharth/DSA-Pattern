package recursion;

public class palindromestring {
    public static void main(String[] args) {
        String s = "abba";
        int i  =0;
        int j = s.length()-1;
        System.out.println(isPalindrome(s, i, j));
    }
    static boolean isPalindrome(String s,int i , int j){
        if (i >= j) {
         return true;
     }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
          return    isPalindrome(s, i+1, j-1);

      
    }

   
}
