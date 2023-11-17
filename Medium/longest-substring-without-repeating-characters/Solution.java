import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int i = 0;

        for (int j = 0; j < length; j++) {
            while (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            }

            set.add(s.charAt(j));
            maxLength = Math.max(maxLength, j - i + 1);
        }

        return maxLength;
    }
}