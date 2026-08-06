import java.util.ArrayList;
import java.util.List;

public class generateparenthesis{
    public static void main(String[] args) {
        int n =  3;
         System.out.println(generateParenthesis(n));
    }
     static  List<String> generateParenthesis(int n) {
         List<String> listname = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        fun(0, 0, temp, n, listname);

        return listname;
        
    }

    static void fun (int  open , int close,StringBuilder temp,int n,List<String> listname){

        if(open == n && close == n){
            listname.add(temp.toString());
            return;
        }

         // open 
         if(open<n){
            temp.append('(');
            fun(open+1,close,temp,n,listname);
           temp.deleteCharAt(temp.length() - 1); // reverse back to second option
         } 

        //   close
        if(close<open){
            temp.append(')');
            fun(open,close+1,temp,n , listname);
            temp.deleteCharAt(temp.length() - 1);

        }
        return ;

    }
}