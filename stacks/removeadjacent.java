// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
// A String is immutable in Java, so you cannot append characters to it use StringBuilder
import java.util.Stack;

public class removeadjacent{
    public static void main(String[] args) {
        String s = "abbaca";
           System.out.println(removeDuplicates(s));
    }
      static String removeDuplicates(String s) {
        Stack<Character>stack = new Stack<>();
        int n = s.length();
          StringBuilder res = new StringBuilder();
        for(int i =0 ; i < n;i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;

            }

            if(stack.peek() == s.charAt(i)){
                   stack.pop();
                   continue;
            }

            else{
                stack.push(s.charAt(i));
            }
        }
        
        
        while(!stack.isEmpty()){
            res.append(stack.peek());   
            stack.pop();
        }
        res.reverse();
        return res.toString();
    }
}