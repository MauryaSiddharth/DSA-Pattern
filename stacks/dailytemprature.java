import java.util.Arrays;
import java.util.Stack;

public class dailytemprature {
    public static void main(String[] args) {
        int [] tempratures= {73,74,75,71,69,72,76,73};
        int [] ans = dailyTemperatures( tempratures);
        System.out.println(Arrays.toString(ans));

    
    }
//  we are pushing index in stack
     static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer>st= new Stack<>();
        int[]res = new int[n];
        res[n-1]=0;
        st.push(n-1);  // pushed n-1 index to stack
        for(int i = n-2; i>=0 ; i--){
            while (!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]) {
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=0;
            }
            else{
                res[i]= st.peek()-i;
            }

            st.push(i);

        }
 return res;
        
    }
    
}
