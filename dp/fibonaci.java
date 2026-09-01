import java.util.HashMap;

public class fibonaci {
    static HashMap<Integer,Integer>dp = new HashMap<>();
    public static void main(String[] args){
        System.out.println(fib(40));

    }
    static int fib(int n){
        if(n==0 || n ==1){
            return n ;
        }
        if(dp.containsKey(n)){
            return dp.get(n);
        }
        int result = fib(n-1)+fib(n-2);

        dp.put(n, result);
        return result;
    }
}