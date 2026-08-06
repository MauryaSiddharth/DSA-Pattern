import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class letterphonenumber {
    public static void main(String[] args) {
        String digits  = "23";
           List<String> ans = letterCombinations(digits);
        System.out.println(ans);
        

    }
     static List<String> letterCombinations(String digits) {
           HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> listname = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        if(digits==null || digits.length()==0){
            return listname;
        }

        fun(digits, sb, digits.length(), 0, listname, map);
        return listname;

        
    }
    static void fun( String digits,StringBuilder sb,int n , int idx,List<String>listname,HashMap<Character,String>map){
        if(idx == n){
            listname.add(sb.toString());
            return;
        }

        // Get letters corresponding to current digit
        String letters = map.get(digits.charAt(idx));
        
        // Try every possible letter
        for(int i = 0; i<letters.length();i++){
            sb.append(letters.charAt(i));
            fun(digits,sb, n ,idx+1,listname,map);

            sb.deleteCharAt(sb.length()-1);

        }



    }
}
