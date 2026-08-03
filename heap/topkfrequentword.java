import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Pair {
    int first;   // frequency
    String second;  // element

    Pair(int f, String s) {
        first = f;
        second = s;
    }
}


public class topkfrequentword {
    public static void main(String[] args) {
        String [] words= {"i","love","leetcode","i","love","coding"};
        int k = 2;

        List<String>ans = topKFrequent(words, k);

        for (String x : ans) {
            System.out.print(x + " ");
        }

        
    }
    static List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> freqMap = new HashMap<>();
        for(String word:words){
            freqMap.put(word,freqMap.getOrDefault(word, 0)+1);
        }

         PriorityQueue<Pair> pq = new PriorityQueue<>(
    (a, b) -> {
        // If frequencies are different, sort by frequency (ascending)
        if (a.first != b.first) {
            return Integer.compare(a.first, b.first);
        }
        // If frequencies are equal, sort alphabetically (descending)
        return b.second.compareTo(a.second);
    }
);

 for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
    Pair curr = new Pair(entry.getValue(), entry.getKey());

    if (pq.size() < k) {
        pq.offer(curr);
    } else {
        Pair top = pq.peek();

        if (curr.first > top.first ||
            (curr.first == top.first &&
             curr.second.compareTo(top.second) < 0)) {

            pq.poll();
            pq.offer(curr);
        }
    }
}
  List<String> res = new java.util.ArrayList<>();
 while(!pq.isEmpty()){
    res.add(0, pq.poll().second);   // heap se nikalo and 0 index pe daldo
 }
        return res;
    }
}
