import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intervallistintersection{
    public static void main(String[] args) {
        int[] [] firstList={
            {0,2},
            {5,10},
            {13,23},
            {24,25},

        };

        int[] [] secondList={
            {1,5},
            {8,12},
            {15,24},
            {25,26}
        };

        // op= [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]

        int [] []result = intervalIntersection(firstList, secondList);
        for(int []interval:result){
            System.out.println(Arrays.toString(interval));
        }
    }

     static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List <int [] > res= new ArrayList<>();

      int i =0;
      int j=0;

      while(i<firstList.length && j < secondList.length){
        int start1 = firstList[i][0];
        int end1 = firstList[i][1];

        int start2 = secondList[j][0];
        int end2= secondList[j][1];

        int low= Math.max(start1,start2);
        int high= Math.min(end1, end2);

       if(low<=high){
        res.add(new int[] {low,high});

       }

         if (end1 < end2) {
                i++;
            } else {
                j++;
            }

      }

      return res.toArray(new int[res.size()][]);
        
    }
}
// Time Complexity: O(m + n)
// Space Complexity: O(k)