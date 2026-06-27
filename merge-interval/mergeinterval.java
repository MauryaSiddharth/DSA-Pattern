import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeinterval{
    public static void main(String[] args) {
     int [][] intervals= {
        {1,3},
        {2,6},
        {8,10},
        {15,18}
     }   ;

     int [] [] result = merge(intervals);
     for(int[] interval:result){
        System.out.println(Arrays.toString(interval));

     }


    }
    static int [] [] merge(int [] [] intervals){
        int n = intervals.length;
        Arrays.sort(intervals,(x,y)->Integer.compare(x[0], y[0]));

        List<int[]> res = new ArrayList<>();
        
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];

        for(int i = 1 ;i < n; i++){
            int start2=intervals[i][0];
            int end2= intervals[i][1];

            if(end1>=start2){  // merge
                start1= start1;
                end1= Math.max(end1,end2);
                continue;

            }
            else{
                res.add(new int[]{start1,end1});
                start1=start2;
                end1= end2;

            }

        }

        //  add last interval
        res.add(new int[]{start1,end1});
          
         return res.toArray(new int[res.size()][]);

    }
}