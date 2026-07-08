import java.util.HashMap;
import java.util.Map;

public class maxballoon {
    public static void main(String[] args) {
        // String text = "nlaebolko"; // op=1
        String text= "balloonaballoon";

        System.out.println(maxNumberOfBalloons(text));
    }
    static int maxNumberOfBalloons(String text) {
        String text2 = "balloon";
         HashMap<Character,Integer> have = new HashMap<>();
        HashMap<Character,Integer> needed = new HashMap<>();

        for(int i =0;i <text.length();i++){
            char ch = text.charAt(i);
            have.put(ch,have.getOrDefault(ch, 0)+1);
        }

        for(int i = 0 ; i < text2.length();i++){
            char ch = text2.charAt(i);
            needed.put(ch , needed.getOrDefault(ch,0 )+1);
        }

        return fun(have,needed);
    }
     static int fun(HashMap<Character, Integer> have,
               HashMap<Character, Integer> needed) {

    int ans = Integer.MAX_VALUE;

    for (Map.Entry<Character, Integer> entry : needed.entrySet()) {

        char c = entry.getKey();
        int neededFreq = entry.getValue();
        int haveFreq = have.getOrDefault(c, 0);

        ans = Math.min(ans, haveFreq / neededFreq);
    }

    return ans;
}
    
}
