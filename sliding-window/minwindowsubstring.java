// https://leetcode.com/problems/minimum-window-substring/description/ 
public class minwindowsubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t= "ABC";
        System.out.println(minWindow(s, t));
   
    }

    static String minWindow(String s , String t){
        int[] mapS= new int[256];    // 256 because ascii character
        int [] mapT = new int[256];

        for(char ch : t.toCharArray()) mapT[ch]++;  // isme t ko character array me toda and mapt[ch]++ frequency count badha rha hai
            //   or  we can do this 
        //           for(int i = 0; i < t.length(); i++) {
//     mapT[t.charAt(i)]++;
// }
        int low =0;
        int minLen = Integer.MAX_VALUE;
        int  minStart=0;

        for(int high=0;high<s.length();high++){
            mapS[s.charAt(high)]++;

            while (contains(mapS, mapT)) {
                int length = high-low+1;
                 if(length<minLen){
                    minLen=length;
                    minStart=low;
                 }
               mapS[s.charAt(low++)]--;
            }
        }
        return minLen==Integer.MAX_VALUE? "": s.substring(minStart, minStart+minLen);
    }

    static  boolean contains(int [] mapS,int [] mapT){
        for (int i =0 ; i<256 ;i++){
             if(mapT[i]>mapS[i]){
                return false;
             }
        }
           return true;

    }
}
