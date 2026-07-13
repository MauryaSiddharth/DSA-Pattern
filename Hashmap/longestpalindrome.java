import java.util.HashMap;

public class longestpalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        //  op=7;
        System.out.println(longestpalindrome(s));
    }
    static int longestpalindrome(String s){
       int n = s.length();
       HashMap<Character,Integer> map = new HashMap<>();

       for(int i = 0; i < n ;i++){
        char ch  = s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0 )+1);
       }
       int length =0;
       boolean hasOdd = false;

       for (int count:map.values()){
        if(count%2==0){
            length+=count;
        }
        else{
            length+=count-1;
            hasOdd=true;
        }
       }
       if(hasOdd){
        length++;
       }

     return length;

   
    }  
}
