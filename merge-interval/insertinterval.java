import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class insertinterval{
    public static void main (String[] args){
        int [] [] intervals ={
            {1,3},
            {6,9},
        };

        int [] newInterval= {2,5};
        
        int [] [] result = insertInterval(intervals, newInterval);
        for(int [] interval:result){
            System.out.println(Arrays.toString(interval));
        }
    }

  
    static int[][] insertInterval(int[][] intervals, int[] newInterval) {

        List < int []> list = new ArrayList<>();

            for(int[] interval : intervals){
                list.add(interval);
            }

            list.add(newInterval);

            Collections.sort(list,(a,b)->Integer.compare(a[0],b[0]));


            List<int []> res = new ArrayList<>();

      int start1 = list.get(0)[0];
      int end1 = list.get(0)[1];

      for(int i = 1 ; i< list.size();i++){
        int start2 = list.get(i)[0];
        int end2 = list.get(i)[1];

        if(end1>=start2){
            start1 = start1;
            end1= Math.max(end1,end2);
            continue;
        }
        else{
            res.add(new int[]{start1,end1});
            start1=start2;
            end1=end2;
        }

        res.add(new int[]{start1,end1});
      }
      return res.toArray(new int[res.size()][]);
}
}