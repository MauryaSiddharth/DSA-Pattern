// https://leetcode.com/problems/koko-eating-bananas/description/
public class kokobanana{
    public static void main(String[] args) {
        int [] piles = {3,6,7,11};
        int h = 8;
        System.out.println(koko(piles, h));
        // compleixty :o (nlogN)
    }

      static int koko(int [] piles , int h){  //// complexity o(logN)
        int low = 1;
        int n = piles.length;
        int high = piles[0];
        for(int pile:piles){
            if(pile>high){
                high = pile;
            }
        }
        int res = -1;

        while(low<=high){
            int mid = low + (high - low) / 2;
            long hour = fun(piles, n, mid);   
            if(hour>h){
                low = mid+1;
            }
            else{
                res= mid;
                high = mid-1;
            }
        }

 return res;

          
    }
    //  minimum hour to eat banana 

   static long fun(int[] piles, int n, int speed) {
    long hours = 0;

    for (int i = 0; i < n; i++) {
        hours += piles[i] / speed;

        if (piles[i] % speed != 0) {
            hours++;
        }
    }

    return hours;
}
}