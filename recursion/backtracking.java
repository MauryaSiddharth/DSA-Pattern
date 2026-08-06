
import java.util.ArrayList;
import java.util.List;

public class backtracking {
        public static void main(String[] args) {
                int [] arr ={1,2,3,4};
            printsubset(arr, 0, new ArrayList<>());   
     }    

        static void printsubset(int []arr,int index,List<Integer> subset){
            if(index==arr.length){ //base condition
                System.out.println(subset);
                return;
            }

            printsubset(arr, index+1, subset);  // dont take current element
            //  take the current element
            subset.add(arr[index]);
             printsubset(arr, index+1, subset);
            //  Backtrack
             subset.remove(Integer.valueOf(arr[index]));
            //  subset.remove(subset.size() - 1);
             return;
             

        }
    }


// void backtrack(parameters) {

//     // Base Case
//     if (baseCase) {
//         // Process answer
//         return;
//     }

//     // Try all possible choices
//     for (each choice) {

//         // 1. Make Choice
//         choose();

//         // 2. Recursive Call
//         backtrack(updatedParameters);

//         // 3. Undo Choice (Backtracking)
//         unchoose();
//     }
// }