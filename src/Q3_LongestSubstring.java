import java.util.HashSet;
import java.util.Set;

public class Q3_LongestSubstring {
    public static int lengthOfLongestSubstring(String str) {
        int maxLength = 0;
        int left = 0;
        int right = 0;
        Set<Character> characters = new HashSet<>();

        while (right < str.length()) {
            if (!characters.contains(str.charAt(right))) {
                characters.add(str.charAt(right));
                maxLength = Math.max(maxLength, characters.size());
                right++;
            } else {
                characters.remove(str.charAt(left));
                left++;
            }
        }

        return maxLength;
    }


}
