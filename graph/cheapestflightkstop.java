import java.lang.reflect.Array;
import java.util.ArrayList;

public class cheapestflightkstop{
    static class Pair{
        int a ;
        int b ;
        Pair(int a , int b){
            this.a = a;
            this.b = b;
        }
    }
    public static void main(String[] args) {
        int n = 3;
        int[][] flights={
            {0,1,100},
            {1,2,100},
            {0,2,500},
        };
        int src = 0;
        int dst = 2; 
        int k = 0;

        int ans = findCheapestPrice(n, flights, src, dst, k);
        System.out.println(ans);
        
    }
     static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
     
       ArrayList<Integer> res = new ArrayList<>();
       for(int i = 0; i < n ; i++){
        res.add((int)1e8);
       }
       res.set(src,0);

 
        
        for(int i = 0; i <=k ;i++){
            ArrayList<Integer>temp = new ArrayList<>(res);
            for(int j = 0; j<flights.length;j++){
         int s = flights[j][0];
            int d = flights[j][1];
            int p = flights [j][2];
              if(res.get(s)!=(int)1e8 && temp.get(d)>res.get(s)+p){
                temp.set(d, res.get(s)+p);
              }
            }
           
           res=temp;
        }
 
        if(res.get(dst)==(int)1e8){
        return -1;
       }

       return res.get(dst);

        
    }
}