package sliding_window;


import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters3 {
    public static void main(String[] args) {

        String string = "abccdec";

        int ans = lengthOfLongestSubstring(string);
        System.out.println(ans);
    }
    public static int lengthOfLongestSubstring(String s) {

        Set<Character> charSet = new HashSet<>();
        int left = 0 ;
        int maxLength = 0 ;

        for(int right = 0 ; right<s.length(); right++)
        {
            while (charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            maxLength=Math.max(maxLength, right-left+1);
        }
      return maxLength;
    }
}
