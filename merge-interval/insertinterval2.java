import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  It is opitmized version of insertinterval beacuase wr dont use sorting

public class insertinterval2{
    public static void main(String[] args){
          int [] [] intervals ={
            {1,3},
            {6,9},
        };

        int [] newInterval= {2,5};
        int [] [] result = insertInterval(intervals, newInterval);

        for(int []interval:result){
            System.out.println(Arrays.toString(interval));
        }

    }
    static int[][] insertInterval(int[][] intervals, int[] newInterval) {

    boolean insert = false;
    int n = intervals.length;
    List<int[]> res = new ArrayList<>();

    for (int i = 0; i < n; i++) {

        if (!insert && intervals[i][0] > newInterval[0]) {
            res.add(newInterval);
            insert = true;
        }

        res.add(intervals[i]);
    }

    if (!insert) {
        res.add(newInterval);
    }
  
      List<int []> list = new ArrayList<>();

      int start1 = res.get(0)[0];
      int end1 = res.get(0)[1];

      for(int i =1 ; i < res.size();i++){
        int start2 = res.get(i)[0];
        int end2= res.get(i)[1];

        if(end1>=start2){
            
            end1= Math.max(end1, end2);
            continue;
        }
        else{
            list.add(new int []{start1,end1});
            start1=start2;
            end1=end2;
        }
      
      }
  list.add(new int[]{start1,end1});
    return list.toArray(new int[list.size()][]);
}
}