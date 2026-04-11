// 424. Longest Repeating Character Replacement 
public class characterreplacement {
    public static void main(String[] args) {
        String s ="ABAB";
        int k =2;
        System.out.println(characterReplacement(s, k));
        
    }
    static int characterReplacement(String s,int k){
        int [] freq= new int[26];
        int low = 0;
        int maxWindow =0;
        int maxFreq =0;

        for(int high =0; high < s.length();high++){
                //   update the frequency of current character
                freq[s.charAt(high)-'A']++;

                //  update the max Frequency
                maxFreq = Math.max(maxFreq, freq[s.charAt(high)-'A']);

                int windowLength = high-low +1;

                if(windowLength-maxFreq>k){
                   freq[s.charAt(low)-'A']--;
                    low++;
                }

                windowLength=high-low+1;
                maxWindow  = Math.max(windowLength,maxWindow);

        }
        return maxWindow;
    }
}
