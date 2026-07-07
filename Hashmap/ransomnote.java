import java.util.HashMap;
import java.util.Map;

public class ransomnote {
    public static void main(String[] args) {
        String ransomNote="ab";
        String magazine="aba";
        System.out.println(canConstruct(ransomNote, magazine));
        
    }
    static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> have = new HashMap<>();
        HashMap<Character,Integer> needed = new HashMap<>();

        for(int i =0 ; i < ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            needed.put(ch, needed.getOrDefault(ch, 0)+1);

        }

        for(int i = 0; i < magazine.length();i++){
            char ch = magazine.charAt(i);
            have.put(ch,have.getOrDefault(ch,0 )+1);
        }

     return  fun(have,needed);
        
        
    }
 static boolean fun(HashMap<Character, Integer> have,
                   HashMap<Character, Integer> needed) {

    for (Map.Entry<Character, Integer> entry : needed.entrySet()) {
        char c = entry.getKey();
        int fneeded = entry.getValue();
        int fhave = have.getOrDefault(c, 0);

        if (fhave < fneeded) {
            return false;
        }
    }

    return true;
}

    
}


// static boolean canConstruct(String ransomNote, String magazine) {
//     HashMap<Character, Integer> map = new HashMap<>();

//     for (char c : magazine.toCharArray()) {
//         map.put(c, map.getOrDefault(c, 0) + 1);
//     }

//     for (char c : ransomNote.toCharArray()) {
//         if (map.getOrDefault(c, 0) == 0) {
//             return false;
//         }
//         map.put(c, map.get(c) - 1);
//     }

//     return true;
// }