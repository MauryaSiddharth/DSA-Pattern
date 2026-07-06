import java.util.HashMap;

public class firstuniquecharacter{
    public static void main(String[] args) {
        // String s = "aabb";
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
        
    }
     static int firstUniqChar(String s) {
        int length = s.length();
        HashMap<Character,Integer> freq= new HashMap<>();
        for(int i =0 ; i < length ; i++){  // storing in hashmap
            char ch = s.charAt(i);
            freq.put(ch,freq.getOrDefault(ch, 0)+1);
 
        }
     for (int i = 0; i < s.length(); i++) {
    if (freq.get(s.charAt(i)) == 1) {
        return i;
    }
}

        return -1;

        
    }
}