// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/ 

import java.util.HashSet;
import java.util.Set;

public class withoutrepeating {
    //  LONGEST SUBSTRING WITHOUT REPEATING CHARACTER
    //  again revise this
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
        
    }
    //     following lohia approach
    static int lengthOfLongestSubstring(String s){
        Set <Character> charset = new HashSet<>();
        int low =0;
        int maxLength =0;

        for(int high =0;high<s.length();high++){
            while(charset.contains(s.charAt(high))){
           charset.remove(s.charAt(low));
            low++; 
            }


            charset.add(s.charAt(high));
            maxLength= Math.max(maxLength,high-low+1);
        }
          return maxLength;
    }
}
