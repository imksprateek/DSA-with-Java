package Problems.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWIthoutRepeatingCharacters_Leetcode3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static String lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s;
        }

        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        int startIndex = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;
            }

            map.put(c, right);

            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                startIndex = left;
            }
        }

        return s.substring(startIndex, startIndex + maxLen);
    }
}
