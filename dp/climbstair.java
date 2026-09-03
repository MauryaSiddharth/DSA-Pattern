import java.util.HashMap;

public class climbstair{
    static HashMap<Integer,Integer> dp = new HashMap<>();
    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbStairs(n));
    }
    static int climbStairs(int n) {
        dp.clear();
        int ans = fun (0,n);
        return ans;
        
    }
    static int fun(int i ,int n ){
        if(i==n){
            return 1;
        }
        if(i>n){
            return 0;
        }


         if(dp.containsKey(i)){
            return dp.get(i);
        }

        int a1 = fun(i+1,n);
        int a2= fun(i+2,n);
        int ans = a1+a2;

        dp.put(i, ans);
        return ans ;

    }
}