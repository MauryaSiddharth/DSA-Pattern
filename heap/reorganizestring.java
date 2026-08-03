import java.util.PriorityQueue;

class pair{
    char ch ;
    int f ;
    pair(char ch , int f){
        this.ch = ch;
        this.f= f;

    }
}
public class reorganizestring{
    public static void main(String[] args){
        String s ="aab";
        System.out.println(reorganizeString(s));

    }
    static String reorganizeString(String s){
        int[] map = new int[26];

        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
        }

        PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> b.f - a.f);

        for (int i = 0; i < 26; i++) {
            if (map[i] > 0) {
                pq.offer(new pair((char) ('a' + i), map[i]));
            }
        }

        StringBuilder ans = new StringBuilder();

        pair block = pq.poll();
        ans.append(block.ch);
        block.f--;

        while (!pq.isEmpty()) {

            pair temp = pq.poll();
            ans.append(temp.ch);
            temp.f--;

            if (block.f > 0) {
                pq.offer(block);
            }

            block = temp;
        }

        if (block.f > 0) {
            return "";
        }


return ans.toString();

    }
}