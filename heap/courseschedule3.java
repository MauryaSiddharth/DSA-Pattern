import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class courseschedule3 {
    public static void main(String[] args) {
        int [] [] course = {
            {100,200},
            {200,1300},
            {1000,1250},
            {2000,3200},
        };
        System.out.println(scheduleCourse(course));
    }

      static  int scheduleCourse(int[][] courses) {
        int totalTime = 0;
       
          Arrays.sort(courses, (a, b) -> Integer.compare(a[1], b[1])); // this is used to compare 2d array
          PriorityQueue<Integer>max = new PriorityQueue<>(Collections.reverseOrder());

          for(int i = 0 ; i< courses.length;i++){
             int duration = courses[i][0];
              int lastDay = courses[i][1];        
              
              
            totalTime+=courses[i][0];
            max.add(courses[i][0]);

            if (totalTime > lastDay) {
            int removed = max.poll();
            totalTime -= removed;
        }
          }       
        return max.size();
        
    }
}
