package recursion;
// fibonaci(N)= fibonaci(n-1)+fibonaci(n-2)
public class fibonaci {
    public static void main(String[] args) {
        System.out.println(fibo(3));
        
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }
    
}
