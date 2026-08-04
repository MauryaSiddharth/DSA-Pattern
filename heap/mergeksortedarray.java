import java.util.ArrayList;
// https://www.geeksforgeeks.org/problems/merge-k-sorted-arrays/1
import java.util.PriorityQueue;

class Node {
            int value;
            int row;
            int col;

            Node(int value, int row, int col) {
                this.value = value;
                this.row = row;
                this.col = col;
            }
        }
public class mergeksortedarray {
    public static void main(String[] args) {
        int [][] mat ={
            {1,3,5,7},
            {2,4,6,8},
            {0,9,10,11},

        };
        System.out.println(mergeArrays(mat));
        
        
    }
     static ArrayList<Integer> mergeArrays(int[][] mat) {

        int k = mat.length;
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->a.value-b.value);
        for(int i  =0 ; i < k;i++){
           if(mat[i].length>0){
             pq.offer(new Node(mat[i][0], i ,0));   // 0 index of all elements i th row 0 value
           }
             
        }

                ArrayList<Integer> ans = new ArrayList<>();
                while (!pq.isEmpty()) {
                    Node curr = pq.poll();
                    ans.add(curr.value);

                    if(curr.col+1<mat[curr.row].length){
                        pq.offer(new Node(mat[curr.row][curr.col+1],curr.row,curr.col+1));


                    }
                    
                }

      return ans;


    }
}
