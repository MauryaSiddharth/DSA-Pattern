import java.util.Arrays;

public class meetingroom {
    public static void main(String[] args) {
        int [] start={1,10,7};
        int [] end = {4,15,10};

        int ans = minMeetingRooms(start, end);
        System.out.println(ans);


    }
      static int minMeetingRooms(int[] start, int[] end) {
       
      int n = start.length;
      Arrays.sort(start);
      Arrays.sort(end);

      int room =0;
      int res =0;

      int i =0;
      int j =0;

      while(i < n && j<n){
        if(start[i]<end[j]){
            room++;
            res=Math.max(res,room);
            i++;
        }
        else{
            room--;
            j++;
        }
      }
      return res;

        
      }
    }

    // complexity (o(nlogn));
    // //  time ke hisab se solve hoga

    // space :o(1);

    // entry hoga resource increase
    // exit hoga resource nikalo