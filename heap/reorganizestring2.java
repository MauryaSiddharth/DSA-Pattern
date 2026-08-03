import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class reorganizestring2 {
    public static void main(String[] args) {
         String s ="aab";
        System.out.println(reorganizeString(s));

    }
  static String reorganizeString(String s){
    HashMap<Character,Integer> map =new HashMap<>();
    for(char ch :s.toCharArray()){
        map.put(ch,map.getOrDefault(ch, 0)+1);
    }
         StringBuilder sb = new StringBuilder();
         PriorityQueue<Character> maxHeap = new PriorityQueue<>((Collections.reverseOrder()));
         maxHeap.addAll(map.keySet());

         while(maxHeap.size()>1){
            Character firstChar = maxHeap.poll();
            sb.append(firstChar);
            map.put(firstChar,map.get(firstChar)-1);

            Character secondChar = maxHeap.poll();
            sb.append(secondChar);
            map.put(secondChar, map.get(secondChar)-1);

            if(map.get(firstChar)>0){
                maxHeap.add(firstChar);
            }
            if(map.get(secondChar) >0){
                maxHeap.add(secondChar);
            }
         }

         if(!maxHeap.isEmpty()){
            if(map.get(maxHeap.peek())>1){
                return "";
            }
            else{
                sb.append(maxHeap.peek());
            }

         }
         return sb.toString();
    }
}
// TC nlogn