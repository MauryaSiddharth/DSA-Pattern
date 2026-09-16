import java.util.ArrayList;

public class fractionalknapsack {
    public static void main(String[] args) {
        int [] wt = {10,20,30};
        int [] value = {60,100,12};
        int max = 50;
        
    }

    static int fractional(int [] wt, int[] value, int max){
        ArrayList<Integer>t = new ArrayList<>();
        int curr = 0;
        int i = 0 ;
        int j = 0;

       while(i<wt.length && j < value.length){
         if(curr<max){
                curr+=wt[i];
                t.add(value[i]);
                max = max -curr;
                i++;
                j++;
            }
            else{
                int rem = (max*value[j]))
            }

       }


        return 0;
    }


    
}
