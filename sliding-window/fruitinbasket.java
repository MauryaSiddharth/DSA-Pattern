// https://leetcode.com/problems/fruit-into-baskets/description/

import java.util.HashMap;
import java.util.Map;

public class fruitinbasket {
    // find longest subarray which have atmost 2 distinct number
    public static void main(String[] args) {
        int [] fruits={1,2,1};
        System.out.println(totalFruit(fruits));
        
    }
    //  interview question amazon
    static int totalFruit(int [] fruits){
        int low =0;
        Map<Integer,Integer> freq= new HashMap<>();
        int maxLen =-1;
        for(int high =0; high<fruits.length;high++){
           freq.put(fruits[high],freq.getOrDefault(fruits[high], 0)+1);

           if(freq.size() > 2){
            int leftFruit= fruits[low];
            freq.put(leftFruit,freq.get(leftFruit)-1 );
            if(freq.get(leftFruit)==0){
                freq.remove(leftFruit); 
            }
             low++;
           }
              maxLen= Math.max(maxLen,high-low+1);

        }
           return maxLen;

    }
}
