import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class basic {
    public static void main(String[] args) {
                //  MIN HEAP  
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(30);
        minHeap.offer(10);
        minHeap.offer(20);
        minHeap.offer(5);

        System.out.println(minHeap.peek());  // return 5 top 
        System.out.println();
        System.out.println(minHeap.size());

        while(!minHeap.isEmpty()){
            System.out.print(minHeap.poll() + " ");  // poll : Retrieves and removes the head of this queue, or returns null if this queue is empty.
        }

    //    ------------------------------------------------          
                        //    MAX HEAP
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            maxHeap.offer(30);
            maxHeap.offer(20);
            maxHeap.offer(5);
            maxHeap.offer(10);
            
              
            System.out.println();
            System.out.println(maxHeap.peek());   /// return30
             System.out.println();
            while (!maxHeap.isEmpty()) {
                System.out.print(maxHeap.poll()+ " ");
                
            }
            
          while (!maxHeap.isEmpty()) {
                System.out.print(maxHeap.poll()+ " ");
                
            }
    }
}
