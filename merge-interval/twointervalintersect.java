import java.util.Arrays;

public class twointervalintersect{
    // https://www.geeksforgeeks.org/dsa/check-if-any-two-intervals-overlap-among-a-given-set-of-intervals/
     public static void main(String[] args) {
        
    //      int [][] arr ={
    //     {1,3},
    //     {5,7},
    //     {2,4},
    //     {6,8}
    // }; 

    int[][] arr={
        {1,3},
        {7,9},
        {4,6},
        {10,13},
    };

    boolean ans = check(arr);
    System.out.println(ans);


     }
   
     static boolean check(int[][] arr) {
    Arrays.sort(arr, (x, y) -> Integer.compare(x[0], y[0]));

    int end1 = arr[0][1];

    for (int i = 1; i < arr.length; i++) {
        int start2 = arr[i][0];
        int end2 = arr[i][1];

        if (end1 > start2) {   // overlap exists
            return true;
        }

        end1 = end2;   // move to the next interval
    }

    return false;
}

 
}