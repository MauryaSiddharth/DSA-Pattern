// https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1 
import java.util.HashMap;
import java.util.Map;

                    //  further solve it bruhh!!!

public class longestsubstring{
    public static void main(String[] args) {
          String s= "aabacbebebe";
           int k =3;
         System.out.println(longestKSubstr(s, k));
    }
    //  this is solved by creating hashmap*

    static int longestKSubstr(String s, int k ){
        int low =0;
        int high =0;
        int maxLength= -1;
        //    map store the data in key value pair
        //  we use hasmap becuase it store unique value
      Map<Character, Integer> map = new HashMap<>();
      
       while(high<s.length()){
        char ch = s.charAt(high);
         map.put(ch, map.getOrDefault(ch, 0) + 1);

          // If unique characters exceed k, shrink window
            while (map.size() > k) {
                char leftChar = s.charAt(low);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                low++;
            }
                        if (map.size() == k) {
                maxLength = Math.max(maxLength, high - low + 1);
            }

            // Expand window
            high++;
        }

        return maxLength;
    }
       }
        
    
